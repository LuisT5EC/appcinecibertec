package pe.edu.cibertec.appcinecibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "registroasiento")
public class RegistroAsiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrasiento;
    @Column(name = "idcartelera")
    private Integer idcartelera;
    @Column(name = "nroasiento")
    private Integer nroasiento;
}
