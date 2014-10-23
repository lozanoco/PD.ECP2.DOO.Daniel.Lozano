package state.connection;

public class Esperando extends Estado{

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	@Override
	public void enviar(String msg,Link link, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");	 		
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		if (respuesta == 0) {
            conexion.setEstado(new Preparado());
        } else {
        	 conexion.setEstado(new Cerrado());
        }		
	}

	@Override
	public String toString() {
		return "ESPERANDO";
	}

}
