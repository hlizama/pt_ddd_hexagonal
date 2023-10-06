package com.hlm.ddd_hexagonal.dominio.entidades;

public class CuentaDTO {

    private int idaccount;
    private int account_number;
    private String type;
    private Double initial_balance;
    private int iduser;
    private Boolean state;

    public int getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(int idaccount) {
        this.idaccount = idaccount;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(Double initial_balance) {
        this.initial_balance = initial_balance;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

}
