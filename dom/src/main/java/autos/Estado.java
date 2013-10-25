package autos;

public abstract class Estado {

       protected Auto auto;
    
    public abstract Estado libre();
    public abstract Estado alquilado();
}
