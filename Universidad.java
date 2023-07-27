package EjercicioEnClase;

//Clase Main    
public class Universidad {
    public String nombre;
    public String apellido;
    public int edad;

    //Constructor sin parametros
    public Universidad(){
        this.nombre="";
        this.apellido="";
        this.edad=0;            
        }
        //Constructor con parametros
    public Universidad(String nom, String ape, int e){
        this.nombre=nom;
        this.apellido= ape;
        this.edad=e;
    }
//Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }
     private int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }
    
    public int getEdad() {
        return edaddad;
    }

    public void setEdad(int Edad) {
        this.Edad = edad;
    }
    
}

