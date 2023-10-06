
package modelo;


public class Paypal implements IMetodoPago{
    
    private String usuario;
    private String clave;

    public Paypal(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public boolean pagar(){
        if(estaAutenticada()){
                System.out.println("Pagando con Paypal....");
                return true;
        }
        return false;
    }
    
    public boolean estaAutenticada(){
        return true;
    }
}
