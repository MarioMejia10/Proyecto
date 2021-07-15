
package Ejercicios_Practicas;

/**
 *
 * @author Mario Mejia
 */
public class Ejercio2 {
    public static void main (String args[]){
    
        double numero1 = 10;
        double numero2 = 20; 
        double suma, resta, multiplicacion = 0;
        double division = 0; 
    
         suma = numero1 + numero2;
         resta = numero1 - numero2;
         multiplicacion = numero1 * numero2;
    
   
         if (numero2 != 0){
                division = numero1 / numero2;
         }
        
    
 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La division es: " + division);
}
}