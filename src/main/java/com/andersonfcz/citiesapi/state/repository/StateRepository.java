package com.andersonfcz.citiesapi.state.repository;

import com.andersonfcz.citiesapi.state.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
