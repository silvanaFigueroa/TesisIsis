package autos;

public class Libre extends Estado{

	@Override
	public Estado libre() {
		
		return this;
	}

	@Override
	public Estado alquilado() {
		Estado nuevoEstado=new Alquilado();
		return nuevoEstado;
	}

}
