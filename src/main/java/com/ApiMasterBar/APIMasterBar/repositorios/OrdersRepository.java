package com.ApiMasterBar.APIMasterBar.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiMasterBar.APIMasterBar.MappedTables.Pedido;

public interface OrdersRepository extends JpaRepository<Pedido, Integer> {
}
