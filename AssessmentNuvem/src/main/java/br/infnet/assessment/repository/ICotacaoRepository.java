package br.infnet.assessment.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.infnet.assessment.domains.Cotacao;
import br.infnet.assessment.Produto;

@Repository
public interface ICotacaoRepository extends JpaRepository<Cotacao, Long> {
	
    @Query(value = "SELECT p FROM Produto p where id = :id ")  
    public Produto procurarProduto(@Param("id") long id);
    
    @Query(value = "SELECT c FROM Cotacao c where id_produto = :id  ")  
    public List<Cotacao> procurarCotacaoByIdProduto(@Param("id") long id);

	
}
