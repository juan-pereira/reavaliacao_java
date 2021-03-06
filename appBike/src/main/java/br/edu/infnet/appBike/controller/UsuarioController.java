package br.edu.infnet.appBike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appBike.model.negocio.Usuario;
import br.edu.infnet.appBike.model.service.UsuarioService;


@SessionAttributes("user")
@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String Cadastro() {
		return "redirect:/usuario/lista";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {	
		usuarioService.incluir(usuario);
		
		return "redirect:/usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.excluir(id);
		
		return "redirect:/usuario/lista";
	}
	
	
	@GetMapping(value = "usuario/lista")
	public String obterLista(Model model) {

		model.addAttribute("usuarios",usuarioService.obterLista());
		
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/login")
	public String validarLogin(Model model,@RequestParam String email,@RequestParam String senha) {
		
		Usuario usuario = usuarioService.autenticacao(email,senha);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			return "redirect:/home";
		}
		return "redirect:/";
		
		
	}
}