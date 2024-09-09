package cp.service;

import cp.model.Countries;
import cp.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountriesServices {
    @Autowired
    public CountriesRepository countriesRepository;

    public Countries insert(Integer id, String name){
        Countries countries = new Countries();
        countries.setId(id);
        countries.setName(name);
        return countriesRepository.save(countries);
    }


    public List<Countries> listaPaises(){
        Optional<List<Countries>> lista = countriesRepository.listaPaises();
        if (lista.isPresent()) return lista.get();
        else return null;
    }
}
