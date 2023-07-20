package ec.edu.espe.arquitectura.mongo.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.mongo.examen.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa, String>{
    
}
