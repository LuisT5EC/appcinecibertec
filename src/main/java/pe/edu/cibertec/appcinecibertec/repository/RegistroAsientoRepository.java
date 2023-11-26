package pe.edu.cibertec.appcinecibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.appcinecibertec.model.bd.RegistroAsiento;

@Repository
public interface RegistroAsientoRepository extends
        JpaRepository<RegistroAsiento, Integer> {

    /*@Transactional
    @Modifying
    //Store Procedure que registrar información
    @Query(value = "{call spRegistrarAsiento(:idregistro, :idasiento)}",
    nativeQuery = true)
    void registrarAsiento(Integer idregistro, Integer idasiento);
     */
}
