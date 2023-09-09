package com.ApiMasterBar.APIMasterBar.MappedTables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos_detalles_plato")
@IdClass(DetallesPlatos.class)
public class DetallesPlatos {
    @Id
    private int id_pedido;
    @Id
    private int id_plato;
    private int cantidad;
    private double precio_unitario;
    private double precio_suma;
    @Id
    private int guarnicion;
    @Id
    private int punto_carne;

    public DetallesPlatos() {
    }

    public DetallesPlatos(int id_pedido, int id_plato, int cantidad, double precio_unitario, double precio_suma, int guarnicion, int punto_carne) {
        this.id_pedido = id_pedido;
        this.id_plato = id_plato;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.precio_suma = precio_suma;
        this.guarnicion = guarnicion;
        this.punto_carne = punto_carne;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
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

    public int getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(int guarnicion) {
        this.guarnicion = guarnicion;
    }

    public int getPunto_carne() {
        return punto_carne;
    }

    public void setPunto_carne(int punto_carne) {
        this.punto_carne = punto_carne;
    }
}
