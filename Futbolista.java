
public class Futbolista
{
    private int edad;
    private String Nombre;
    private String EquipoActual; 

    public void estableceredad(int Edad){
        this.edad = edad;
    }

    public int Edad(){
        return edad;
    }

    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String ObtenerNombre(){
        return Nombre;
    }

    public void establecerEquipoActual(String EquipoActual){
        this.EquipoActual = EquipoActual;
    }

    public String ObtenerEquipoActual(){
        return EquipoActual;
    }
}