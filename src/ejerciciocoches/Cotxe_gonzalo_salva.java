package ejerciciocoches;

import ejerciciocoches.CocheAbstracto;
import ejerciciocoches.EstadoMotorCoche;
import ejerciciocoches.TipoCanvio;

import javax.swing.*;
import java.util.Random;

// extends: se utiliza para las subclases, se heredan los atributos y el constructor de la clase principal
public class Cotxe_gonzalo_salva extends CocheAbstracto {

    public Cotxe_gonzalo_salva(String marca, String modelo, TipoCanvio tipocanvio) {
        super(marca, modelo, tipocanvio);
    }

    //override: sobreescribe los metodos de la clase interfazcoche.java
    @Override
    //En el constructor hay que especificar "throws Exception", para poder lanzar una excepción después
    public void arrancaMotor() throws Exception {
        if (estadomotor != EstadoMotorCoche.EnMarcha) {
            this.estadomotor = EstadoMotorCoche.EnMarcha;//arrancamos el motor
            System.out.println("Motor arrancado");
        }else {
            throw new Exception("El motor ya está en marcha");
        }
    }

    @Override
    //public void: no necesita return porque la clase no devuelve nada. Pero si es public nombre, el return devolvera un nombre.
    public EstadoMotorCoche compruebaMotor() {
        return estadomotor;
    }

    @Override
    public int getRevolucions() {
        Random r=new Random(); //genera numero aleatorio
        if (estadomotor != EstadoMotorCoche.Parado){
            return r.nextInt(6499) + 1;
        }else{
            return 0;
        }
    }

    @Override
    public void aturamotor() throws Exception {
        if (estadomotor == EstadoMotorCoche.EnMarcha){
            this.estadomotor=EstadoMotorCoche.Parado;
            System.out.println("Motor parado");
        }else{
            throw new Exception("El motor ya esta parado");
        }
    }
}
