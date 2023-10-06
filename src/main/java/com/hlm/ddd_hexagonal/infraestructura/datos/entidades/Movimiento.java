package com.hlm.ddd_hexagonal.infraestructura.datos.entidades;

import javax.persistence.*;

@Entity
@Table(name="movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idmovimiento;
    private String fecha;
    private int idcuenta;
    private Boolean estado;
    private Double movimiento;
    private Double saldo;

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Double getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Double movimiento) {
        this.movimiento = movimiento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
