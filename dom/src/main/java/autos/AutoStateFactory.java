package autos;

import org.apache.isis.applib.annotation.Hidden;


public class AutoStateFactory {
	@Hidden
	public enum Estado {
		LIBRE, ALQUILADO;
	}
	
	public static IEstado buildState(Estado estado, Auto auto) {
		IEstado cs = null;
		switch (estado) {
			case LIBRE:
				cs = new Libre(auto);
				break;
			case ALQUILADO:
				cs = new Alquilado(auto);
				break;
			
			default:
				throw new IllegalArgumentException();
		}
		return cs;
	}
}