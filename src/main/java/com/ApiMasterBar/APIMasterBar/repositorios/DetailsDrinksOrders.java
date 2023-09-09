package com.ApiMasterBar.APIMasterBar.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiMasterBar.APIMasterBar.MappedTables.DetallesBebidas;

public interface DetailsDrinksOrders extends JpaRepository<DetallesBebidas, Integer> {
}
