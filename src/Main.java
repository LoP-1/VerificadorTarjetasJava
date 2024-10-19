import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Iniciando Validador de Tarjetas");
        System.out.println("Ingrese numero de Tarjeta");
        String Tarjeta =  key.nextLine();

        validador val = new validador();

        if(val.validarTarjeta(Tarjeta)){
            System.out.println("La tarjeta es valida");
        }else{
            System.out.println("la tarjeta ingresada no es valida");
        }

    }
}
