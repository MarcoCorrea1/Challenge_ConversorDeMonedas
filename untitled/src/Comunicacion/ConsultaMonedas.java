package Comunicacion;

import com.google.gson.Gson;
import modelo.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    public Moneda buscaMoneda(String moneda1, String moneda2){
        URI direccion=URI.create("https://v6.exchangerate-api.com/v6/89b74059956ef65df185a459/pair/"+moneda1+"/"+moneda2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("error: "+ e.getMessage());
        }
    }
}