package EjercicioEnClase;

public class Alumno extends Universidad{
    public String carrera;
    public String carnet;

    //Constructor sin parametros
    public Alumno(){
        this.carrera="";
        this.carnet="";
    }

    //Constructor con parametros
    public Alumno(String c,int ae){
        this.carrera="";
        this.carnet="";
    }
    //Metodos Get y Set
   
    private String getCarrera() {
        return carrera;
    }

    private String setCarrera(String car) {
        this.carrera = car;
    }

    private String getCarnet() {
        return carnet;
    }
    private String setCarnet(String carn) {
        this.carnet=carn;
    }
    // Metodo Adicional
      public void estudiar(){
        System.out.println("El Alumno: " + this.nombre +" "+ this.apellido +" esta estudiando");
    
    }
     
     
}