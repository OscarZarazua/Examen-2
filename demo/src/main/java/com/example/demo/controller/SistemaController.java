package com.example.demo.controller;

import com.example.demo.enitities.Cliente;
import com.example.demo.enitities.Prestamo;
import com.example.demo.enitities.itemPrestamo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sistema")
public class SistemaController {
    private List<Prestamo> prestamos  = new ArrayList<Prestamo>();

    private List<Cliente> clientes  = new ArrayList<Cliente>();

    private List<itemPrestamo> items  = new ArrayList<itemPrestamo>();

    @GetMapping
    public List<Cliente> getClientes(){

        return clientes;
    }

    @PostMapping
    public void crearCliente(Cliente cliente){

        clientes.add(cliente);
    }

    @DeleteMapping
    public void eliminarCliente(String nombre){
        Optional<Cliente> optionalCliente = buscarCliente(nombre);
        if (optionalCliente.isPresent()){
            clientes.remove(optionalCliente.get());
        }
    }

    private Optional<Cliente> buscarCliente(String nombre) {
        return clientes.stream().filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre)).findFirst();
    }

    @PutMapping
    public void modificarCliente(Cliente cliente){
        eliminarCliente(cliente.getNombre());
        clientes.add(cliente);
    }
}
