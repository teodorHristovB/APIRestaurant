package com.ApiMasterBar.APIMasterBar.MappedTables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos_detalles_postre")
@IdClass(DetallesPostres.class)
public class DetallesPostres {
    @Id
    private int id_pedido;
    @Id
    private int id_postre;
    private int cantidad;
    private double precio_unitario;
    private double precio_suma;

    public DetallesPostres(int id_pedido, int id_postre, int cantidad, double precio_unitario, double precio_suma) {
        this.id_pedido = id_pedido;
        this.id_postre = id_postre;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precio_suma = precio_suma;
    }

    public DetallesPostres() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_postre() {
        return id_postre;
    }

    public void setId_postre(int id_postre) {
        this.id_postre = id_postre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getPrecio_suma() {
        return precio_suma;
    }

    public void setPrecio_suma(double precio_suma) {
        this.precio_suma = precio_suma;
    }
}
