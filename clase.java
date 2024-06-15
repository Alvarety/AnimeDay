import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class clase {
	
    public double calcularIMC(double pesoKg, double alturaMetros) {
        double imc = pesoKg / Math.pow(alturaMetros, 2);
        return imc;
    }
    
    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 24.9 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
    
    public boolean esPar(int numero) { 
        return numero % 2 == 0; 
    } 
    
    public String ejecutarSaludo(String saludo, String nombre) { 
        return saludo + ' ' + nombre; 
    } 
    
    public double interesCompuesto(double monto, float tasa, int períodos){
        for(int n = 1; n <= períodos; n++ ){
           monto += monto * tasa / 100;
        }
        return monto;
    }
    
    public String redondear(double promedio) {  
    	DecimalFormat df = new DecimalFormat("0.00");  df.setRoundingMode(RoundingMode.HALF_UP);  
    	return df.format(promedio);
    }
    
    public int contarLetras(String palabra) {

        palabra=palabra.replaceAll("\\s","");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("Letra "+(i+1)+": "+palabra.substring(i, i+1));
            StringTokenizer st = new StringTokenizer(palabra);
      }
        
      return palabra.length();
    }
    
    public int contarCaracteresEnCadena(String cadena, String caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada                                 
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
    
}