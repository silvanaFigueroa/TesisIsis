package autos;

import autos.AutoStateFactory.Estado;

public class Libre extends AbstractEstadoAuto{

	public Libre(Auto auto) {
		super(auto);
	}

	public void alquilado() {
		getAuto().setEstado(Estado.ALQUILADO);
	}
	

}
