package com.example.Creacionales.builder.autos.entidades;

import com.example.Creacionales.builder.autos.enums.Color;
import com.example.Creacionales.builder.autos.enums.Marca;
import com.example.Creacionales.builder.autos.enums.Modelo;
import lombok.Getter;

@Getter
public class Auto {

private Marca marca;
private Modelo modelo;
private Color color;
private Integer anio;

    public Auto() {
    }

    public Auto marca(Integer marca){
        this.marca = Marca.getByCode(marca);
        return this;
    }
   public Auto modelo(String modelo){
        this.modelo = Modelo.getByCode(modelo);
        return this;
    }
    public Auto color(Integer color){
        this.color = Color.getByCode(color);
        return this;
    }
    public Auto anio(Integer anio){
        this.anio = anio;
        return this;
    }

    public void build(){
        StringBuilder oBuilder = new StringBuilder()
                .append(" ============================================= ").append("\n")
                .append(" Bienvenidos a tu Constructora de Autos Nerdify ").append("\n")
                .append(" En esta ocasión construiremos un Auto con las siguientes especificaciones: " ).append("\n")
                .append(" Marca: ").append(this.marca.getDescripcion()).append("\n")
                .append(" Modelo: ").append(this.modelo.getModelo()).append("\n")
                .append(" Color: ").append(this.color.getDescripcion()).append("\n")
                .append(" Año: ").append(this.anio) .append("\n")
                .append(" ============================================= ").append("\n") ;
        System.out.printf(oBuilder.toString()); ;
    }


}
