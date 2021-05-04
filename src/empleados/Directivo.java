/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class Directivo extends Empleados{
    
    private String departamento;
    private long cedula;
    
    public Directivo(String nombre, int edad, String RFC, String puesto, String departamento, long cedula) {
        super(nombre, edad, RFC, puesto);
        this.departamento = departamento;
        this.cedula = cedula;
    }
   
    public void GetDirectivo(){
        System.out.println(YELLOW+"----------------------------------------------");
        System.out.println(RED+"Directivo");
        GetEmpleado();
        System.out.println(CIAN+"Su departamento es: "+ departamento);
        System.out.println(CIAN+"Su cedula es: " + cedula);       
        System.out.println(YELLOW+"----------------------------------------------");
    }
}
