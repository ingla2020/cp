package cp.controller;

import cp.dto.SaludosDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class Modulo11Controller {

    @PostMapping(value="/test5")
    public ResponseEntity<SaludosDto> test5(@RequestBody SaludosDto body){
        return new ResponseEntity<SaludosDto>(body , HttpStatus.CREATED);
    }


}
