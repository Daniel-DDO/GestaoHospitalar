package br.com.hospital.GestaoHospitalar.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class ControladorAplicacao {

    @GetMapping
    public String helloworld() {
        return "Fala daniel";
    }

}
