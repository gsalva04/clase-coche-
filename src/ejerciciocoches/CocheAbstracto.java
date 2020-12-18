package ejerciciocoches;

public abstract class CocheAbstracto implements InterfazCoche{

    protected String marca;
    protected String modelo;
    protected TipoCanvio tipocanvio;
    protected EstadoMotorCoche estadomotor;
    public CocheAbstracto (String marca, String modelo, TipoCanvio tipocanvio,EstadoMotorCoche estadomotor ) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipocanvio = tipocanvio;
        this.estadomotor = estadomotor;

    }
}
