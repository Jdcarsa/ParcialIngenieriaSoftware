/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;

import modelo.Accion;

/**
 *
 * @author Jesus David Cardenas Sandoval
 */
public interface INotificador {

    void addObservador(IObservador obsA);

    void notificarTodos(Accion a);

    void removeObservador(IObservador obsA);
    
}
