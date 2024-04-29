package Principal;

public class TextoMenus {

    public String textoBienvenida(){
        return "Bienvenido a su conversor de monedas predilecto.";
    }

    public String textoMonedas(){
        return """
                        1.- ARS - Peso argentino.
                        2.- BOB - Boliviano boliviano.
                        3.- BRL - Real brasileño.
                        4.- CLP - Peso chileno.
                        5.- COP - Peso colombiano.
                        6.- USD - Dólar estadounidense.
                        7.- MXN - Peso mexicano.
                """;
    }

    public String otraConsulta(){
        return """
    ¿Desea realizar otra consulta?
        1.- Si.
        2.- No.
""";
    }

    public String textoSeparacion(){
        return "************************************************";
    }
}