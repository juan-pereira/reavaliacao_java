package br.edu.infnet.appBike.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appBike.model.negocio.Solicitante;
import br.edu.infnet.appBike.model.repository.ISolicitanteRepository;

@Service
public class SolicitanteService {
	
	@Autowired
	private ISolicitanteRepository solicitanteRepository;
	
	public void incluir(Solicitante solicitante) {
		solicitanteRepository.save(solicitante);
	}

	public List<Solicitante> obterLista() {	
		return (List<Solicitante>) solicitanteRepository.findAll();
	}

	public void excluir(Integer id) {
		solicitanteRepository.deleteById(id);
		
	}
}
