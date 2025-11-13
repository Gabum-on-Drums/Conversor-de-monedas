package com.challenge.conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Esta parte declaramos las variables String del menú y de mensajes que mostraremos al usuario de la aplicación
        //y damos opciones para que pueda realizar distintas conversiones.
        //posteriormente la llamamos dentro del bucle While.
        String menu = """
                ***********************************************
                Bienvenido/a al conversor de monedas
                
                Tenemos las siguentes opciones:
                
                1) Dólar =>> Peso Argentino.
                2) Peso Argentino =>> Dólar.
                3) Dólar =>> Real Brasileño.
                4) Real Brasileño =>> Dólar.
                5) Dólar =>> Peso Chileno.
                6) Peso Chileno =>> Dólar.
                7) Salir
                ***********************************************
                """;
        String mensajeIngresaMonto = "Ingrese la cantidad que desea convertir :";
        String mensajeOpcionNoValida = "¡Opción incorrecta! Por favor vuelva a elegir entre 1 y 6, o 7 para finalizar.";
        String mensajeDeSalida = "Cerrando la aplicación, gracias por su preferencia. ¡Hasta la próxima!";

        //Variable para la opción elegida que será entregada por el usuario,
        //y variable correspondiente al valor que se desea convertir.

        int opciones = 0;
        double valorInicial = 0;

        //Creamos una instancia "Scanner" para solicitarle al usuario opciones y montos a convertir.
        //Mediante la instancia "apiRespuesta" enviamos los valores de "elecionBase y eleccionDestino" que necesitamos para realizar la conversión.

        Scanner teclado = new Scanner(System.in);
        ConsultaApi apiRespuesta = new ConsultaApi();

        //Bucle en el que nuestro usuario podrá realizar la operaciones de convertir valores, se repite hasta que se seleccione la opción (7) Salir.

        while (opciones != 7) {
            System.out.println(menu);
            opciones = teclado.nextInt();

            // a través del switch con opciones se retornan los valores que se deben consultar a la API de elecionBase y eleccionDestino.
            if (opciones >= 1 && opciones <= 6) {
                System.out.println(mensajeIngresaMonto);
                valorInicial = teclado.nextInt();

                String eleccionDebase = "";
                String eleccionDeDestino = "";

                switch (opciones) {
                    case 1:
                        eleccionDebase = "USD";
                        eleccionDeDestino = "ARS";
                        break;
                    case 2:
                        eleccionDebase = "ARS";
                        eleccionDeDestino = "USD";
                        break;
                    case 3:
                        eleccionDebase = "USD";
                        eleccionDeDestino = "BRL";
                        break;
                    case 4:
                        eleccionDebase = "BRL";
                        eleccionDeDestino = "USD";
                        break;
                    case 5:
                        eleccionDebase = "USD";
                        eleccionDeDestino = "CLP";
                        break;
                    case 6:
                        eleccionDebase = "CLP";
                        eleccionDeDestino = "USD";
                        break;
                }
                //Se realiza el cálculo basados en la elección del usuario.
                Conversor respuesta = apiRespuesta.solicitudValoresTasas(eleccionDebase, eleccionDeDestino);
                if (respuesta != null) {
                    respuesta.setResult(String.valueOf(valorInicial * respuesta.getConversion_rate()));
                    System.out.println(respuesta.mostrarResultado(valorInicial) + "\n");
                }
                //En el caso que la opción no sea igual a las del menú, mostramos un mensaje ofreciendo las opciones válidas.
            }else if (opciones >= 8) {
                System.out.println(mensajeOpcionNoValida);
            }
        }
        //Nos despedimos de nuestro usuario, agradeciéndole por usar la aplicación.
        System.out.println(mensajeDeSalida);
    }
}