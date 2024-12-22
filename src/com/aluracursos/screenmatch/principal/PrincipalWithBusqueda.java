package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Tittle;
import com.aluracursos.screenmatch.modelos.TittleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalWithBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*creamos una entrada para que el usuario digite
        la informacion de lapelicula que quiere ver*/
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre del titulo: ");
        var search = lectura.nextLine();
        String direction = "https://www.omdbapi.com/?t=" + search + "&apikey=b64b3f35";

        /*
        usamos la class http request como clientes para realizar consultas
        al api
         */
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direction))
                .build();

        /*
        usamos la interface http responsive para resivir respuestas del api
        a la cual vamos a hacer la request
         */
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        /*
        creamos una variable json para poder implementar los cambios con el jar Gson de
        nuestro response.body que es nuestro json el cual sera modificado
         */
        String json = response.body();
        /*
        imprimimos en pantalla la respuesta que nos dio el api
         */
        System.out.println(json);

        /*
        usamos Gson para poder modificar el archivo json que vamos a recibir
        de nuestra consulta del api como cadena de json
         */
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();;

        /*
        usamos nuestro paquete Tittle para poder usarlo con la biblioteca
        gson y modificar nuestra respuesta del api que esta en la variable json
         */
        TittleOmdb myTittleOmdb = gson.fromJson(json, TittleOmdb.class);
        System.out.println(myTittleOmdb);
        Tittle myTittle = new Tittle(myTittleOmdb);
    }
}
