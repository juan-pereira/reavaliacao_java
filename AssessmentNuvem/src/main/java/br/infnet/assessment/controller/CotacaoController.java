package br.infnet.assessment.controller;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import br.infnet.assessment.domains.Cotacao;
import br.infnet.assessment.domains.Produto;
import br.infnet.assessment.services.CotacaoService;




@RestController
public class CotacaoController {

	
    private final CotacaoService cotacaoService;
    
    public CotacaoController(CotacaoService cotacaoService) {
        this.cotacaoService = cotacaoService;
    }
    
    @RequestMapping(method = {RequestMethod.GET}, value = "/cotacao/{id}")
    public Cotacao getCotacao(@PathVariable Long id){
    	return cotacaoService.getCotacao(id);
    	}
    
    @RequestMapping(method = {RequestMethod.GET}, value = "/cotacao/produto/{id}")
    public List<Cotacao> getCotacaoByIdProduto(@PathVariable long id){
    	return cotacaoService.getCotacaoByIdProduto(id);
    	}
	
    @PostMapping("/registerCotacao")
    public Cotacao register(@RequestParam String descricao, @RequestParam long idProduto, @RequestParam float preco ){
    	Produto produtoCotacao = cotacaoService.procuraProduto(idProduto);
    	
        return cotacaoService.register(descricao, produtoCotacao, preco);
    }
    
    @RequestMapping(method = {RequestMethod.PUT}, value = "/updateCotacao/{id}")
    public void update (@PathVariable Long id, @RequestBody Cotacao c){
    	cotacaoService.update(id, c);
    	}
    
    @GetMapping("/cotacoes")
    List<Cotacao> all(){
        return cotacaoService.findAll();
    }
    
    @PostMapping("/cotacoesCsv")
    public void exportarCotacoes() throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {

        Writer writer = Files.newBufferedWriter(Paths.get("cotacoes.csv"));
        StatefulBeanToCsv<Cotacao> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

        List<Cotacao> cotacoes = new ArrayList<>();
        cotacoes = cotacaoService.findAll();
        
        beanToCsv.write(cotacoes);

        writer.flush();
        writer.close();
    }
    
    
    @DeleteMapping("/excluirCotacao/{id}")
    public void excluirProduto(@PathVariable long id){
         cotacaoService.delete(id);
    }
    
    
    
    
	
}
