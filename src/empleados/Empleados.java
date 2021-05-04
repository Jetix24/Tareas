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
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
        System.out.println("El RFC es " + RFC);
        System.out.println("Su puesto es " + puesto);
    }
    
}
