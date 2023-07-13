package com.example.Creacionales.builder.pokemon;

import com.example.Creacionales.builder.pokemon.entidades.Pokemon;

public class PokemonBuilder {
    public static void main(String[] args) {
        Pokemon oPokemon = new Pokemon();
        oPokemon.nombre("Pokencio").tipo(5).region(2);
        oPokemon.build();
    }
}
