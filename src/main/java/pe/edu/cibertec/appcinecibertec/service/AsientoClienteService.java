package pe.edu.cibertec.appcinecibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.appcinecibertec.model.bd.AsientoCliente;
import pe.edu.cibertec.appcinecibertec.model.bd.RegistroAsiento;
import pe.edu.cibertec.appcinecibertec.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertec.repository.AsientoClienteRepository;
import pe.edu.cibertec.appcinecibertec.repository.RegistroAsientoRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AsientoClienteService {
    private AsientoClienteRepository asientoClienteRepository;
    private RegistroAsientoRepository registroAsientoRepository;

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED)
    public ResultadoResponse guardarAsientoCliente(RegistroAsiento
                                                           registroAsiento,
                                                   List<AsientoCliente>
                                                           asientoClienteList){
        RegistroAsiento nuevoRegistroAsiento =
                registroAsientoRepository.save(registroAsiento);
        for (AsientoCliente asiento: asientoClienteList) {
            asiento.setIdrasiento(nuevoRegistroAsiento.getIdrasiento());
            asientoClienteRepository.save(asiento);
        }
        return null;
    }




}
