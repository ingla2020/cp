package cp.controller;

import cp.model.Countries;
import cp.service.CountriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Modulo3Controller {

    @Autowired
    public CountriesServices countriesServices;
    @PostMapping("/test8")
    public Countries insert(@RequestParam Integer id,
                            @RequestParam String name){
        return countriesServices.insert(id, name);
    }

    @GetMapping("/test9")
    public List<Countries> listaPaises(){
        return countriesServices.listaPaises();
    }
}
