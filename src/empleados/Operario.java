/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class Operario extends Tecnico{
    
    private int no_li;
    private boolean planta;
    
    
    /*public Operario(String nombre, int edad, String RFC, String puesto, int no_li,boolean planta) {
        super(nombre, edad, RFC, puesto);
        this.no_li = no_li;
        this.planta = planta;
    }
    */

    public Operario(String nombre, int edad, String RFC, String puesto, String titulo, boolean equipo, int no_li, boolean planta) {
        super(nombre,edad,RFC,puesto,titulo,equipo);
        this.no_li = no_li;
        this.planta = planta;
    }
}
