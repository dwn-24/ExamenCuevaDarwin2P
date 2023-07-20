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
    private String id;
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleados> empleados;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((ruc == null) ? 0 : ruc.hashCode());
        result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
        result = prime * result + ((cuentaPrincipal == null) ? 0 : cuentaPrincipal.hashCode());
        result = prime * result + ((empleados == null) ? 0 : empleados.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empresa other = (Empresa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (ruc == null) {
            if (other.ruc != null)
                return false;
        } else if (!ruc.equals(other.ruc))
            return false;
        if (razonSocial == null) {
            if (other.razonSocial != null)
                return false;
        } else if (!razonSocial.equals(other.razonSocial))
            return false;
        if (cuentaPrincipal == null) {
            if (other.cuentaPrincipal != null)
                return false;
        } else if (!cuentaPrincipal.equals(other.cuentaPrincipal))
            return false;
        if (empleados == null) {
            if (other.empleados != null)
                return false;
        } else if (!empleados.equals(other.empleados))
            return false;
        return true;
    }

    
    
    
}
