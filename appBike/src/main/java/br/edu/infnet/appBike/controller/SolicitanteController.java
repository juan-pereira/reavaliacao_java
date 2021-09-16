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

import br.edu.infnet.appBike.model.negocio.Solicitante;
import br.edu.infnet.appBike.model.negocio.Usuario;
import br.edu.infnet.appBike.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante")
	public String Cadastro() {
		return "redirect:/solicitante/lista";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante) {	
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		solicitanteService.excluir(id);
		
		return "redirect:/solicitante/lista";
	}
	
	
	@GetMapping(value = "solicitante/lista")
	public String obterLista(Model model) {

		model.addAttribute("solicitantes",solicitanteService.obterLista());
		
		return "solicitante/cadastro";
	}
}