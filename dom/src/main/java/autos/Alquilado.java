package autos;

public class Alquilado  extends Estado{

	@Override
	public Estado libre() {
		Estado nuevoEstado=new Libre();
		return nuevoEstado;
	}

	@Override
	public Estado alquilado() {
		
		return this;
	}

}
