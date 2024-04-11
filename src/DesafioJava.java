import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {

        Scanner CuentaBancaria = new Scanner(System.in); // Crear un objeto Scanner
        double saldo = 5500;
        int opcion = 0;

        System.out.println("Por favor Ingresa tu Nombre: ");
        String nombreDelUsuario = CuentaBancaria.nextLine();// Utilizar nextLine() para leer una línea de texto

        // Mostrar un saludo con el nombre ingresado
        System.out.println("Hola! " + nombreDelUsuario + ", Bienvenido(a) al Banco Wayne!");
        System.out.println("Señor(a) " +nombreDelUsuario+ ", su tipo de Cuenta es corriente y su saldo actual es de: "+saldo);

        String menu = """
                Escriba Por Favor el número de la opción deseada:
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                4 - Salir""";

        while (opcion != 4) {
            System.out.println(menu);
            opcion = CuentaBancaria.nextInt();
            System.out.println("La opcion escogida es: " + opcion);


            switch (opcion) {
                case 1:
                    System.out.println("Hola! " + nombreDelUsuario + ", Su saldo actual es de: " + saldo);
                    break;
                case 2:
                    System.out.println("Hola Sr(a) " + nombreDelUsuario + " Su saldo actual es de: " + saldo + ", Cuanto desea Retirar");
                    double retiro = CuentaBancaria.nextDouble();
                    if (saldo > retiro) {
                        double saldoActual = (saldo - retiro);
                        System.out.println("Confirmacion de retiro: " + retiro + ", su saldo actual es de: " + saldoActual);
                    } else {
                        System.out.println("Su Saldo es insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Hola Sr(a) " + nombreDelUsuario + " Su saldo actual es de: " + saldo + ", Cuanto desea Depositar");
                    double deposito = CuentaBancaria.nextDouble();
                    double saldoActualDeposito = saldo + deposito;
                    System.out.println("Hola! " + nombreDelUsuario + ", Confirmacion de deposito de: " + deposito +
                            " Su saldo actual es de: " + saldoActualDeposito + ", Gracias, feliz día!");
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios! " +
                            "Recuerde que estamos a su disposicion.");
                    break;
                // otros casos posibles...
                default:
                    System.out.println("Opcion no valida, por favor verifique e ingresa la opcion deseada");
            }
        }
    }
}

