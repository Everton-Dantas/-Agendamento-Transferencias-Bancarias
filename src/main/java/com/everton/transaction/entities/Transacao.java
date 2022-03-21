package com.everton.transaction.entities;

import com.everton.transaction.entities.enuns.TipoOperacao;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_transacao")
public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTansacao;
    private LocalDate dataMovimentacao;
    private TipoOperacao operacao;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    public Transacao() {
    }

    public Transacao(Long idTansacao, LocalDate dataMovimentacao, TipoOperacao operacao, BigDecimal valor, Conta conta) {
        this.idTansacao = idTansacao;
        this.dataMovimentacao = dataMovimentacao;
        this.operacao = operacao;
        this.valor = valor;
        this.conta = conta;
    }

    public Long getIdTansacao() {
        return idTansacao;
    }

    public void setIdTansacao(Long idTansacao) {
        this.idTansacao = idTansacao;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public TipoOperacao getOperacao() {
        return operacao;
    }

    public void setOperacao(TipoOperacao operacao) {
        this.operacao = operacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return idTansacao.equals(transacao.idTansacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTansacao);
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "idTansacao=" + idTansacao +
                ", dataMovimentacao=" + dataMovimentacao +
                ", operacao='" + operacao + '\'' +
                ", valor=" + valor +
                ", conta=" + conta +
                '}';
    }
}
