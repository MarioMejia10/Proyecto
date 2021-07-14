
/**
 * @author (Mario Mejia) 
 */
public class ClasePrincipal
{
    public static void main (String args []){
    
        System.out.println("Hola, Soy programador de UTH");
    
        Maestro maestro = new Maestro();
        
        maestro.setIdentidad("01072001004014");
        maestro.setName("Mario Mejia");
        maestro.setEdad(30);
        maestro.setSexo("Masculino");
        maestro.setAltura("1.80 m");
        
        System.out.println("La identidad del maestro es: "+ maestro.getIdentidad());
        System.out.println("El nombre del maestro es: "+ maestro.getName());
        System.out.println("La edad del maestro es: "+ maestro.getEdad());
        System.out.println("El sexo del maestro es: "+ maestro.getSexo());
        System.out.println("La altura del maestro es: "+ maestro.getAltura());
         
    }
    
}
