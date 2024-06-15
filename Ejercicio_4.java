public class Ejercicio_4 {
    public static void main(String[] args) {
        String fraseOriginal = "Este es un ejercicio de string";
        String fraseInvertida = invertirPalabras(fraseOriginal);

        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public static String invertirPalabras(String frase) {
        String fraseInvertida = "";
        int inicioPalabra = frase.length();
        int finPalabra;

        for (int i = frase.length() - 1; i >= 0; i--) {
            if (frase.charAt(i) == ' ' || i == 0) {
                finPalabra = (i == 0) ? i : i + 1;
                String palabra = frase.substring(finPalabra, inicioPalabra);
                if (!fraseInvertida.isEmpty()) {
                    fraseInvertida += " ";
                }
                fraseInvertida += palabra;
                inicioPalabra = i;
            }
        }

        return fraseInvertida;
    }
}
