import javax.swing.*;
public class Ejercicio4
{
  public static void main (String args[]){
      
    // Declaramos e inicializamos el arreglo
    String arreglo[]= {"San Pedro Sula","Tegucigalpa","El Progreso","Lempira",
                       "Puerto Cortés","La Ceiba","Choluteca","Colón",
                       "Catacamas","Tela","Arizona","Trujillo",
                       "Olanchito","Santa Cruz de Yojoa","Siguatepeque",
                       "Yoro","Sonaguera","Omoa","Santa Barbara","Santa Rosa de Copán"};

   // Funcion que Imprime el arreglo y recibe el arreglo 
   mensaje("Dimension del arreglo: "+arreglo.length);
 
   mensaje("El contenido del arreglo: \n"+imprimir(arreglo));
 
}
public static String imprimir(String arre[])
{
    String c="";
    for(int i=0; i<arre.length; i++)
    { 
     c+=" [ "+arre[i]+" ] "+"\n";
    }
return c;  
        
  }
  public static void mensaje(String msj)
    {
        JOptionPane.showMessageDialog(null,msj,"ATENCION",1);
    }  
}
    