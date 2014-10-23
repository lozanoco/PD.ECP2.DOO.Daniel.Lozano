package state.connection;

public class Parado extends Estado{

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
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());		
	}

	@Override
	public void enviar(String msg,Link link, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");		
	}

	@Override
	public void recibir(int respuesta,Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public String toString() {
		return "PARADO";
	}

}
