/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class Tecnico extends Empleados {
    
    private String titulo;
    private boolean equipo;

    public Tecnico(String nombre, int edad, String RFC, String puesto, String titulo, boolean equipo) {
        super(nombre, edad, RFC, puesto);
        this.titulo = titulo;
        this.equipo = equipo;
    }
    public void GetTecnico(){
        System.out.println(YELLOW+"----------------------------------------------");
        System.out.println(RED+"Tecnico");
        GetEmpleado();
        System.out.println(CIAN+"Su titulo es: " + titulo); 
        if(equipo == true){
            System.out.println(CIAN+"Si tiene equipo ");
        }else{
            System.out.println(CIAN+"No tiene equipo ");
        }
        System.out.println(YELLOW+"----------------------------------------------");
    }
}
