package Excepciones;

public class ExcepcionIntervalo extends Exception {

    public String getMessage(){
        return "Números fuera del intervalo";
    }
}