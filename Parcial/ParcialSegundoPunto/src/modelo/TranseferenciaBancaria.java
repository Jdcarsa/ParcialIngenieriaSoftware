package modelo;

public class TranseferenciaBancaria implements IMetodoPago {

    private double numCuentaBancaria;
    private int clave;

    public TranseferenciaBancaria(double numCuentaBancaria, int clave) {
        this.numCuentaBancaria = numCuentaBancaria;
        this.clave = clave;
    }

    public double getNumCuentaBancaria() {
        return numCuentaBancaria;
    }

    public void setNumCuentaBancaria(double numCuentaBancaria) {
        this.numCuentaBancaria = numCuentaBancaria;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public boolean pagar() {
         if(verificarCuenta()){
             System.out.println("Pagando con Transferencia Bancaria....");
             return true;
         }
        return false;
    }
    
    private boolean verificarCuenta(){
        return this.numCuentaBancaria > 0 && this.clave > 0;
    }
}
