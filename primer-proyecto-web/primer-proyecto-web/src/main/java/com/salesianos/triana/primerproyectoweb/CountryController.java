package com.salesianos.triana.primerproyectoweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping("/country")
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @GetMapping("/country/{code}")
    public ResponseEntity<Country> getByCode(@PathVariable("code") String code) {
        return ResponseEntity.of(repository.findCountry(code)); //El método "of" si está vacío configura el código de la respuesta en 404. Si no está vacío en un 200.
    }

    @PostMapping("/country")
    public ResponseEntity<Country> newCountry(@RequestBody Country country) {
       return ResponseEntity.status(HttpStatus.CREATED)
               .body(repository.addCountry(country)); // body_ parte del cuerpo de la respuesta
    }
}