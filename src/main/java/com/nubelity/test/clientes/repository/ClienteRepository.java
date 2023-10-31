package com.nubelity.test.clientes.repository;

import com.nubelity.test.clientes.dto.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDTO,Long > {
}
