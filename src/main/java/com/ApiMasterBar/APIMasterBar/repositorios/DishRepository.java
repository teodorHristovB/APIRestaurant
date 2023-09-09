package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Plato, Integer> {
}
