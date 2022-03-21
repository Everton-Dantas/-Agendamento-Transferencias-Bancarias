package com.everton.transaction.services;

import com.everton.transaction.dto.ClienteDto;
import com.everton.transaction.entities.Cliente;
import com.everton.transaction.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional(readOnly = true)
    public Page<ClienteDto> findAll(Pageable pageable){
        Page<Cliente> result = repository.findAll(pageable);
        return result.map(x -> new ClienteDto(x));
    }


}
