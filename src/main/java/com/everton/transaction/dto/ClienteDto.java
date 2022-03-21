package com.everton.transaction.dto;

import com.everton.transaction.entities.Cliente;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class ClienteDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idCliente;
    private String nome;
    private String cpf;
    @JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
    private LocalDate dataNascimento;

//    private List<ContaDto> contas = new ArrayList<>();

    public ClienteDto() {
    }

    public ClienteDto(Long idCliente, String nome, String cpf, LocalDate dataNascimento) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public ClienteDto(Cliente entity) {
        idCliente = entity.getIdCliente();
        nome = entity.getNome();
        cpf = entity.getCpf();
        dataNascimento = entity.getDataNascimento();
//        contas = entity.getContas().stream().map(x -> new ContaDto(x)).collect(Collectors.toList());
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    public List<ContaDto> getContas() {
//        return contas;
//    }
//
//    public void setContas(List<ContaDto> contas) {
//        this.contas = contas;
//    }
}
