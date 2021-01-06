package com.andersonfcz.citiesapi.country.controller;

import com.andersonfcz.citiesapi.country.model.Country;
import com.andersonfcz.citiesapi.country.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryResource {

    private CountryRepository repository;

    @GetMapping()
    public Page<Country> getAllCountries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("{id}")
    public Country getCountry(@PathVariable(value = "id") Long id) {
        Optional<Country> opt = repository.findById(id);
        return opt.get();
    }
}
