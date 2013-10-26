package autos;

import java.text.MessageFormat;

public abstract class AbstractEstadoAuto implements IEstado{

	private Auto auto;
	
	public AbstractEstadoAuto(Auto auto) 
	{
	   this.auto=auto; 
         
    }
	
	
	public Auto getAuto() {
		return auto;
	}
	@Override
	public void alquilado() {
		System.out.println("pasa por abstract alquilado");
		throw new IllegalStateException(MessageFormat.format("el auto  en estado {0} no puede alquilarse", auto.getEstado().getClass().getSimpleName()));
	}

	@Override
	public void libre() {
		throw new IllegalStateException(MessageFormat.format("el auto en estado {0} no puede liberarse", auto.getEstado().getClass().getSimpleName()));
	}
	
}
