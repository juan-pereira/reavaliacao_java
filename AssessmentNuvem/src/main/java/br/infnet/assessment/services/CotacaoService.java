package br.infnet.assessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import br.infnet.assessment.domains.Cotacao;
import br.infnet.assessment.domains.Produto;
import br.infnet.assessment.ICotacaoRepository;

@Service
@Transactional
public class CotacaoService {
	
	@Autowired
	private ICotacaoRepository cotacaoRepo;
	
	
    public Cotacao register(String descricao, Produto produto, float preco){
        
        return this.cotacaoRepo.save(new Cotacao(descricao,produto,preco));
    }

	public void update(long id, Cotacao c) {
		c.setId(id);
		cotacaoRepo.save(c);
		
	}
	
    @Transactional(readOnly = true)
    public List<Cotacao> findAll(){
        return this.cotacaoRepo.findAll();
    }

	public void delete(long id) {
		this.cotacaoRepo.deleteById(id);
	}

	public Cotacao getCotacao(Long id) {
    	Optional<Cotacao> c = this.cotacaoRepo.findById(id);
    	return c.orElse(null);
	}
	
	public Produto procuraProduto(long id) {
		return cotacaoRepo.procurarProduto(id);
	}

	public List<Cotacao> getCotacaoByIdProduto(long id) {

		return cotacaoRepo.procurarCotacaoByIdProduto(id);
	}
    
	
}
