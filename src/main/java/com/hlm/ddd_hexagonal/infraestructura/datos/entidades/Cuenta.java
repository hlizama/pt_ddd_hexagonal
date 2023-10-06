package com.hlm.ddd_hexagonal.infraestructura.datos.entidades;
import javax.persistence.*;

@Entity
@Table(name="cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcuenta")
    private int idcuenta;
    private int numero_cuenta;
    private String tipo;
    private Double saldo_inicial;
    private int idusuario;
    private Boolean estado;

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(Double saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

}
