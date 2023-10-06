/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.IMetodoPago;

/**
 *
 * @author ideapad330S
 */
public class ProcesadorPago {
    
    private IMetodoPago metodoP;

    public ProcesadorPago(IMetodoPago metodoP) {
        this.metodoP = metodoP;
    }
    
    public void procesarPago(){
        if(metodoP.pagar()){
            System.out.println("Pago exitoso");
        }else{
            System.out.println("El pago fallo");
        }
    }

    public IMetodoPago getMetodoP() {
        return metodoP;
    }

    public void setMetodoP(IMetodoPago metodoP) {
        this.metodoP = metodoP;
    }
    
    
}
