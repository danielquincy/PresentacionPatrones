package com.example.Creacionales.builder.pokemon.enums;

import com.example.Creacionales.builder.autos.enums.Modelo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum Debilidad {
    BICHO(Tipo.BICHO, List.of(Tipo.FUEGO, Tipo.VOLADOR, Tipo.ROCA)),
    SINIESTRO(Tipo.SINIESTRO, List.of(Tipo.BICHO, Tipo.HADA, Tipo.LUCHA)),
    DRAGON(Tipo.DRAGON, List.of(Tipo.HADA, Tipo.HIELO, Tipo.DRAGON)),
    ELECTRICO(Tipo.ELECTRICO, List.of(Tipo.TIERRA)),
    HADA(Tipo.HADA,List.of(Tipo.VENENO, Tipo.ACERO)),
    LUCHA(Tipo.LUCHA,List.of(Tipo.HADA,Tipo.VOLADOR,Tipo.PSIQUICO)),
    FUEGO(Tipo.FUEGO,List.of(Tipo.TIERRA,Tipo.ROCA,Tipo.AGUA)),
    VOLADOR(Tipo.VOLADOR,List.of(Tipo.ELECTRICO, Tipo.ELECTRICO,Tipo.ROCA)),
    FANTASMA(Tipo.FANTASMA,List.of(Tipo.SINIESTRO, Tipo.FANTASMA)),
    PLANTA(Tipo.PLANTA,List.of(Tipo.BICHO, Tipo.FUEGO, Tipo.VOLADOR, Tipo.HIELO, Tipo.VENENO)),
    TIERRA(Tipo.TIERRA,List.of(Tipo.PLANTA, Tipo.HIELO, Tipo.AGUA)),
    HIELO(Tipo.HIELO,List.of(Tipo.LUCHA, Tipo.FUEGO, Tipo.ROCA, Tipo.ACERO)),
    NORMAL(Tipo.NORMAL,List.of(Tipo.LUCHA)),
    VENENO(Tipo.VENENO,List.of(Tipo.TIERRA, Tipo.PSIQUICO)),
    PSIQUICO(Tipo.PSIQUICO,List.of(Tipo.BICHO, Tipo.SINIESTRO, Tipo.FANTASMA)),
    ROCA(Tipo.ROCA,List.of(Tipo.LUCHA, Tipo.PLANTA, Tipo.TIERRA, Tipo.ACERO,Tipo.AGUA)),
    ACERO(Tipo.ACERO,List.of(Tipo.LUCHA, Tipo.FUEGO, Tipo.TIERRA)),
    AGUA(Tipo.AGUA,List.of(Tipo.ELECTRICO, Tipo.PLANTA));

    private final Tipo tipo;
    private final List<Tipo> debilidades;
    public static List<Debilidad> getByCode(Tipo prTipo) {
        return Arrays.stream(Debilidad.values())
                .filter(x -> x.getTipo().equals(prTipo))
                .collect(Collectors.toList());
    }

    public static String getDebilidadesByCode(Tipo prTipo) {
        List<Debilidad>  olistaDebilidades = getByCode(prTipo);
        StringBuilder oBuilder = new StringBuilder();

        for (Debilidad oDebilidad: olistaDebilidades){
            oBuilder.append(oDebilidad.getDebilidades().stream().map(Tipo::getTipo).collect(Collectors.toList()));
        }
        return oBuilder.toString();
    }


}
