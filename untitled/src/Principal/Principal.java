package Principal;

import Comunicacion.ConsultaMonedas;
import Excepciones.ExcepcionIntervalo;
import Operaciones.Conversiones;
import Operaciones.Validacion;
import modelo.Indices;
import modelo.Moneda;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        TextoMenus txtMenu= new TextoMenus();
        Validacion val= new Validacion();
        Scanner lectura = new Scanner(System.in);
        ConsultaMonedas consulta = new ConsultaMonedas();
        Conversiones calculos= new Conversiones();
        Indices index =new Indices();
        String moneda1L,moneda1C,moneda2L,moneda2C;
        int cantidad;

        while (true) {
            try {
                System.out.println(txtMenu.textoSeparacion());
                System.out.println( txtMenu.textoBienvenida());
                System.out.println(txtMenu.textoSeparacion());

                //Moneda a cambiar  1 Dolar
                System.out.println("Digite el numero del tipo de moneda que desea cambiar");
                System.out.println(txtMenu.textoMonedas());
                int indice1=Integer.parseInt(lectura.nextLine());

                //Validar el tipo de entreda sea correcto
                if (val.validarMoneda(index.asignarValoresCortos(indice1))){
                    System.out.println("Cuantos "+index.asignarValoresCortos(indice1)+" "+"Desea cambiar?");
                    cantidad=Integer.parseInt(lectura.nextLine());
                }else{
                    throw new ExcepcionIntervalo();
                }

                //Moneda a cambiar ->
                System.out.println("Digite el numero del tipo de moneda que desea recibir");
                System.out.println(txtMenu.textoMonedas());
                int indice2=Integer.parseInt(lectura.nextLine());
                if (!val.validarMoneda(index.asignarValoresCortos(indice2))){
                    throw new ExcepcionIntervalo();
                }
                //Asignacion de valores de acuerdo al tipo de moneda
                //3 caracteres
                moneda1C=index.asignarValoresCortos(indice1);
                moneda2C=index.asignarValoresCortos(indice2);
                //Completo
                moneda1L=index.asignarValoresCortos(indice1);
                moneda2L=index.asignarValoresCortos(indice2);
                //Consulta hacia la Api
                Moneda datosAPI = consulta.buscaMoneda(moneda1C,moneda2C);

                //asignando respuestas de la api
                double tipoDeCambio= datosAPI.conversion_rate();
                //Calculando valores con la conversion recibida
                double cambio = calculos.conversiones(cantidad,tipoDeCambio);
                //Salida de texto final
                System.out.println("El tipo de cambio de "+ moneda1C + "/" + moneda2C +
                        " es de: "+ tipoDeCambio +" y por " + cantidad+ " "+
                        moneda1L + " obtendra "+cambio +" " + moneda2L);

                //Aqui se pregunta si se desea hacer otra consulta
                System.out.println(txtMenu.otraConsulta());
                int salir=Integer.parseInt(lectura.nextLine());
                if(salir==2){
                    //Finalizacion del programa
                    System.out.println("programa finalizado");
                    break;
                }
                else{
                    System.out.println(txtMenu.textoSeparacion());
                    System.out.println("");
                    System.out.println("");
                }
            } catch (NumberFormatException | ExcepcionIntervalo e) {
                System.out.println("Ha ocurrido un error, ingrese un valor numerico: "+e.getMessage());
            }
        }
    }
}