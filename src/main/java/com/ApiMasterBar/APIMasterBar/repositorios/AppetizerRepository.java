package com.ApiMasterBar.APIMasterBar.repositorios;

import com.ApiMasterBar.APIMasterBar.MappedTables.Entrante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppetizerRepository extends JpaRepository<Entrante, Integer> {
}
