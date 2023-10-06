/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import modelo.Accion;


/**
 *
 * @author Jesus David Cardenas Sandoval
 */
public class ObservadorAccion implements IObservador{
    
    
    @Override
    public void notificarUsuarios(Accion a) {
        System.out.println("Notificando usuarios sobre cambios en: " + a.getNombreAccion() 
                + " Precio anterior: "+ a.getPrecioAnterior() + " ,Precio nuevo: " + a.getPrecioActual());
    }
    
}
