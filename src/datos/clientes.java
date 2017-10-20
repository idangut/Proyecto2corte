package datos;

public class clientes {
	
	private String nombre;
	private String apellido;
	private String empresa;
	private String sueldo;
	private int cedula;
	private int edad;
	
	
	public clientes(String nombre, String apellido, String empresa, String sueldo, int cedula, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.sueldo = sueldo;
		this.cedula = cedula;
		this.edad = edad;
	}//clientes

    //GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getSueldo() {
		return sueldo;
	}


	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	//GETTERS AND SETTERS
	
	
}
