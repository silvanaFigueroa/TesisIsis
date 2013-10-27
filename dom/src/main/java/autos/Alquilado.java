package autos;

import org.apache.isis.applib.annotation.NotPersistable;

import autos.AutoStateFactory.Estado;

@NotPersistable
public class Alquilado  extends AbstractEstadoAuto{

	public Alquilado(Auto auto) {
		super(auto);
	}
	
	public void libre() {
		  getAuto().setEstado(Estado.LIBRE);
	 }
	 

}
