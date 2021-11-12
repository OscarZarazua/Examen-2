package com.example.demo.enitities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Prestamo {
    private String fecha;
    private  String estado;
    private Date fechaDevolucion;
    private itemPrestamo item;


    public Prestamo(String fecha,itemPrestamo item, Date fechaDevolucion){
       this.fecha = fecha;
       this.item = item;
        this.fechaDevolucion = fechaDevolucion;
    }

}
