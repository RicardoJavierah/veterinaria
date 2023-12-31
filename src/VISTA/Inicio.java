package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnCargarDatos;
	private JButton btnVerDatos;
	private JButton btnSalir;
	private JLabel lblNewLabel_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 706, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("PELUQUERIA CANINA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel.setBounds(255,37, 200, 23);
		contentPane.add(lblNewLabel);
		
		btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.addActionListener(this);
		btnCargarDatos.setBackground(Color.LIGHT_GRAY);
		btnCargarDatos.setIcon(new ImageIcon(Inicio.class.getResource("/GUI/iconos_Java/Add.gif")));
		btnCargarDatos.setBounds(72, 143, 142, 30);
		contentPane.add(btnCargarDatos);
		
		btnVerDatos = new JButton("Ver Datos");
		btnVerDatos.addActionListener(this);
		btnVerDatos.setBackground(Color.LIGHT_GRAY);
		btnVerDatos.setIcon(new ImageIcon(Inicio.class.getResource("/GUI/iconos_Java/Document.gif")));
		btnVerDatos.setBounds(72, 214, 142, 30);
		contentPane.add(btnVerDatos);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setBounds(72, 279, 142, 30);
		contentPane.add(btnSalir);
		
		ImageIcon img1 = new ImageIcon("img\\perro.png");		
		lblNewLabel_1 = new JLabel();	
		lblNewLabel_1.setBounds(305, 92, 339, 351);
		lblNewLabel_1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(320, 340, Image.SCALE_SMOOTH)));
		contentPane.add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalirJButton(e);
		}
		if (e.getSource() == btnCargarDatos) {
			actionPerformedBtnCargarDatosJButton(e);
		}else if(e.getSource() == btnVerDatos) {
			actionPerformedBtnVerDatosJButton(e);
		}
	}
	protected void actionPerformedBtnCargarDatosJButton(ActionEvent e) {
		Registro registro = new Registro();
		registro.setVisible(true);
		registro.setLocationRelativeTo(null);
		registro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	protected void actionPerformedBtnVerDatosJButton(ActionEvent e) {
		CRUD crud = new CRUD();
		crud.setVisible(true);
		crud.setLocationRelativeTo(null);
		crud.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}
	protected void actionPerformedBtnSalirJButton(ActionEvent e) {
		System.exit(ABORT);
	}
}
