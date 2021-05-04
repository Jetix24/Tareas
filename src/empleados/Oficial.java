
package empleados;

public class Oficial extends Empleados {
    
    private char turno;
    private String contrato;
    
    public Oficial(String nombre, int edad, String RFC, String puesto, char turno, String contrato) {
        super(nombre, edad, RFC, puesto);
        this.turno = turno;
        this.contrato = contrato;
    }
    
}
