
package empleados;

public class Oficial extends Empleados {
    
    private char turno;
    private String contrato;
    
    public Oficial(String nombre, int edad, String RFC, String puesto, char turno, String contrato) {
        super(nombre, edad, RFC, puesto);
        this.turno = turno;
        this.contrato = contrato;
    }
    public void GetOficial(){
        System.out.println(YELLOW+"----------------------------------------------");
        System.out.println(RED+"Oficial");
        GetEmpleado();
        System.out.println(CIAN+"Su turno es: " + turno);  
        System.out.println(CIAN+"Su contratacion es por empresa: " + contrato);
        System.out.println(YELLOW+"----------------------------------------------");
    }
    
}
