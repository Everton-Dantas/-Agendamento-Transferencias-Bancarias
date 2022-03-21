package com.everton.transaction.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.everton.transaction.entities.Transacao;
import com.everton.transaction.entities.enuns.TipoOperacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idTansacao;
    @JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
    private LocalDate dataMovimentacao;
    private TipoOperacao operacao;
    private BigDecimal valor;
    private Long idConta;

    public TransacaoDto() {
    }

    public TransacaoDto(Long idTansacao, LocalDate dataMovimentacao, TipoOperacao operacao, BigDecimal valor, Long idConta) {
        this.idTansacao = idTansacao;
        this.dataMovimentacao = dataMovimentacao;
        this.operacao = operacao;
        this.valor = valor;
        this.idConta = idConta;
    }

    public TransacaoDto(Transacao entity) {
        idTansacao = entity.getIdTansacao();
        dataMovimentacao = entity.getDataMovimentacao();
        operacao = entity.getOperacao();
        valor = entity.getValor();
        idConta =entity.getConta().getIdConta();
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

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }
}
