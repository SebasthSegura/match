package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorConverRuntimeException;
import com.aluracursos.screenmatch.modelos.Tittle;
import com.aluracursos.screenmatch.modelos.TittleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
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
        /*
        usamos el .replace para reemplazar un caracter viejo con uno nuevo
        de esta forma el problema del especio se resolvera
         */
        String direction = "https://www.omdbapi.com/?t=" +
                search.replace(" ", "+") + "&apikey=b64b3f35";
        try {
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

        /*
        usamos el try and catch para decir a nuestro codigo que trate de ejecutar algo
        dependiendo del comportamiento de las excepciones, en dado caso
        se ejecutara el catch mostrando con e de exception.
         */

            Tittle myTittle = new Tittle(myTittleOmdb);
            System.out.println("Titulo convertido: " + myTittle);

            /*

             */
            FileWriter escritura = new FileWriter("pelicula.txt");
            escritura.write(myTittle.toString());
            escritura.close();

        } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ocurrio un error en la URL verificar");
        }catch (ErrorConverRuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalizo la ejecicion del codigo");
        }
    }
}
