
package control;

import modelo.SMSSystem;
import java.util.List;
import modelo.Accion;



public class Notificador implements INotificador {
    
    private List<IObservador> observadores;
    private SMSSystem sms;
    
    public Notificador(List<IObservador> observadores, SMSSystem sms){
        this.observadores = observadores;
        this.sms = sms;
    }
    
    @Override
    public void addObservador(IObservador obsA){
        observadores.add(obsA);
    }
    
    @Override
    public void removeObservador(IObservador obsA){
        observadores.remove(obsA);
    }
    
    @Override
    public void notificarTodos(Accion a){
        for(IObservador obs : observadores){
            obs.notificarUsuarios(a);
            sms.setMensaje(" cambios en: " +a.getNombreAccion());
            sms.sendMensaje();
        }
    }
}
