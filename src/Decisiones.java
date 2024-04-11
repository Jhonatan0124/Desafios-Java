public class Decisiones {
    public static void main(String[] args) {
        int fechaDelanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
//codigo que prueba los operadores relacionales
        if (fechaDelanzamiento >= 2022) {
            System.out.println("Péliculas Más Populares");
        }else {
            System.out.println("Péliculas Retro que aún vale la pena Ver");
        }

        /* if (incluidoEnElPlan || tipoPlan == "plus") */
        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su Pelicula");
        }else {
            System.out.println("Pelicula no disponible en su plan actual");
        }
        /* ambas deben ser correctas */
        if (incluidoEnElPlan &&  tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su Pelicula");
        }else {
            System.out.println("Pelicula no disponible en su plan actual");
        }
    }
}
