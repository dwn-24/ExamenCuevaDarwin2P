package ec.edu.espe.arquitectura.mongo.examen.model;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Empleados {
    private String cedula;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
    
}
