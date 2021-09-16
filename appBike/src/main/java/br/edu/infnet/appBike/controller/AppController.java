package br.edu.infnet.appBike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.appBike.model.service.SolicitanteService;
import br.edu.infnet.appBike.model.service.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@Autowired
	//private EmprestimoService emprestimoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String telaLogin() {
		return "login";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String telaIndex(Model model) {
		
		model.addAttribute("usuarioQtde", usuarioService.obterLista().size());
		model.addAttribute("solicitanteQtde", solicitanteService.obterLista().size());
		//model.addAttribute("emprestimoQtde",0);
		
		return "index";
		
		
	}
	
}
