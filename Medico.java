public class Medico{

 private String nombre;
 private long telefono;
 private String direccion [] ;

public Medico(){}

public Medico(String inombre, long itelefono, String idireccion) {

	nombre = inombre;
	telefono = itelefono;
	direccion = idireccion;
}

public void setNombre(String inombre){
	nombre = inombre;
}
public String getNombre(){
	return nombre;
}

public void setTelefono ( long itelefono){
	telefono = itelefono;
}
	public int getTelefono(){
		return telefono;
	}

public void setDireccion(String idireccion){
	direccion = idireccion;
}
public String getDireccion(){
	return direccion;
 }
}

	
}