package com.example.Creacionales.builder.pokemon.entidades;

import com.example.Creacionales.builder.pokemon.enums.Debilidad;
import com.example.Creacionales.builder.pokemon.enums.Fortaleza;
import com.example.Creacionales.builder.pokemon.enums.Region;
import com.example.Creacionales.builder.pokemon.enums.Tipo;
import lombok.Getter;

import java.util.List;

@Getter
public class Pokemon {

    private String nombre;
    private Tipo tipo;
    private List<Debilidad> debilidades;
    private List<Fortaleza> fortalezas;
    private Region region;

    public Pokemon(){}

    public Pokemon nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Pokemon tipo(Integer tipo){
        this.tipo = Tipo.getByCode(tipo);
        return this;
    }

    public Pokemon region(Integer tipo){
        this.region = Region.getByCode(tipo);
        return this;
    }

    public void build(){

        this.debilidades = Debilidad.getByCode(this.tipo);
        this.fortalezas = Fortaleza.getByCode(this.tipo);

        StringBuilder oBuilder = new StringBuilder()
        .append(" ============================================= ").append("\n")
                .append(" Bienvenidos a su Creador de Pokémon de Nerdify ").append("\n")
                .append(" En esta ocasión construiremos un Pokémon con las siguientes caracteristicas: " ).append("\n")
                .append(" Nombre        : ").append(this.nombre).append("\n")
                .append(" Tipo          : ").append(this.tipo.getTipo()).append("\n")
                .append(" Debil Contra  : ").append(Debilidad.getDebilidadesByCode(this.tipo)).append("\n")
                .append(" Fuerte Contra : ").append(Fortaleza.getFortalezasByCode(this.tipo)) .append("\n")
                .append(" Region        : ").append(this.region.getRegion()) .append("\n")
                .append(" ============================================= ").append("\n") ;
        System.out.printf(oBuilder.toString()); ;

    }



}
