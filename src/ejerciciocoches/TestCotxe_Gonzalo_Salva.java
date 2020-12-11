package ejerciciocoches;

import java.sql.SQLOutput;

public class TestCotxe_Gonzalo_Salva {
    public static void main(String []args){
        Cotxe_gonzalo_salva audi = new Cotxe_gonzalo_salva("Audi", "Q7", TipoCanvio.CanvioAutomatico);
        try {
            System.out.println("Encendiendo el coche...");
            audi.arrancaMotor();
            System.out.println("Estado actual del motor: "+ audi.compruebaMotor());
            System.out.println("Revoluciones: "+ audi.getRevolucions());
            System.out.println("Apagando el coche...");
            audi.aturamotor();
            System.out.println("Revoluciones: "+ audi.getRevolucions());
            System.out.println("Estado actual del motor: "+audi.compruebaMotor());
            System.out.println("Apagando coche...");
            audi.aturamotor();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }



    }
}
