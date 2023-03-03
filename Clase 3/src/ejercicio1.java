import java.util.Arrays;

public class ejercicio1 {

    // 1.a
    public void contarLetra() {

        String string1 = "prueba para contar cuantas veces se repite la letra";
        char letra = 'a';

        int contador = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("Ejercicio 1.a: La letra especificada se repite '" + contador + "' veces.");
    }

    // 1.b
    public void ordenarNumeros() {
        int [] numeros  = {7,2,4};
        boolean ascendente = false;
        int temporal = 0;

        if (ascendente == true) {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] > numeros[j]) {
                        temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 1; j < (numeros.length - i); j++) {
                    if (numeros[j - 1] < numeros[j]) {
                        temporal = numeros[j - 1];
                        numeros[j - 1] = numeros[j];
                        numeros[j] = temporal;
                    }
                }
            }
        }
        System.out.println("Ejercicio 1.b: El vector ordenado es " + Arrays.toString(numeros));
    }

    // 1.c
    public void sumarMayores() {
        int [] numeros  = {6,12,5};
        int mayorQue = 5;
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayorQue) {
                suma += numeros[i];
            }
        }
        System.out.println("Ejercicio 1.c: La suma de los mayores que '" + mayorQue + "' es: " + suma);
    }

    public static void main(String[] args) {
        
        // 1.a
        ejercicio1 ej1 = new ejercicio1();
        ej1.contarLetra();
        // 1.b
        ej1.ordenarNumeros();
        // 1.c
        ej1.sumarMayores();
    }
}
