package pe.edu.cibertec.appcinecibertec.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appcinecibertec.model.bd.Estado;
import pe.edu.cibertec.appcinecibertec.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertec.service.EstadoService;

import java.util.List;


@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {
    private EstadoService estadoService;
    @GetMapping("/frmestado")
    public String index(Model model){
        model.addAttribute("listaestados",
                estadoService.listarEstados());
        return "administracion/frmestado";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarEstado(
            @RequestBody Estado objEstado
            ){
        return estadoService.registrarEstado(objEstado);
    }

    @DeleteMapping("/eliminar")
    @ResponseBody
    public ResultadoResponse eliminarEstado(
            @RequestBody Estado objEstado
    ){
        return estadoService.eliminarEstado(objEstado.getIdestado());
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Estado> listarEstados(){
        return estadoService.listarEstados();
    }


}
