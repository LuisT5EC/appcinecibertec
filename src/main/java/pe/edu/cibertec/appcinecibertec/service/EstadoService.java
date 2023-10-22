package pe.edu.cibertec.appcinecibertec.service;

import lombok.AllArgsConstructor;
import pe.edu.cibertec.appcinecibertec.model.bd.Estado;
import pe.edu.cibertec.appcinecibertec.repository.EstadoRepository;

import java.util.List;
@AllArgsConstructor
public class EstadoService {

    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados(){
        return estadoRepository.findAll();
    }

    public boolean registrarEstado(Estado estado){
        return estadoRepository.save(estado) != null;
    }

    public boolean eliminarEstado(Integer idestado){
        estadoRepository.deleteById(idestado);
        return false;
    }

}
