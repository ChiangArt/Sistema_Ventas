package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import Proyecto.Clase_Cliente;
import Proyecto.List_Cliente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dialog.ModalExclusionType;

public class Clientes extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textDni;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnConsulta;
	private JButton btnEliminar;
	private JButton btnListado;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatDarculaLaf.setup();
		UIManager.put( "Button.arc", 999 );
		UIManager.put( "TextComponent.arc" , 5 );
		UIManager.put( "ProgressBar.arc" , 999 );
		UIManager.put( "TextComponent.arc" , 999 );
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	List_Cliente listaCliente = new List_Cliente();


	public Clientes() {
		setTitle("Clientes");
		setBounds(250, 100, 822, 516);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		iniciarComponentes();
		
	}
	
	
	
	public void iniciarComponentes() {
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setBounds(10, 11, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(10, 47, 100, 25);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 83, 100, 25);
		contentPane.add(lblApellidos);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setBounds(10, 119, 100, 25);
		contentPane.add(lblDireccin);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(10, 155, 100, 25);
		contentPane.add(lblTelfono);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(10, 191, 100, 25);
		contentPane.add(lblDni);
		
		textCodigo = new JTextField();
		textCodigo.setEnabled(false);
		textCodigo.setEditable(false);
		textCodigo.setBounds(149, 11, 130, 25);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(149, 47, 130, 25);
		contentPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(149, 85, 130, 25);
		contentPane.add(textApellidos);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(149, 121, 130, 25);
		contentPane.add(textDireccion);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(149, 157, 130, 25);
		contentPane.add(textTelefono);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(149, 193, 130, 25);
		contentPane.add(textDni);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(325, 12, 120, 30);
		btnGuardar.addActionListener(this);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(325, 48, 120, 30);
		contentPane.add(btnModificar);
		
		btnConsulta = new JButton("CONSULTA");
		btnConsulta.setBounds(325, 84, 120, 30);
		contentPane.add(btnConsulta);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(325, 120, 120, 30);
		contentPane.add(btnEliminar);
		
		btnListado = new JButton("LISTADO");
		btnListado.setBounds(325, 156, 120, 30);
		contentPane.add(btnListado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 788, 227);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model=new DefaultTableModel();
		Object[] columna = {"CODIGO", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "TELÉFONO", "DNI"};
		Object[] fila = new Object[0];
		model.setColumnIdentifiers(columna);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		listaCliente.gestionarClientes();
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnGuardar) {

			String nombres = textNombres.getText();
			String apellidos = textApellidos.getText();
			String direccion = textDireccion.getText();
			String telefono = textTelefono.getText();
			String dni = textDni.getText();
			
			Clase_Cliente clienteNuevo = new Clase_Cliente(nombres, apellidos, direccion, telefono, dni);
			listaCliente.agregarCliente(clienteNuevo);
			
		}
		
	}
}
