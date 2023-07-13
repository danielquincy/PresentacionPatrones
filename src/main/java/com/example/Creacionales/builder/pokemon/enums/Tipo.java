package com.example.Creacionales.builder.pokemon.enums;

import com.example.Creacionales.builder.autos.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Tipo {
BICHO(1,"Bicho"),
SINIESTRO(2,"Siniestro"),
DRAGON(3,"Dragón"),
ELECTRICO(4,"Eléctrico"),
HADA(5, "Hada"),
LUCHA(6, "Lucha"),
FUEGO(7,"Fuego"),
VOLADOR(8, "Volador"),
FANTASMA(9, "Fantasma"),
PLANTA(10,"Planta"),
TIERRA(11,"Tierra"),
HIELO(12,"Hielo"),
NORMAL(13,"Normal"),
VENENO(14,"Veneno"),
PSIQUICO(15,"Psíquico"),
ROCA(16,"Roca"),
ACERO(17,"Acero"),
AGUA(18,"Agua");

    private final Integer codigo;
    private final String tipo;

    public static Tipo getByCode(Integer prCodigo) {
        return Arrays.stream(Tipo.values())
                .filter(x -> x.getCodigo().equals(prCodigo))
                .findFirst()
                .orElse(null);
    }
}
