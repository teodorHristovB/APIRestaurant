package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.DetallesPlatos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsDishes extends JpaRepository<DetallesPlatos, Integer> {
}
