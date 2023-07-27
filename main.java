package Ejercicio1;

public class main {
    
public static void main(String[] args) {                
        Catedratico cat1 = new Catedratico ();
        cat1.nombre="Jose";
        cat1.apellido="Tuna";
        cat1.edad=44;
        cat1.ensenar();
        
        System.out.println(" La edad del catedratico es: "  +cat1.edad);
        
        Catedratico cat2 =new Catedratico("Microeconomia",18 );
          cat2.ensenar();
  
        System.out.println(" El catedratico lleva "+cat2.aexp+" años enseñando "+cat2.curso);

    Alumno alu1 = new Alumno ();
        alu1.nombre="Ary";
        alu1.apellido="Recinos";
        alu1.edad=19;
        alu1.carrera="Ingenieria en Sistemas";
        alu1.estudiar();
        
        System.out.println(" La carrera del alumno es: "  + alu1.carrera);
    
        EmpleadoAdministrativo eadmin1 = new EmpleadoAdministrativo ();
        eadmin1.nombre="Carlos Manuel";
        eadmin1.apellido="Enoc Vasquez";
        eadmin1.edad=34;
        eadmin1.puesto="Gerente";
        
        System.out.println("El empleado administrativo "+eadmin1.nombre+" "+eadmin1.apellido+" trabaja de: "+eadmin1.puesto);
        
        EmpleadoAdministrativo eadmin2 = new EmpleadoAdministrativo ();
        eadmin1.nombre="Pedro";
        eadmin1.apellido="Gonzalez";
        eadmin1.edad=52;
        eadmin1.puesto="Contador";
        
        System.out.println("El "+eadmin1.puesto+" tiene "+eadmin1.edad+" años de edad");
      }
}
