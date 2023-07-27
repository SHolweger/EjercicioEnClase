package Ejercicio1;

public class EmpleadoAdministrativo extends Universidad{
    public String puesto;

    //Constructor sin parametros
    public EmpleadoAdministrativo(){
        this.puesto="";
    }
    //Constructor con parametros
    public EmpleadoAdministrativo(String p){
        this.puesto=p;
    }
   
    private String getPuesto() {
        return puesto;
    }

    private String setPuesto(String p) {
        this.puesto = p;
    }
      public void trabajar(){
        System.out.println("El empleado: " + this.nombre +" "+ this.apellido +" esta trabajando");
    
    }
     
     
}