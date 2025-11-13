package com.challenge.conversor;

public class Conversor {

    //Variables privadas de los valores que se obtienen de la API.

    private String base_code;
    private String target_code;
    private double conversion_rate;
    private String result;

    //Getters y setter necesarios para mostrar los valores.

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setResult(String result) {
        this.result = result;
    }

    //Creamos la respuesta que verá nuestro usuario, con el valor que él indico y su equivalente según su elección.
    public String mostrarResultado(double valorInicila) {
        return valorInicila + " [" + base_code + "] corresponde a un valor de = " +
                String.format("%.2f", valorInicila * conversion_rate) + " ["+ target_code + "].";
    }
}