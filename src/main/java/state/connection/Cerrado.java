package state.connection;

public class Cerrado extends Estado{

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new Preparado());
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		new Cerrado();
		
	}

	@Override
	public void parar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibir(int respuesta, Link link, Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CERRADO";
	}

}
