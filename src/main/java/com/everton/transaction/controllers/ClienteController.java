package com.everton.transaction.controllers;

import com.everton.transaction.services.ClienteService;
import com.everton.transaction.dto.ClienteDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "API REST Clientes")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @ApiOperation(value = "Retorna uma lista paginada de Clientes", nickname = "GetLista")
    @GetMapping(value = "/lista")
    public ResponseEntity<Page<ClienteDto>> findAll(Pageable pageable){
        Page<ClienteDto> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

}
