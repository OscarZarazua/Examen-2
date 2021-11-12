package com.example.demo.enitities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class itemPrestamo {
    private Integer codigo;
    private String nombre;
    private String fechaDevolucion;

    public itemPrestamo(Integer codigo, String nombre) {
    }



    public Integer getCodigo() {

        return codigo;
    }
}
