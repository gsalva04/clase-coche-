package ejerciciocoches;

public interface InterfazCoche {


    public void arrancaMotor() throws Exception;

    public EstadoMotorCoche compruebaMotor ();

    public int getRevolucions ();

    public void aturamotor () throws Exception;
}