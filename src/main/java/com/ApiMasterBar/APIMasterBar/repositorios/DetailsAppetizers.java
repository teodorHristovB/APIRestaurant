package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.DetallesEntrantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsAppetizers extends JpaRepository<DetallesEntrantes, Integer> {
}
