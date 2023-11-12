package pe.edu.cibertec.appcinecibertec.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appcinecibertec.model.bd.Sala;
import pe.edu.cibertec.appcinecibertec.model.dto.request.SalaDto;
import pe.edu.cibertec.appcinecibertec.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertec.service.SalaService;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/sala")
public class SalaController {

    private SalaService salaService;
    @GetMapping("/frmsala")
    public String frmMantSala(Model model){
        model.addAttribute("listasalas",
                salaService.listarSalas());
        return "administracion/frmsala";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarSala(
            @RequestBody SalaDto objSala
    ){
        return salaService.registrarActualizarSala(objSala);
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Sala> listarSalas(){
        return salaService.listarSalas();
    }
}
