package cp.controller;

import cp.dto.ClienteDto;
import cp.dto.ClienteRecordDto;
import cp.service.ApiExternal;
import cp.service.Modulo2Services;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Modulo2Controller {

    @Autowired
    public Modulo2Services modulo2Services;

    @Autowired
    public ApiExternal ApiExternal;

    @GetMapping("/test6")
    String hola(){
        return modulo2Services.metodo1();
    }


    @GetMapping("/test7")
    ClienteRecordDto apijsonPlaceHolder(){
        return ApiExternal.metodoExterno1();
    }
}
