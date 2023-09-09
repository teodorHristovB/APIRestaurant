package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.Postre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertRepository extends JpaRepository<Postre, Integer> {
}
