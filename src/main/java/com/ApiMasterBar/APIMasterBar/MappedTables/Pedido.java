package com.ApiMasterBar.APIMasterBar.MappedTables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    Integer id;
    String dniPersonal;
    Date fecha;
    double precio_total;
    int estado;
    int mesa;

    public Pedido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDniPersonal() {
        return dniPersonal;
    }

    public void setDniPersonal(String dniPersonal) {
        this.dniPersonal = dniPersonal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Pedido(Integer id, String dniPersonal, Date fecha, double precio_total, int estado, int mesa) {
        this.id = id;
        this.dniPersonal = dniPersonal;
        this.fecha = fecha;
        this.precio_total = precio_total;
        this.estado = estado;
        this.mesa = mesa;
    }
}
