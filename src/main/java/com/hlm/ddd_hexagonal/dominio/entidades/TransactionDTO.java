package com.hlm.ddd_hexagonal.dominio.entidades;

public class TransactionDTO {

    private int idtransaction;
    private String date;
    private int idaccount;
    private Boolean state;
    private Double transaction;
    private Double balance;

    public Double getTransaction() {
        return transaction;
    }

    public void setTransaction(Double transaction) {
        this.transaction = transaction;
    }

    public int getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(int idtransaction) {
        this.idtransaction = idtransaction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(int idaccount) {
        this.idaccount = idaccount;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


}
