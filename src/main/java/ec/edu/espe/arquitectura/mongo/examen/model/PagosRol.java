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
@Document(collection = "empleados")
@CompoundIndex(name ="idx_empleados_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class PagosRol {
    @Id
    private String id;
    private String mes;
    private String fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private double valorTotal;
    private double valorReal = 0;

    


}
