package com.challenge.conversor;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
//Recibimos los valores desde el switch de la moneda que quiere convertir, junto con el tipo de moneda que quiere obtener.


    public Conversor solicitudValoresTasas (String eleccionDeBase, String eleccionDeDestino) {
        //Le facilitamos el APIKey para que pueda obtener los valores de conversión.
        String apiKey = "ad94b045a20bc6a85cc7927e";
        URI linkUrl = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + eleccionDeBase + "/" + eleccionDeDestino);

        //Creamos el cliente HTTP.
        HttpClient client = HttpClient.newHttpClient();

        //Aquí está la solicitud.
        HttpRequest request = HttpRequest.newBuilder().uri(linkUrl).build();
        try {
            //Guardamos la respuesta como un String.
            HttpResponse<String> respuestaApi = client.send(request, HttpResponse.BodyHandlers.ofString());

            //creamos el objeto "Conversor" desde el archivo JSON.
            return new Gson().fromJson(respuestaApi.body(), Conversor.class);

        } catch (IOException | InterruptedException e){
            System.out.println("Ocurrió un problema en la consulta a la API" + e.getMessage());
            return null;
        }
    }
}