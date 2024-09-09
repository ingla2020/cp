package cp.controller;

import cp.dto.SaludosDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Modulo1Controller {

    @GetMapping("")
    String hola(){
        return "Hola Zeni";
    }

    @GetMapping("/saludos")
    SaludosDto hola2(){
        SaludosDto saludos = new SaludosDto();
        saludos.setMensaje("Hola Zeni");
        return saludos;
    }

    @GetMapping("/parametros")
    SaludosDto hola3(@RequestParam String parametros, @RequestParam String paso){
        SaludosDto saludos = new SaludosDto();
        saludos.setMensaje(parametros +" : "+ paso);
        return saludos;
    }

    @GetMapping("/test4/{parametros}")
    SaludosDto hola4(@PathVariable String parametros){
        SaludosDto saludos = new SaludosDto();
        saludos.setMensaje(parametros);
        return saludos;
    }
}
