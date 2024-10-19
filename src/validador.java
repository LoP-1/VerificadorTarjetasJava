public class validador {

    validador() {

    }

    public boolean validarTarjeta(String cardNumber) {


        int digitos = cardNumber.length();
        int sum = 0;
        boolean esSegundo = false;


        for (int i = digitos - 1; i >= 0; i--) {
            int d = cardNumber.charAt(i) - '0';
            System.out.println("\nProcesando dígito en la posición " + (i + 1) + ": " + d);

            if (esSegundo) {
                d = d * 2;
                System.out.println("El dígito " + cardNumber.charAt(i) + " fue duplicado a " + d);
            }

            if (d > 9) {
                System.out.println("El dígito duplicado es mayor que 9, sumando los dígitos de " + d);
                sum += d / 10;
                sum += d % 10;
                System.out.println("Suma actual: " + sum);
            } else {

                sum += d;
                System.out.println("El dígito sumado es menor o igual a 9, suma actual: " + sum);
            }

            esSegundo = !esSegundo;
        }

        System.out.println("\nSuma total final: " + sum);

        return sum % 10 == 0;
    }
}
