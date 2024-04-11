import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        //Contador de cuantas veces se ejecuto el ciclo
        double totalEvaluaciones = 0;

            //siempre que nota sea diferente a -1 el ciclo va a ser ejecutado
                // para salir del bucle, se debe digitar -1
        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
            //El if es para que no tome el -1 como valor para evaluar
            if (nota != -1){
                //mediaEvaluaciones = mediaEvaluaciones + nota; "lo mismo de la siguiente linea"
                mediaEvaluaciones += nota;
                //Cada vez que el ciclo se ejecute, suma 1
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }

}
