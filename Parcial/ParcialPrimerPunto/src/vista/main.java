package vista;

import control.Funcionalidades;
import control.IFuncionalidades;
import control.INotificador;
import control.Notificador;
import java.util.ArrayList;
import java.util.List;
import modelo.Accion;
import control.IObservador;
import control.ObservadorAccion;
import modelo.SMSSystem;

/**
 *
 * @author Jesus David Cardenas Sandoval
 */

public class main {

    public static void main(String[] args) {
        //Crear observador
        IObservador obs = new ObservadorAccion();
        //lista de observadores
        List<IObservador> listaObservadores = new ArrayList<>();
        //asignar numero de telefono a quien se le enviara el mensaje
        SMSSystem sms = new SMSSystem("123456");
        //asginar por constructor listaObersavor y sms a notificador
        INotificador noti = new Notificador(listaObservadores,sms);
        noti.addObservador(obs);
        
        Accion a = new Accion("Cafe juan el pez", 15000, 10000, 50000, 10000);
        Accion a2 = new Accion("BBVA", 50000, 10000, 100000, 20000);
        List<Accion> listaAcciones = new ArrayList<>();
        IFuncionalidades fun = new Funcionalidades(listaAcciones, noti);
        fun.agregarAcciones(a2);
        fun.agregarAcciones(a);
        a.setPrecioActual(60000);
        fun.cambiarPrecio(a);
    }

}
