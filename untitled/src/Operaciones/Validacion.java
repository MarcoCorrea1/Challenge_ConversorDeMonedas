package Operaciones;

public class Validacion {

    public boolean validarMoneda(String tipoMoneda){
        if (tipoMoneda.equals("No encontrado")){
            return false;
        }else
        {
            return true;
        }
    }

}
