package com.nubelity.test.clientes.service.impl;

import com.nubelity.test.clientes.dto.ClienteDTO;
import com.nubelity.test.clientes.model.Cliente;
import com.nubelity.test.clientes.repository.ClienteRepository;
import com.nubelity.test.clientes.service.IClienteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente save(Cliente cliente) {

        ClienteDTO clienteDTO = Optional.of(cliente)
                .map(cl -> {

                    ClienteDTO clienteDTO1 = new ClienteDTO();

                    clienteDTO1.setNombre(cl.getNombre());

                    return clienteDTO1;

                }).orElse(new ClienteDTO());


        ClienteDTO saved = clienteRepository.save(clienteDTO);

        return Optional.of(saved)
                .map(cl -> {

                    Cliente client = new Cliente();

                    client.setIdCliente(cl.getIdCliente());
                    client.setNombre(cl.getNombre());

                    return client;

                }).orElse(new Cliente());


    }
}
