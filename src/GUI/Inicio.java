package GUI;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 706, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("PELUQUERIA CANINA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(278,36, 161, 16);
		contentPane.add(lblNewLabel);
		
		btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.addActionListener(this);
		btnCargarDatos.setBackground(Color.LIGHT_GRAY);
		btnCargarDatos.setIcon(new ImageIcon(Inicio.class.getResource("/GUI/iconos_Java/Add.gif")));
		btnCargarDatos.setBounds(72, 143, 142, 30);
		contentPane.add(btnCargarDatos);
		
		btnVerDatos = new JButton("Ver Datos");
		btnVerDatos.setBackground(Color.LIGHT_GRAY);
		btnVerDatos.setIcon(new ImageIcon(Inicio.class.getResource("/GUI/iconos_Java/Document.gif")));
		btnVerDatos.setBounds(72, 214, 142, 30);
		contentPane.add(btnVerDatos);
		
		btnSalir = new JButton("Salir");
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
		if (e.getSource() == btnCargarDatos) {
			actionPerformedBtnCargarDatosJButton(e);
		}
	}
	protected void actionPerformedBtnCargarDatosJButton(ActionEvent e) {
		//JFrame frmae = new JFrame();
		//frmae.setVisible(true);
		//frmae.setBounds(10, 10, 100,100);
		Registro registro = new Registro();
		registro.setVisible(true);
		registro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
