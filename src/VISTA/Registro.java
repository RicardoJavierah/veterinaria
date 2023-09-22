package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LOGICA.Controlador;
import UTIL.Validacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.DefaultComboBoxModel;

public class Registro extends JFrame implements ActionListener {

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
	private JLabel lblNewLabel_10;
	private JTextField txtNumCliente;
	private JTextField txtNameMascota;
	private JTextField txtRaza;
	private JTextField txtColor;
	private JComboBox cboAlergia;
	private JComboBox cboAtencion;
	private JTextField txtNameDueno;
	private JTextField txtTelfDueno;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JButton btnLimpiar;
	private JButton btnGuardar;
	

	public Registro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 750);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("REGISTRO DATOS");
		lblNewLabel.setFont(new Font("SansSerif",Font.BOLD,16));
		lblNewLabel.setBounds(298, 28, 152, 23);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cliente N\u00B0:");
		lblNewLabel_1.setBounds(26, 110, 65, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre Mascota:");
		lblNewLabel_2.setBounds(26, 154, 103, 13);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Raza:");
		lblNewLabel_3.setBounds(26, 193, 65, 13);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Color:");
		lblNewLabel_4.setBounds(26, 234, 65, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Al\u00E9rgico:");
		lblNewLabel_5.setBounds(26, 275, 65, 17);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Atenci\u00F3n Especial:");
		lblNewLabel_6.setBounds(26, 321, 119, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Nombre Due\u00F1o:");
		lblNewLabel_7.setBounds(26, 367, 119, 13);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Telf. Due\u00F1o:");
		lblNewLabel_8.setBounds(26, 410, 83, 13);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Observaciones:");
		lblNewLabel_9.setBounds(26, 450, 103, 13);
		contentPane.add(lblNewLabel_9);
		
		txtNumCliente = new JTextField();
		txtNumCliente.setBounds(101, 107, 243, 19);
		txtNumCliente.setEnabled(true);
		//Maximo de mascotas para registrar son de 1000
		//txtNumCliente.setText(String.valueOf(numeroAleatorio(10)));
		txtNumCliente.setText("");
		contentPane.add(txtNumCliente);
		txtNumCliente.setColumns(10);
		
		txtNameMascota = new JTextField();
		txtNameMascota.setColumns(10);
		txtNameMascota.setBounds(138, 151, 243, 19);
		contentPane.add(txtNameMascota);
		
		txtRaza = new JTextField();
		txtRaza.setColumns(10);
		txtRaza.setBounds(101, 190, 243, 19);
		contentPane.add(txtRaza);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(101, 231, 243, 19);
		contentPane.add(txtColor);
		
		cboAlergia = new JComboBox();
		cboAlergia.setModel(new DefaultComboBoxModel(new String[] {"-","SI", "NO"}));
		cboAlergia.setBounds(101, 271, 119, 21);
		contentPane.add(cboAlergia);
		
		cboAtencion = new JComboBox();
		cboAtencion.setModel(new DefaultComboBoxModel(new String[] {"-","SI", "NO"}));
		cboAtencion.setBounds(141, 317, 119, 21);
		contentPane.add(cboAtencion);
		
		txtNameDueno = new JTextField();
		txtNameDueno.setColumns(10);
		txtNameDueno.setBounds(126, 364, 243, 19);
		contentPane.add(txtNameDueno);
		
		txtTelfDueno = new JTextField();
		txtTelfDueno.setColumns(10);
		txtTelfDueno.setBounds(126, 407, 243, 19);
		contentPane.add(txtTelfDueno);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(126, 460, 415, 180);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		txtArea.setLineWrap(true);
		scrollPane.setViewportView(txtArea);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(168, 664, 137, 33);
		contentPane.add(btnLimpiar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setIcon(new ImageIcon(Registro.class.getResource("/GUI/iconos_Java/Save.gif")));
		btnGuardar.setBounds(382, 664, 137, 33);
		contentPane.add(btnGuardar);
		
		ImageIcon img1 = new ImageIcon("img\\perroRegistro.png");
		lblNewLabel_10 = new JLabel();
		lblNewLabel_10.setIcon(new ImageIcon(img1.getImage().getScaledInstance(277, 277, Image.SCALE_SMOOTH)));
		lblNewLabel_10.setBounds(420, 113, 277,277);
		contentPane.add(lblNewLabel_10);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardarJButton(e);
		}else if(e.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(e);
		}
	}
	protected void actionPerformedBtnGuardarJButton(ActionEvent e) {
		//Variables
		int numCliente =Integer.parseInt(txtNumCliente.getText());
		String nombreMascota = txtNameMascota.getText();
		String raza = txtRaza.getText();
		String color = txtColor.getText();
		String alergia = String.valueOf(cboAlergia.getSelectedItem());
		String atencion = String.valueOf(cboAtencion.getSelectedItem());
		String nombreCliente = txtNameDueno.getText();
		String telfDueno = txtTelfDueno.getText();
		String observaciones = txtArea.getText();
		//Rango maximo de clientes a ingresar es de 1000 registros.
		//int idDuenio = numeroAleatorio(10);
		
		
		if(!String.valueOf(numCliente).matches(Validacion.NUM_CLIENTE)) {
			mensaje("El numero de Cliente debe ser número");
		}else if(!nombreMascota.matches(Validacion.NOMBRE_MASCOTA)) {
			mensaje("El nombre de la mascota debe ser texto de 40 caracteres maximo");
		}else if(!raza.matches(Validacion.RAZA_MASCOTA)){
			mensaje("La raza debe ser texto con un maximo de 20 caracteres");
		}else if(!color.matches(Validacion.COLOR_MASCOTA)) {
			mensaje("El color debe ser texto con un maximo de 20 caracteres");
		}else if(cboAlergia.getSelectedIndex()==0) {
			mensaje("La alergia debe ser \"SI\" o \"NO\"");
		}else if(cboAtencion.getSelectedIndex()==0) {
			mensaje("La atención debe ser \"SI\" o \"NO\"");
		}else if(!nombreCliente.matches(Validacion.NOMBRE_DUENIO)) {
			mensaje("El nombre del Dueño debe ser como maximo 50 caracteres");
		}else if(!telfDueno.matches(Validacion.TELF_DUENIO)) {
			mensaje("El telefono debe ser 9 digitos");
		}else if(!observaciones.matches(Validacion.OBSERVACIONES)) {
			mensaje("La observacion es como maximo 255 caracteres");
		}else {
			//System.out.println(idDuenio);
			Controlador controlador = new Controlador();
			if(controlador.guardarDuenioMascota(nombreCliente,telfDueno,numCliente,nombreMascota,raza, color, alergia, atencion, observaciones)) {
				limpiar();
				mensaje("Se Registro Correctamente a la Base de Datos");
			}else {
				mensaje("Ingresa un Número de cliente distinto");
			}
		}					
	}
	
	
	protected void actionPerformedBtnLimpiar(ActionEvent e) {		
		limpiar();
	}
	
	private int numeroAleatorio(int numero) {
		int numeroAleatorio =(int)(numero*Math.random()+1);
		return numeroAleatorio;
	}
	
	private void mensaje(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private void limpiar() {
		System.out.println("Limpiar");
		txtNumCliente.setText("");
		txtNameMascota.setText("");
		txtRaza.setText("");
		txtColor.setText("");
		cboAlergia.setSelectedIndex(0);
		cboAtencion.setSelectedIndex(0);
		txtNameDueno.setText("");
		txtTelfDueno.setText("");
		txtArea.setText("");

	}
}
