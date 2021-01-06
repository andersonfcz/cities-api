package com.andersonfcz.citiesapi.distance.controller;

import com.andersonfcz.citiesapi.distance.service.DistanceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distance")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceResource {

    private final DistanceService service;

    @GetMapping()
    public String getDistance(@RequestParam(name = "from") final Long city1, @RequestParam(name = "to") final Long city2) {
        return service.getDistance(city1, city2);
    }
}
