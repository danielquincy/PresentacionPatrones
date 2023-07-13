package com.example.Creacionales.builder.autos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Marca {
   TOYOTA(1,"Toyota"),
   NISSAN(2,"Nissan"),
   MAZDA(3,"Mazda"),
   HYUNDAI(4,"Hyundai"),
   HONDA(5,"Honda"),
   KIA(6,"Kia");

    private final Integer codigo;
    private final String descripcion;

    public static Marca getByCode(Integer prCodigo) {
        return Arrays.stream(Marca.values())
                .filter(x -> x.getCodigo().equals(prCodigo))
                .findFirst().orElse(null);
    }
}
