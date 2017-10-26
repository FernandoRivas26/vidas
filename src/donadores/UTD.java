package donadores;

public class UTD 
{
	private int carrera;
	private String fecha;
	
	public int getCarrera() 
	{
		return carrera;
	}
	public void setCarrera(int carrera) 
	{
		this.carrera = carrera;
	}
	public String getFecha() 
	{
		return fecha;
	}
	public void setFecha(String fecha) 
	{
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "UTD [carrera=" + carrera + ", fecha=" + fecha + "]";
	}

}
