package Ejercicio1;

public class Catedratico extends Universidad{
    public String curso;
    public int aexp;

    //Constructor sin parametros
    public Catedratico(){
        this.curso="";
        this.aexp=0; // años de experiencia
    }
    //Constructor con parametros
    public Catedratico(String c,int ae){
        this.curso=c;
        this.aexp=ae;
    }
    //Metodos Get y Set
   
    private String getCurso() {
        return curso;
    }

    private String setCurso(String c) {
        this.curso = c;
    }
        private int getanios() {
        return aexp;
    }
    private int setanios(int ae) {
        this.aexp = ae;
    }
    // Metodo Adicional
      public void ensenar(){
        System.out.println("El Catedratico: " + this.nombre +" "+ this.apellido +" esta enseñar");
    
    }
     
     
}