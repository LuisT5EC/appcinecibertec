package pe.edu.cibertec.appcinecibertec.controller.administracion;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appcinecibertec.service.EstadoService;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;
    @GetMapping("/frmestado")
    public String index(Model model){
        model.addAttribute("listarestados",
                estadoService.listarEstados());
        return "administracion/frmestado";
    }
}
