package vista;

import control.ProcesadorPago;
import modelo.*;

public class main {

    public static void main(String[] args) {
        IMetodoPago paypal = new Paypal("jdcardenas", "123");
        ProcesadorPago pPago = new ProcesadorPago(paypal);
        pPago.procesarPago();
        IMetodoPago transferencia = new TranseferenciaBancaria(13345, 123);
        pPago.setMetodoP(transferencia);
        pPago.procesarPago();
        IMetodoPago tarjeta = new TarjetaCredito(13345, 123,100000);
        pPago.setMetodoP(tarjeta);
        pPago.procesarPago();

    }

}
