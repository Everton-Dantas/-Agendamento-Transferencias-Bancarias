package com.everton.transaction.services;

import com.everton.transaction.dto.TransacaoDto;
import com.everton.transaction.entities.Conta;
import com.everton.transaction.entities.Transacao;
import com.everton.transaction.entities.enuns.TipoOperacao;
import com.everton.transaction.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repository;

    @Transactional(readOnly = true)
    public Page<TransacaoDto> findAll(Pageable pageable){
        Page<Transacao> result = repository.findAll(pageable);
        return result.map(x -> new TransacaoDto(x));
    }

    @Transactional
    public TransacaoDto insert(TipoOperacao operacao, BigDecimal valor, Conta conta ){
        Transacao transacao = new Transacao(null, LocalDate.now(), operacao, valor, conta);
        transacao = repository.save(transacao);
        return new TransacaoDto(transacao);
    }

}
