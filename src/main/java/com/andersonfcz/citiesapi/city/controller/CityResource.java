package com.andersonfcz.citiesapi.city.controller;

import com.andersonfcz.citiesapi.city.model.City;
import com.andersonfcz.citiesapi.city.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/cities")
public class CityResource {
    private final CityRepository repository;

    @GetMapping
    public Page getAllCities(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("{id}")
    public ResponseEntity<City> getCityById(@PathVariable(value = "id") Long id){
        Optional<City> opt = repository.findById(id);
        return opt.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
