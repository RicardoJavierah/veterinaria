package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	

	//Variables Globales
	private String numCliente;
	private String nombreMascota;
	private String raza;
	private String color;
	private String alergia;
	private String atencion;
	private String nombreCliente;
	private String telfDueno;
	private String observaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
					//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 750);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("REGISTRO MASCOTA");
		lblNewLabel.setFont(new Font("SansSerif",Font.BOLD,16));
		lblNewLabel.setBounds(304, 29, 173, 23);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cliente N\u00B0:");
		lblNewLabel_1.setBounds(26, 110, 65, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(26, 154, 65, 13);
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
		txtNumCliente.setBounds(89, 107, 243, 19);
		contentPane.add(txtNumCliente);
		txtNumCliente.setColumns(10);
		
		txtNameMascota = new JTextField();
		txtNameMascota.setColumns(10);
		txtNameMascota.setBounds(101, 151, 243, 19);
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
		cboAlergia.setBounds(101, 271, 119, 21);
		contentPane.add(cboAlergia);
		
		cboAtencion = new JComboBox();
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
		scrollPane.setBounds(126, 460, 415, 180);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
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
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardarJButton(e);
		}
		if(e.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(e);
		}
	}
	protected void actionPerformedBtnGuardarJButton(ActionEvent e) {
		//Variables
		numCliente = txtNumCliente.getText();
		nombreMascota = txtNameMascota.getText();
		raza = txtRaza.getText();
		color = txtColor.getText();
		alergia = String.valueOf(cboAlergia.getSelectedItem());
		atencion = String.valueOf(cboAtencion.getSelectedItem());
		nombreCliente = txtNameDueno.getText();
		telfDueno = txtTelfDueno.getText();
		observaciones = txtArea.getText();
				
	}
	
	protected void actionPerformedBtnLimpiar(ActionEvent e) {		
		System.out.println("Limpiar");
		txtNumCliente.setText("");
		txtNameMascota.setText("");
		txtRaza.setText("");
		txtColor.setText("");
		cboAlergia.setSelectedItem(0);
		cboAtencion.setSelectedItem(0);
		txtNameDueno.setText("");
		txtTelfDueno.setText("");
		txtArea.setText("");

	}
}
