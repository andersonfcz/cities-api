package com.andersonfcz.citiesapi.country.repository;

import com.andersonfcz.citiesapi.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CountryRepository extends JpaRepository<Country, Long> {
}
