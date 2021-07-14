
public class Maestro
{
    // Propiedades
    private String identidad;
    private String name;
    private int edad;
    private String sexo;
    private String altura;
    // Constructor por defecto
    public Maestro(){
    }
    // Constructor personalizado
    public Maestro(String identidad, String name){
        this.setIdentidad(identidad);
        this.setName(name);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setAltura(altura);
    } 

    // Metodos para obtener la informacion
    public String getIdentidad(){
        return identidad;
    }

    public String getName(){
        return name;
    }

    public int getEdad(){
        return edad;
    }

    public String getSexo(){
        return sexo;
    }   
    
     public String getAltura(){
        return altura;
    }   

    // Metodos para establecer los datos
    public void setIdentidad(String identidad){
        this.identidad = identidad;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setAltura(String altura){
        this.altura = altura;
    }
}
