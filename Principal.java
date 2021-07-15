// En la esquina doy mi expicacion Readme.txt 
public class Principal
{
   public static void main (String args[]){
    
    Circulo circulo = new Circulo();
    Linea linea = new Linea();
    Triangulo triangulo = new Triangulo();
    Cuadrado cuadrado = new Cuadrado();
    
    System.out.println (circulo.Dibujar("Circulo"));
    System.out.println(circulo.CalcularRadio());
    
    System.out.println (linea.Dibujar("Linea ---------"));
    
    System.out.println (triangulo.Dibujar("Triangulo"));
    System.out.println(triangulo.CalcularArea());
    
    System.out.println (cuadrado.Dibujar("Cuadrado"));
    System.out.println(cuadrado.CalcularArea());
}
}
