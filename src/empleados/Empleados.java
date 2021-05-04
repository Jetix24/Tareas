/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

public class Empleados {
    
    private String nombre;
    private int edad;
    private String RFC;
    private String puesto;
    
    public Empleados(String nombre, int edad, String RFC, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.RFC = RFC;
        this.puesto = puesto;
    }
    
    public void GetEmpleado(){
        System.out.println(CIAN+"El nombre es: " + nombre);
        System.out.println(CIAN+"La edad es: " + edad);
        System.out.println(CIAN+"El RFC es: " + RFC);
        System.out.println(CIAN+"Su puesto es: " + puesto);
    }
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String CIAN = "\u001B[36m";
    
}
