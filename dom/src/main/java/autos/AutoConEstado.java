package autos;

public class AutoConEstado {

	private Estado estado;
	
	public AutoConEstado() 
	{
	    
        //cuando se construye el auto el estado es Libre
        estado=new Libre();
    }
	public void alquilado()
	{
	        estado=estado.alquilado();
	}
	public void libre()
	{
	        estado=estado.libre();
	}   
	
}
