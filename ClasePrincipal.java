
public class ClasePrincipal
{
    public static void main (String args []){
        
        Futbolista futbolista = new Futbolista();
        
        futbolista.estableceredad(24);
        System.out.println(futbolista.Edad());
        
        futbolista.establecerNombre("El nombre es: Neymar");
        System.out.println(futbolista.ObtenerNombre());
         
        futbolista.establecerEquipoActual("El equipo actual es: Paris Saint-Germain");
        System.out.println(futbolista.ObtenerEquipoActual());
        
        Barcelona barcelona = new Barcelona();
        Chelsea chelsea = new Chelsea();
        Manchestercity manchestercity = new Manchestercity();
         
        System.out.println();
        
        System.out.println("Equipo:" +barcelona.getEquipo());
        System.out.println("Capitan:" +barcelona.getCapitan());
        
        System.out.println("Equipo:" +chelsea.getEquipo());
        System.out.println("Capitan:" +chelsea.getCapitan());
        
        System.out.println("Equipo:" +manchestercity.getEquipo());
        System.out.println("Capitan:" +manchestercity.getCapitan());
        
    }
}
