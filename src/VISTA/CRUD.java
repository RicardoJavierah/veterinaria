package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import LOGICA.Controlador;
import LOGICA.Duenio;
import LOGICA.Mascota;
import UTIL.Validacion;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CRUD extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField txtNumCliente;
	private JTextField txtNameMascota;
	private JTextField txtRaza;
	private JTextField txtColor;
	private JComboBox cboAlergia;
	private JComboBox cboAtencion;
	private JTextField txtNameDuenio;
	private JTextField txtTelf;
	private JScrollPane scrollPane;
	private JTextArea txtAreaObservacion;
	private JButton btnIngresar;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JButton btnBuscar;
	private JButton btnlista;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	DefaultTableModel defaulTableModel;
	
	Controlador controlador = new Controlador();
	
	
	
	//private ArrayList<Object> data = new ArrayList<Object>();

	public CRUD() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 940, 650);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MANTENIMIENTO DE  REGISTRO DE MASCOTAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif",Font.BOLD,16));
		lblNewLabel.setBounds(10, 41, 916, 18);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("N\u00FAmero Cliente :");
		lblNewLabel_1.setBounds(41, 116, 100, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre Mascota :");
		lblNewLabel_2.setBounds(41, 163, 123, 13);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Raza :");
		lblNewLabel_3.setBounds(41, 208, 100, 13);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Color :");
		lblNewLabel_4.setBounds(295, 116, 100, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel(" Al\u00E9rgico :");
		lblNewLabel_5.setBounds(295, 163, 100, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Atenci\u00F3n Especial :");
		lblNewLabel_6.setBounds(295, 208, 135, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Nombre del Due\u00F1o :");
		lblNewLabel_7.setBounds(539, 116, 135, 13);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Telf. Due\u00F1o :");
		lblNewLabel_8.setBounds(539, 163, 135, 13);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Obsevaci\u00F3n :");
		lblNewLabel_9.setBounds(539, 208, 135, 13);
		contentPane.add(lblNewLabel_9);
		
		txtNumCliente = new JTextField();
		txtNumCliente.setBounds(151, 113, 100, 19);
		contentPane.add(txtNumCliente);
		txtNumCliente.setColumns(10);
		
		txtNameMascota = new JTextField();
		txtNameMascota.setColumns(10);
		txtNameMascota.setBounds(161, 160, 100, 19);
		contentPane.add(txtNameMascota);
		
		txtRaza = new JTextField();
		txtRaza.setColumns(10);
		txtRaza.setBounds(99, 205, 105, 19);
		contentPane.add(txtRaza);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(346, 113, 105, 19);
		contentPane.add(txtColor);
		
		cboAlergia = new JComboBox();
		cboAlergia.setModel(new DefaultComboBoxModel(new String[] {"-", "SI", "NO"}));
		cboAlergia.setBounds(366, 159, 64, 21);
		contentPane.add(cboAlergia);
		
		cboAtencion = new JComboBox();
		cboAtencion.setModel(new DefaultComboBoxModel(new String[] {"-", "SI", "NO"}));
		cboAtencion.setBounds(412, 204, 64, 21);
		contentPane.add(cboAtencion);
		
		txtNameDuenio = new JTextField();
		txtNameDuenio.setColumns(10);
		txtNameDuenio.setBounds(661, 113, 203, 19);
		contentPane.add(txtNameDuenio);
		
		txtTelf = new JTextField();
		txtTelf.setColumns(10);
		txtTelf.setBounds(625, 160, 123, 19);
		contentPane.add(txtTelf);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(625, 204, 258, 58);
		contentPane.add(scrollPane);
		
		txtAreaObservacion = new JTextArea();
		scrollPane.setViewportView(txtAreaObservacion);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setBackground(Color.LIGHT_GRAY);
		btnIngresar.setBounds(41, 268, 115, 21);
		contentPane.add(btnIngresar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setBounds(161, 268, 115, 21);
		contentPane.add(btnEliminar);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBackground(Color.LIGHT_GRAY);
		btnActualizar.setBounds(280, 268, 115, 21);
		contentPane.add(btnActualizar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBackground(Color.LIGHT_GRAY);
		btnBuscar.setBounds(400, 268, 115, 21);
		contentPane.add(btnBuscar);
		
		btnlista = new JButton("LISTAR");
		btnlista.addActionListener(this);
		btnlista.setBackground(Color.LIGHT_GRAY);
		btnlista.setBounds(521, 268, 115, 21);
		contentPane.add(btnlista);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 318, 906, 260);
		contentPane.add(scrollPane_1);
		
		Object[][] data= {};
		String[] nameColumn = {"Numero Cliente", "Nombre Mascota", "Raza", "Color", "Al\u00E9rgico", "Atenci\u00F3n Esp.", "Nombre Due\u00F1o", "Telefono", "Observaci\u00F3n"};
		defaulTableModel = new DefaultTableModel(data,nameColumn);
		
		table_1 = new JTable();
		table_1.setModel(defaulTableModel);
		
		//Centrar columnas Jtable
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		
		table_1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		table_1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
		table_1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
		table_1.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
		
	
		TableColumnModel columnModel = table_1.getColumnModel(); 
		TableColumn column1 = columnModel.getColumn(0); 
		column1.setResizable(true); 
		//column1.setPreferredWidth(100);
	
		scrollPane_1.setViewportView(table_1);
		
		
	
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlista) {
			actionPerformedBtnlistaMascotaMascotarJButton(e);
		}
		if (e.getSource() == btnIngresar) {
			actionPerformedBtnIngresarJButton(e);
		}
	}
		
	protected void actionPerformedBtnIngresarJButton(ActionEvent e) {
		
		int numeroCliente = Integer.parseInt(txtNumCliente.getText());
		String nombreMascota = txtNameMascota.getText(); 
		String raza = txtRaza.getText();
		String color = txtColor.getText();
		String alergia = String.valueOf(cboAlergia.getSelectedItem());
		String atencion = String.valueOf(cboAtencion.getSelectedItem());
		String nombreDuenio = txtNameDuenio.getText();
		String telf = txtTelf.getText();
		String observacion = txtAreaObservacion.getText();
		
		boolean validacion= validaciones(String.valueOf(numeroCliente), nombreMascota, raza, color, nombreDuenio, telf, observacion);
		if(validacion) {
			defaulTableModel.addRow(new Object[] {numeroCliente,nombreMascota,raza,color,alergia,atencion,nombreDuenio,telf,observacion});
			controlador.guardarDuenioMascota(nombreDuenio, telf, numeroCliente, nombreMascota, raza, color, alergia, atencion, observacion);

		}
		//defaulTableModel.addRow(new Object[] {numeroCliente,nombreMascota,raza,color,alergia,atencion,nombreDuenio,telf,observacion});
		//controlador.guardarDuenioMascota(nombreDuenio, telf, numeroCliente, nombreMascota, raza, color, alergia, atencion, observacion);
	}
	
	protected void actionPerformedBtnlistaMascotaMascotarJButton(ActionEvent e) {
		ArrayList<Mascota> listaMascotaMascota = controlador.listarMascota();
		ArrayList<Duenio> listaDuenio = controlador.listarDuenio();
		
		for(int i=0; i < listaMascotaMascota.size();i++) {
			defaulTableModel.addRow(new Object[] {listaMascotaMascota.get(i).getNumCliente(),listaMascotaMascota.get(i).getNombreMascota()
									,listaMascotaMascota.get(i).getRaza(),listaMascotaMascota.get(i).getColor(),listaMascotaMascota.get(i).getAlergia(),
									listaMascotaMascota.get(i).getAtencion(),listaDuenio.get(i).getNombreCliente(),listaDuenio.get(i).getTelfDueno(),listaMascotaMascota.get(i).getObservaciones()});
		}
	}
	
	public boolean validaciones(String numeroCliente,String nombreMascota,String raza,String color,String nombreCliente,String telf, String observacion) {
		if(!numeroCliente.matches(Validacion.NUM_CLIENTE)) {
			mensaje("El numero de Cliente debe ser número");
			return false;
		}else if(!nombreMascota.matches(Validacion.NOMBRE_MASCOTA)) {
			mensaje("El nombre de la mascota debe ser texto de 40 caracteres maximo");
			return false;
		}else if(!raza.matches(Validacion.RAZA_MASCOTA)){
			mensaje("La raza debe ser texto con un maximo de 20 caracteres");
			return false;
		}else if(!color.matches(Validacion.COLOR_MASCOTA)) {
			mensaje("El color debe ser texto con un maximo de 20 caracteres");
			return false;
		}else if(cboAlergia.getSelectedIndex()==0) {
			mensaje("La alergia debe ser \"SI\" o \"NO\"");
			return false;
		}else if(cboAtencion.getSelectedIndex()==0) {
			mensaje("La atención debe ser \"SI\" o \"NO\"");
			return false;
		}else if(!nombreCliente.matches(Validacion.NOMBRE_DUENIO)) {
			mensaje("El nombre del Dueño debe ser como maximo 50 caracteres");
			return false;
		}else if(!telf.matches(Validacion.TELF_DUENIO)) {
			mensaje("El telefono debe ser 9 digitos");
			return false;
		}else if(!observacion.matches(Validacion.OBSERVACIONES)) {
			mensaje("La observacion es como maximo 255 caracteres");
			return false;
		}else {
			mensaje("Registro exitoso en la Base de Datos");
			return true;
		}
		
	}
	
	
	private void mensaje(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
