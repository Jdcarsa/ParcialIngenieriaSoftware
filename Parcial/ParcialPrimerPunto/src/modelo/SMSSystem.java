
package modelo;


public class SMSSystem {
    
    
    private String numTel;
    private String mensaje;

    public SMSSystem(String numTel) {
        this.numTel = numTel;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    public void sendMensaje(){
        System.out.println("enviando SMS sobre "+ mensaje  + " a : " + numTel);
    }
}
