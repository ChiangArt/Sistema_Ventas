package Proyecto;

public class Clase_Cliente {
	
	private String codigo, nombres, apellidos, direccion, telefono,dni;
	private int contadorCliente=1000;
	

	

	public Clase_Cliente(String nombres, String apellidos, String direccion, String telefono, String dni) {
		super();
		this.codigo = generarCodigo();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
		
		
	}


	public String generarCodigo() {
		return String.valueOf(contadorCliente++);
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	
}
