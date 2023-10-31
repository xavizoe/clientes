package com.nubelity.test.clientes.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "clientes")
@Entity
@Getter
@Setter
public class ClienteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCliente")
    private Long idCliente;

    @Column(name = "nombre")
    private String nombre;


}
