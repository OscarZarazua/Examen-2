package com.example.demo.repository;

import com.example.demo.enitities.Cliente;
import com.example.demo.enitities.Prestamo;
import com.example.demo.enitities.itemPrestamo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Sistema {
    private List<Prestamo> prestamos;

    private List<Cliente> clientes;

    private List<itemPrestamo> items;

    private List<Sistema> sistemas;
}
