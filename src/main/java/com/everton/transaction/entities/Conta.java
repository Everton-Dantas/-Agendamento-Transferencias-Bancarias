package com.everton.transaction.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;
    private String agencia;
    private String nConta;
    private Boolean exclusive;
    private BigDecimal saldo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "conta")
    private Set<Transacao> transacaos = new HashSet<>();

    public Conta() {
    }

    public Conta(Long idConta, String agencia, String nConta, Boolean exclusive, BigDecimal saldo, Cliente cliente) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.nConta = nConta;
        this.exclusive = exclusive;
        this.saldo = saldo;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Transacao> getTransacaos() {
        return transacaos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return idConta.equals(conta.idConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConta);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", agencia='" + agencia + '\'' +
                ", nConta='" + nConta + '\'' +
                ", exclusive=" + exclusive +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
