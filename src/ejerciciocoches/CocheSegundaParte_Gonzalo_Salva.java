package ejerciciocoches;


import javax.swing.*;

public class CocheSegundaParte_Gonzalo_Salva extends Cotxe_gonzalo_salva {
    protected CambiarMarchaAutomatica cambiarmarchaautomatica; //Protected: no se podra modificar dentro de la subclase.No se puede hacer @override con el protected
    protected CambiarMarchaManual cambiarmarchamanual;

    public CocheSegundaParte_Gonzalo_Salva(String marca, String modelo, TipoCanvio tipocanvio, EstadoMotorCoche estadomotor, CambiarMarchaAutomatica cambiarmarchaautomatica, CambiarMarchaManual cambiarmarchamanual) {
        super(marca, modelo, tipocanvio, estadomotor);
        this.cambiarmarchaautomatica = cambiarmarchaautomatica;
        this.cambiarmarchamanual = cambiarmarchamanual;
    }

    public enum CambiarMarchaAutomatica {
        F,
        N,
        R,
    }

    public enum CambiarMarchaManual {
        R,
        N,
        primera,
        segunda,
        tercera,
        cuarta,
        quinta,
        sexta,
    }

    // Cambiamos la marcha automática del coche
    public void CambiarMarchaAutomatica(char marcha) throws Exception {
        if (tipocanvio == TipoCanvio.CanvioAutomatico) {
            switch (marcha) {
                case '+':
                    if (cambiarmarchaautomatica.equals(cambiarmarchaautomatica.N)) { //La marcha se enceuntra en Neutral
                        cambiarmarchaautomatica = cambiarmarchaautomatica.F;    // La marcha pasa a Forward
                    } else if (cambiarmarchaautomatica.equals(cambiarmarchaautomatica.F)) { //La marcha se enceuntra en Forward
                        throw new Exception("ERROR: ¡No puedes subir más de marcha!"); // No se puede subir más de marcha, por lo tanto se muestra un mensaje.
                    } else { //Se da por hecho que la marcha está en Reverse y se quiere subir a Neutral
                        cambiarmarchaautomatica = cambiarmarchaautomatica.N;
                    }
                    break;
                case '-':
                    if (cambiarmarchaautomatica.equals(cambiarmarchaautomatica.N)) { //Si la marcha está en Neutral...
                        cambiarmarchaautomatica = cambiarmarchaautomatica.R;         //Marcha Reverse
                    } else if (cambiarmarchaautomatica.equals(cambiarmarchaautomatica.R)) { //Si la marcha está en Reversa...
                        throw new Exception("ERROR: ¡No puedes bajar más de marcha!");
                    } else { //Se da por hecho que la marcha está en Reverse y se quiere subir a Neutral
                        cambiarmarchaautomatica = cambiarmarchaautomatica.N; //Se da por hecho que la marcha está en Forward y baja a Neutral
                    }
                    break;

                default:
                    throw new Exception("Debes poner uno de los siguientes simbolos: + o -");
            }
        }
        else{
            System.out.println("Se encuentra en un coche automático");
        }
}


    public void CambiarMarchaManual(char marcha) throws Exception {
        if (tipocanvio == TipoCanvio.CanvioManual) {
            switch (marcha) {
                case '+':
                    if (cambiarmarchamanual.equals(cambiarmarchamanual.N)) {
                        cambiarmarchamanual = cambiarmarchamanual.primera;
                    } else if (cambiarmarchamanual.equals(cambiarmarchamanual.primera)) {
                        cambiarmarchamanual = cambiarmarchamanual.segunda;
                    } else if (cambiarmarchamanual.equals(cambiarmarchamanual.segunda)) {
                        cambiarmarchamanual = cambiarmarchamanual.tercera;
                    } else if (cambiarmarchamanual.equals(cambiarmarchamanual.tercera)) {
                        cambiarmarchamanual = cambiarmarchamanual.cuarta;
                    } else if (cambiarmarchamanual.equals(cambiarmarchamanual.cuarta)) {
                        cambiarmarchamanual = cambiarmarchamanual.quinta;
                    } else if (cambiarmarchamanual.equals(cambiarmarchamanual.quinta)) {
                        cambiarmarchamanual = cambiarmarchamanual.sexta;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.sexta)) {
                        throw new Exception ("Error: ¡No se puede subir a una septima marcha!");
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.R)) {
                        cambiarmarchamanual = cambiarmarchamanual.N;
                    }

                    break;

                case '-':
                    if (cambiarmarchamanual.equals(cambiarmarchamanual.sexta)) {
                        cambiarmarchamanual = cambiarmarchamanual.quinta;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.quinta)) {
                        cambiarmarchamanual = cambiarmarchamanual.cuarta;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.cuarta)) {
                        cambiarmarchamanual = cambiarmarchamanual.tercera;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.tercera)) {
                        cambiarmarchamanual = cambiarmarchamanual.segunda;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.segunda)) {
                        cambiarmarchamanual = cambiarmarchamanual.primera;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.primera)) {
                        cambiarmarchamanual = cambiarmarchamanual.N;
                    }
                    else if (cambiarmarchamanual.equals(cambiarmarchamanual.N)) {
                        cambiarmarchamanual = cambiarmarchamanual.R;
                    }
                    else
                        throw new Exception ("Error: ¡No se puede bajar más de marcha!");
                    break;

                default: System.out.println("Debes poner uno de los siguientes simbolos: + o -");
            }
        }
        else{
            System.out.println("Se encuentra en un coche manual");
        }
    }

    //Generamos los Getter y los Setters

    public CambiarMarchaAutomatica getCambiarmarchaautomatica() {
        return cambiarmarchaautomatica;
    }

    public void setCambiarmarchaautomatica(CambiarMarchaAutomatica cambiarmarchaautomatica) {
        this.cambiarmarchaautomatica = cambiarmarchaautomatica;
    }

    public CambiarMarchaManual getCambiarmarchamanual() {
        return cambiarmarchamanual;
    }

    public void setCambiarmarchamanual(CambiarMarchaManual cambiarmarchamanual) {
        this.cambiarmarchamanual = cambiarmarchamanual;
    }
}
