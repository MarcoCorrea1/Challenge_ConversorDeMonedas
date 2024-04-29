package Comunicacion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelo.Moneda;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void GuardarJson(Moneda moneda) throws IOException {
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura= new FileWriter(moneda.base_code()+".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
