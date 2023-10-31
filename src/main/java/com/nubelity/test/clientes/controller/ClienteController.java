package com.nubelity.test.clientes.controller;

import com.nubelity.test.clientes.model.Cliente;
import com.nubelity.test.clientes.service.IClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ClienteController {

    private final IClienteService clienteService;

    public ClienteController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> saveClient(@RequestBody Cliente cliente) {

        Cliente clienteSaved = clienteService.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSaved);
    }


}
