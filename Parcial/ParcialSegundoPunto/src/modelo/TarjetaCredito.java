package modelo;

public class TarjetaCredito implements IMetodoPago {

    private double numTarjeta;
    private int clave;
    private double limiteTarjeta;

    public TarjetaCredito(double numTarjeta, int clave, double limiteTarjeta) {
        this.numTarjeta = numTarjeta;
        this.clave = clave;
        this.limiteTarjeta = limiteTarjeta;
    }

    public double getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(double numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getLimiteTarjeta() {
        return limiteTarjeta;
    }

    public void setLimiteTarjeta(double limiteTarjeta) {
        this.limiteTarjeta = limiteTarjeta;
    }

    @Override
    public boolean pagar() {
        if (verificarLimite()) {
            System.out.println("Pagando con Tarjeta de credito....");
            return true;
        }
        return false;
    }

    public boolean verificarLimite() {
        return this.limiteTarjeta > 5000;
    }
}
