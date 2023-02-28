public class ejercicio1y2 {
    public static void main(String[] args) {

        // Ejercicio 1
        // a)
        System.out.println("Ejercicio 1.a");
        int i = 0;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        } // 0 1 2 3 4 5 6 7 8 9 10

        // b)
        System.out.println();
        System.out.println("Ejercicio 1.b");
        int x = 0;
        while(x <= 10) {
            if(x % 2 == 0){
                System.out.print(x + " ");
            }
            x++;
        } // 0 2 4 6 8 10

        // c)
        System.out.println();
        System.out.println("Ejercicio 1.c");
        int y = 0;
        String opcion = "impar"; // elegir "par" o "impar"
        while(y <= 10) {
            if(opcion.equals("par") && y % 2 == 0){
                System.out.print(y + " ");
            } else if (opcion.equals("impar") && y % 2 != 0) {
                System.out.print(y + " ");
            }
            y++;
        } // 0 2 4 6 8 10   o    1 3 5 7 9

        // d)
        System.out.println();
        System.out.println("Ejercicio 1.d");
        for( i = 10; i >= 0; i--){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        } // 10 8 6 4 2 0

        // Ejercicio 2
        System.out.println();
        System.out.println("Ejercicio 2.d");
        float ingresos = 500000;
        int vehiculosMenorCincoAños = 0;
        int inmuebles = 1;
        boolean bienesLujo = false;

        if( (ingresos >= 489086) || (vehiculosMenorCincoAños >= 3) || (inmuebles >= 3) || (bienesLujo == true)) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }
    }
}