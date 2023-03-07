public class ejercicio2 {
    private static String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";
    
    public static String codificar(String texto, int desplazamiento) {
        char[] caracteres = texto.toLowerCase().toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int indice = ABECEDARIO.indexOf(caracteres[i]);
            if (indice >= 0) {
                int nuevoIndice = (indice + desplazamiento) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }
    
    public static String decodificar(String textoCodificado, int desplazamiento) {
        char[] caracteres = textoCodificado.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            int indice = ABECEDARIO.indexOf(caracteres[i]);
            if (indice >= 0) {
                int nuevoIndice = (indice - desplazamiento + ABECEDARIO.length()) % ABECEDARIO.length();
                caracteres[i] = ABECEDARIO.charAt(nuevoIndice);
            }
        }
        return String.valueOf(caracteres);
    }

    public static void main(String[] args) {
        ejercicio2 ej2 = new ejercicio2();
        System.out.println(ej2.codificar("Prueba de Codificacion", 2));
        System.out.println(ej2.decodificar("qsvfcb ef efdpejgjdbdjpñ", 1));
    }
}
