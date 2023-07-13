package com.example.Creacionales.builder.autos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Color {
    ROJO(1,"Rojo"),
    NEGRO(2,"Negro"),
    AZUL(3,"Azul"),
    GRIS(4,"Gris");
    private final Integer codigo;
    private final String Descripcion;
    public static Color getByCode(Integer prColor) {
        return Arrays.stream(Color.values())
                .filter(x -> x.getCodigo().equals(prColor))
                .findFirst()
                .orElse(null);
    }
}
