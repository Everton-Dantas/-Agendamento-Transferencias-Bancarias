package com.everton.transaction.dto;

import com.everton.transaction.entities.Conta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovimentacaoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nomeCliente;
    private String nConta;
    private List<TransacaoDto> transacoes = new ArrayList<>();

    public MovimentacaoDto() {
    }

    public MovimentacaoDto(String nomeCliente, String nConta) {
        this.nomeCliente = nomeCliente;
        this.nConta = nConta;
    }
    public MovimentacaoDto(Conta entity) {
        nomeCliente = entity.getCliente().getNome();
        nConta = entity.getnConta();
        transacoes = entity.getTransacaos().stream().map(x -> new TransacaoDto(x)).collect(Collectors.toList());
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public List<TransacaoDto> getTransacoes() {
        return transacoes;
    }

}
