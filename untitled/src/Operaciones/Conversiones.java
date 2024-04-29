package Operaciones;

import java.text.DecimalFormat;

public class Conversiones {
    public double conversiones(int cantidad,double conversion_rate){
        DecimalFormat precision= new DecimalFormat("#.##");
        double multiplicar=cantidad*conversion_rate;
        double salida= Double.parseDouble(precision.format(multiplicar));
        return salida;
    }
}
