package com.ApiMasterBar.APIMasterBar.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiMasterBar.APIMasterBar.MappedTables.Personal;

public interface EmployeeRepository extends JpaRepository<Personal, String> {
}
