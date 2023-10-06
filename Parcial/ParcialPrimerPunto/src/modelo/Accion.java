
package modelo;


public class Accion{
    
    private String nombreAccion;
    private double precioActual;
    private double precioAnterior;
    private double umbralSuperior;
    private double umbralInferior;

    public Accion(String nombreAccion, double precioActual, double precioAnterior, double umbralSuperior, double umbralInferior) {
        this.nombreAccion = nombreAccion;
        this.precioActual = precioActual;
        this.precioAnterior = precioAnterior;
        this.umbralSuperior = umbralSuperior;
        this.umbralInferior = umbralInferior;
    }

    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public double getPrecioAnterior() {
        return precioAnterior;
    }

    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    public double getUmbralSuperior() {
        return umbralSuperior;
    }

    public void setUmbralSuperior(double umbralSuperior) {
        this.umbralSuperior = umbralSuperior;
    }

    public double getUmbralInferior() {
        return umbralInferior;
    }

    public void setUmbralInferior(double umbralInferior) {
        this.umbralInferior = umbralInferior;
    }

    
}
