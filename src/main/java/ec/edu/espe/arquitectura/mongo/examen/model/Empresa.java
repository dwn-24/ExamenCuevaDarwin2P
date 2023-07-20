package ec.edu.espe.arquitectura.mongo.examen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "empresa")
@CompoundIndex(name ="idx_empresa_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class Empresa {
    @Id
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleados> empleados;
    
    
}
