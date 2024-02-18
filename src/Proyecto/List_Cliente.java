package Proyecto;


import java.util.ArrayList;


public class List_Cliente {
	
	private ArrayList<Clase_Cliente> listaClientes;
	
	
	public void gestionarClientes() {
		this.listaClientes=new ArrayList<>();
	}
	
	public void agregarCliente(Clase_Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	
}

	
