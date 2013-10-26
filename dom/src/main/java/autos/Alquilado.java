package autos;

import autos.AutoStateFactory.Estado;

public class Alquilado  extends AbstractEstadoAuto{

	public Alquilado(Auto auto) {
		super(auto);
	}
	
	public void libre() {
		  getAuto().setEstado(Estado.LIBRE);
	 }
	 

}
