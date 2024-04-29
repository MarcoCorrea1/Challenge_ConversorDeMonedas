package modelo;

public class Indices {
    public String asignarValoresCortos(int indice){
        String moneda;
        switch(indice){
            case 1:
                moneda="ARS";
                return moneda;
            case 2:
                moneda="BOB";
                return moneda;
            case 3:
                moneda="BRL";
                return moneda;

            case 4:
                moneda="CLP";
                return moneda;

            case 5:
                moneda="COP";
                return moneda;

            case 6:
                moneda="USD";
                return moneda;

            case 7:
                moneda="MXN";
                return moneda;

        }
        return "No encontrado";
    }

    public String asignarValoresLargos(int indice){
        String nombre;
        switch(indice){
            case 1:
                nombre="Peso argentino";
                return nombre;
            case 2:
                nombre="Boliviano boliviano";
                return nombre;
            case 3:
                nombre="Real brasileño";
                return nombre;

            case 4:
                nombre="Peso chileno";
                return nombre;

            case 5:
                nombre="Peso colombiano";
                return nombre;

            case 6:
                nombre="Dólar estadounidense";
                return nombre;

            case 7:
                nombre="Peso mexicano";
                return nombre;
        }
        return "No encontrado";
    }

}
