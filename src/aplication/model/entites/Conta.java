package aplication.model.entites;

import aplication.model.exception.DomainException;

public class Conta {
    private Integer Numero;
    private String Titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        Numero = numero;
        Titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }
    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    public void saque(Double quantia) throws DomainException {
        if (quantia > saldo || quantia > limiteSaque){
            throw new DomainException("Valor superior ao limite");
        }
        saldo -= quantia;
    }
    public void deposit(Double quantia){
        saldo += quantia;
    }
}
