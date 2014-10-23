package text;

public class Parrafo extends Estructura {

	@Override
	protected String addFinalDibujar() {
		
		return "\n";
	}


	@Override
	protected String mensajeAssert() {
		return "Error añadiendo componente en un parrafo";
	}

	@Override
	protected void lanzarAddNoComposite(Componente componente) {
		this.getComponentes().add(componente);
		
	}

	@Override
	protected void lanzarAddComposite(Componente componente) {
		throw new UnsupportedOperationException("No se pueden añadir compuestos a un parrafo");
		
	}
}
