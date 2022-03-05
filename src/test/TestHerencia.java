
package test;

import dominio.Empleado;


public class TestHerencia {
    public static void main(String[] args) {
           Empleado empleado1 = new Empleado();
           System.out.println("empleado1 = " + empleado1);
           empleado1.setNombre("nelson");
           System.out.println("\n");
           System.out.println(empleado1.getNombre());
           System.out.println("empleado1 = " + empleado1);
    }
     
}
