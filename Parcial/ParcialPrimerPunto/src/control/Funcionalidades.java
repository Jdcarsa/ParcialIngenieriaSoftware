package control;

import java.util.List;
import modelo.Accion;

public class Funcionalidades implements IFuncionalidades {

    private INotificador noti;
    private List<Accion> acciones;

    public Funcionalidades(List<Accion> acciones, INotificador noti) {
        this.noti = noti;
        this.acciones = acciones;
    }

    @Override
    public void agregarAcciones(Accion ac) {
        acciones.add(ac);
    }

    @Override
    public void eliminarAcciones(Accion ac) {
        acciones.remove(ac);
    }

    @Override
    public void cambiarPrecio(Accion a) {
        for (Accion ac : acciones) {
            if (ac.getNombreAccion().equals(a.getNombreAccion())) {
                ac.setPrecioActual(a.getPrecioActual());
                this.verficiarPrecioAccion(a);
            }
        }
    }

    @Override
    public void verficiarPrecioAccion(Accion a) {
        if (a.getPrecioActual() > a.getUmbralSuperior() || a.getPrecioActual() < a.getUmbralInferior()) {
            a.setPrecioAnterior(a.getPrecioActual());
            a.setPrecioActual(a.getPrecioActual() + (a.getPrecioActual()*0.05));
            a.setUmbralSuperior(a.getPrecioActual()+a.getPrecioActual()*0.5);
            noti.notificarTodos(a);
        }
    }
}
