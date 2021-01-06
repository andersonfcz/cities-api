package com.andersonfcz.citiesapi.state.controller;

import com.andersonfcz.citiesapi.state.model.State;
import com.andersonfcz.citiesapi.state.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/states")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateResource {

    private final StateRepository repository;

    @GetMapping
    public Page<State> getAllStates(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("{id}")
    public ResponseEntity<State> getState(@PathVariable(value = "id") Long id) {
        Optional<State> opt = repository.findById(id);
        return opt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        
    }

}
