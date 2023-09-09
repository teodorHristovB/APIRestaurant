package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.DetallesPostres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsDesserts extends JpaRepository<DetallesPostres, Integer> {
}
