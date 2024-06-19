package clase;

import java.util.Scanner;

public class principal {
     public static void main (String args[]) {
    	 clase objeto = new clase(); 
	     double imc = objeto.calcularIMC(75, 1.80); 
	     String clasificacion = objeto.clasificarIMC(imc); 
	
	     System.out.println("IMC: " + imc); 
	     System.out.println("Clasificación: " + clasificacion); 
	     
	     System.out.println(objeto.ejecutarSaludo("Hola", "Agustín"));
	     
	     System.out.println("Interés: " + objeto.interesCompuesto(10000.0, 5.9f, 60));	 
	
	     System.out.println("Interés redondeado: " + objeto.redondear(objeto.interesCompuesto(10000.0, 5.9f, 60)));	 
     
	     System.out.println ("Prueba de contar letras");
	     System.out.println ("Por favor introduzca una cadena por teclado:");
	     Scanner sc = new Scanner(System.in);
	     String palabra="";
	     palabra=sc.nextLine();
	     System.out.println("El texto introducido tiene " + objeto.contarLetras(palabra) + " letras.");
	     
	     System.out.println ("Contar la siguiente letra en el texto anterior:");
	     String letra="";
	     letra=sc.nextLine();
	     System.out.println("La letra buscada aparece " + objeto.contarCaracteresEnCadena(palabra, letra) + " veces.");
     }
}
