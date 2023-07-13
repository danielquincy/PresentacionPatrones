package com.example.Creacionales.builder.autos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Modelo {
    HILUX("1.1","Hilux", Marca.TOYOTA),
    COROLLA("1.2","Corolla", Marca.TOYOTA),
    PRADO("1.3","Prado", Marca.TOYOTA),
    SENTRA("2.1","Sentra", Marca.NISSAN),
    VERSA("2.2","Versa", Marca.NISSAN),
    X_TRAIL("2.3","X-Trail", Marca.NISSAN),
    CX_3("3.1","CX-3", Marca.MAZDA),
    MX_5("3.3","MX-5", Marca.MAZDA),
    CX_9("3.3","CX-9", Marca.MAZDA),
    ELANTRA("4.1","Elantra", Marca.HYUNDAI),
    TUCSON("4.2","Tucson", Marca.HYUNDAI),
    SANTA_FE("4.3","Santa Fe", Marca.HYUNDAI),
    CR_V("5.1","CR-V", Marca.HONDA),
    HR_V("5.1","HR-V", Marca.HONDA),
    SORENTO("6.1","Sorento", Marca.KIA),
    RIO("6.2","Rio", Marca.KIA),
    PICANTO("6.3","Picanto", Marca.KIA);

    private final String codigo;
    private final String modelo;
    private final Marca marca;

    public static Modelo getByCode(String prCodigo) {
        return Arrays.stream(Modelo.values())
                .filter(x -> x.getCodigo().equals(prCodigo))
                .findFirst().orElse(null);
    }
}
