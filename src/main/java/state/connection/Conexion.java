package state.connection;

public class Conexion {
    private Estado estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new Cerrado();
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void abrir() {
        estado.abrir(this);
    }

    public void cerrar() {
    	estado.cerrar(this);
    }

    public void parar() {
    	estado.parar(this);
    }

    public void iniciar() {
    	estado.iniciar(this);
    }

    public void enviar(String msg) {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.link.enviar(msg);
            this.estado = Estado.ESPERANDO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";
    }

    public void recibir(int respuesta) {
        if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = Estado.PREPARADO;
            } else {
                this.estado = Estado.CERRADO;
            }
        }
        assert false : "estado imposible";
    }

}
