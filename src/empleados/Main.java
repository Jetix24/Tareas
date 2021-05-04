
package empleados;

public class Main {

    
    public static void main(String[] args) {
        
        Directivo Di = new Directivo("Pepe Areola Tepito", 32 , "ARTP241089HCH", "Gerente", "Sistemas", 9429849);
        Tecnico Te = new Tecnico("Oico Niners Corral", 25, "NICO251295HCH", "Mantenimiento" , "Mecanico", true);
        Operario Op = new Operario("Omara Quiyones Esperanza", 19, "QUEO210601HCH", "Ensamblador", "", true , 22 , false);
        Oficial Of = new Oficial("John Bon Johns Jovi", 30, "JOJJ010191", "Guardia", 'M', "Externo");
        
       Di.GetDirectivo();
       Te.GetTecnico();
       Op.GetOperario();
       Of.GetOficial();
    }
}
