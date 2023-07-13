package com.example.Creacionales.builder.pokemon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum Fortaleza {
    BICHO(Tipo.BICHO, List.of(Tipo.PLANTA, Tipo.SINIESTRO, Tipo.PSIQUICO)),
    SINIESTRO(Tipo.SINIESTRO, List.of(Tipo.FANTASMA, Tipo.PSIQUICO)),
    DRAGON(Tipo.DRAGON, List.of(Tipo.DRAGON)),
    ELECTRICO(Tipo.ELECTRICO, List.of(Tipo.VOLADOR, Tipo.AGUA)),
    HADA(Tipo.HADA,List.of(Tipo.LUCHA, Tipo.SINIESTRO, Tipo.DRAGON)),
    LUCHA(Tipo.LUCHA,List.of(Tipo.SINIESTRO,Tipo.HIELO,Tipo.NORMAL, Tipo.ROCA, Tipo.ACERO)),
    FUEGO(Tipo.FUEGO,List.of(Tipo.BICHO,Tipo.PLANTA,Tipo.ACERO, Tipo.HIELO)),
    VOLADOR(Tipo.VOLADOR,List.of(Tipo.BICHO, Tipo.LUCHA,Tipo.PLANTA)),
    FANTASMA(Tipo.FANTASMA,List.of(Tipo.FANTASMA, Tipo.PSIQUICO)),
    PLANTA(Tipo.PLANTA,List.of(Tipo.TIERRA, Tipo.ROCA, Tipo.AGUA)),
    TIERRA(Tipo.TIERRA,List.of(Tipo.ELECTRICO, Tipo.FUEGO, Tipo.VENENO, Tipo.ROCA, Tipo.ACERO)),
    HIELO(Tipo.HIELO,List.of(Tipo.DRAGON, Tipo.VOLADOR, Tipo.PLANTA, Tipo.TIERRA)),
    NORMAL(Tipo.NORMAL,List.of()),
    VENENO(Tipo.VENENO,List.of(Tipo.HADA, Tipo.PLANTA)),
    PSIQUICO(Tipo.PSIQUICO,List.of(Tipo.LUCHA, Tipo.VENENO)),
    ROCA(Tipo.ROCA,List.of(Tipo.BICHO,  Tipo.FUEGO, Tipo.VOLADOR, Tipo.HIELO)),
    ACERO(Tipo.ACERO,List.of(Tipo.HADA, Tipo.HIELO, Tipo.ROCA)),
    AGUA(Tipo.AGUA,List.of(Tipo.FUEGO, Tipo.TIERRA, Tipo.ROCA));

    private final Tipo tipo;
    private final List<Tipo> fortalezas;

    public static List<Fortaleza> getByCode(Tipo prTipo) {
        return Arrays.stream(Fortaleza.values())
                .filter(x -> x.getTipo().equals(prTipo))
                .collect(Collectors.toList());
    }


    public static String getFortalezasByCode(Tipo prTipo) {
        List<Fortaleza>  olistaFortalezas = getByCode(prTipo);
        StringBuilder oBuilder = new StringBuilder();

        for (Fortaleza oFortaleza: olistaFortalezas){
            oBuilder.append(oFortaleza.getFortalezas().stream().map(Tipo::getTipo).collect(Collectors.toList()));
        }
        return oBuilder.toString();
    }
}
