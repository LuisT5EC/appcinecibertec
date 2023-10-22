package pe.edu.cibertec.appcinecibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appcinecibertec.model.bd.Estado;
import pe.edu.cibertec.appcinecibertec.repository.EstadoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EstadoService {

    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados(){
        return estadoRepository.findAll();
    }

    public boolean registrarEstado(Estado estado){
        return estadoRepository.save(estado) != null;
    }

    public void eliminarEstado(Integer idestado){
        estadoRepository.deleteById(idestado);
    }

}
