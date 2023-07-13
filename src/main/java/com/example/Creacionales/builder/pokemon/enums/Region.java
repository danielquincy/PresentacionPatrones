package com.example.Creacionales.builder.pokemon.enums;

import com.example.Creacionales.builder.autos.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Region {
    KANTO(1,"Kanto"),
    JOHTO(2,"Johto"),
    HOENN(3,"Hoenn"),
    SINNOH(4,"Sinnoh"),
    TESELIA(5,"Teselia"),
    KALOS(6,"Kalos"),
    ALOLA(7,"Alola"),
    GALAR(8,"Galar"),
    PALDEA(9,"Paldea");
    private final Integer codigo;
    private final String region;
    public static Region getByCode(Integer prColor) {
        return Arrays.stream(Region.values())
                .filter(x -> x.getCodigo().equals(prColor))
                .findFirst()
                .orElse(null);
    }
}
