package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksRepository extends JpaRepository<Bebida, Integer> {
}
