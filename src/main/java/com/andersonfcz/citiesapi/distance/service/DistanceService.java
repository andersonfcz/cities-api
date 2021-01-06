package com.andersonfcz.citiesapi.distance.service;

import com.andersonfcz.citiesapi.city.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceService {
    private final CityRepository repository;

    public String getDistance(Long city1, Long city2) {
      Double distance = repository.distanceByPoints(city1, city2);
      return String.format("%.2f KM", distance * 1.60934);
    }
}
