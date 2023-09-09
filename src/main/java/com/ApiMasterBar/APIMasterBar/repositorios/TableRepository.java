package com.ApiMasterBar.APIMasterBar.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiMasterBar.APIMasterBar.MappedTables.Mesa;

public interface TableRepository extends JpaRepository<Mesa, Integer> {

}
