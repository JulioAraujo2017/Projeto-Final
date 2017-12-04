package com.example.julio.projetofinal;

public class Marker {
    private String endereco;
    private int totalCrimes;
    private int crimesFatais;
    private Double latitude;
    private Double longitude;

    public Marker(String end, int tc, int cf, Double lat, Double lon){
        endereco = end;
        totalCrimes = tc;
        crimesFatais = cf;
        latitude = lat;
        longitude = lon;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getTotalAcidentes(){
        return totalCrimes;
    }

    public int getAcidentesFatais(){
        return crimesFatais;
    }

    public Double getLatitude(){
        return latitude;
    }

    public Double getLongitude(){
        return longitude;
    }

    public int getTotalCrimes() {
        return totalCrimes;
    }

    public int getCrimesFatais() {
        return crimesFatais;
    }
}