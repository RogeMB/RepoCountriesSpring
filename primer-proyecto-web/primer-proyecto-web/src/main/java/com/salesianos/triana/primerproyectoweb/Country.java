package com.salesianos.triana.primerproyectoweb;


import lombok.Data;

@Data
public class Country {

    private String code;
    private String name;
    private String currency;
    private String capital;
    private int population;
}
