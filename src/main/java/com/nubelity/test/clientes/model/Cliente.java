package com.nubelity.test.clientes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Cliente implements Serializable {

    @JsonProperty("idCliente")
    private Long idCliente;

    @JsonProperty("nombre")
    private String nombre;

}
