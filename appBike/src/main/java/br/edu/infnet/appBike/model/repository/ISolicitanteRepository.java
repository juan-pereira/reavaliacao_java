package br.edu.infnet.appBike.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appBike.model.negocio.Solicitante;

@Repository
public interface ISolicitanteRepository extends CrudRepository<Solicitante, Integer> {

}