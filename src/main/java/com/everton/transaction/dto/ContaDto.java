package com.everton.transaction.dto;

import com.everton.transaction.entities.Conta;

import java.io.Serializable;
import java.math.BigDecimal;

public class ContaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idConta;
    private String agencia;
    private String nConta;
    private Boolean exclusive;
    private BigDecimal saldo;

    private Long idCliente;

    public ContaDto() {
    }

    public ContaDto(Long idConta, String agencia, String nConta, Boolean exclusive, BigDecimal saldo, Long idCliente) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.nConta = nConta;
        this.exclusive = exclusive;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }

    public ContaDto(Conta entity) {
        idConta = entity.getIdConta();
        agencia = entity.getAgencia();
        nConta = entity.getnConta();
        exclusive = entity.getExclusive();
        saldo = entity.getSaldo();
        idCliente = entity.getCliente().getIdCliente();
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
