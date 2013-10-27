package autos;

import org.apache.isis.applib.annotation.NotPersistable;

import autos.AutoStateFactory.Estado;

@NotPersistable
public class Libre extends AbstractEstadoAuto{

	public Libre(Auto auto) {
		super(auto);
	}

	public void alquilado() {
		getAuto().setEstado(Estado.ALQUILADO);
	}
	

}
