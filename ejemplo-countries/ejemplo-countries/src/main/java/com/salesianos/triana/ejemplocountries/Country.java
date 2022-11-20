package com.salesianos.triana.ejemplocountries;
import lombok.Data;

public class Country {
    @Data
    private String code;
    private String name;
    private String currency;
    private String capital;
    private int population;
}
