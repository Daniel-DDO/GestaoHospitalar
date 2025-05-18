package br.com.hospital.GestaoHospitalar.controladores;

import br.com.hospital.GestaoHospitalar.basicas.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/hello-world")
public class ControladorAplicacao {

    @GetMapping
    public String helloworld() {
        return "Fala ";
    }
    
    @PostMapping("")
    public String helloworldPost(@RequestBody Medico body) {
        return "Fala "+body.getNome();
    }

}
