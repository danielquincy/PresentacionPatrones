package com.example.Creacionales.builder.autos;

import com.example.Creacionales.builder.autos.entidades.Auto;

public class EjemplAutosBuilder {
    public static void main(String[] args) {
        Auto oAuto = new Auto();
        oAuto.marca(1).modelo("1.1").color(1).anio(2023);
        oAuto.build();
    }
}
