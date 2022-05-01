package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecNac;
	private boolean bandera = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
		lblNombre.setBounds(10, 23, 72, 30);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 14));
		lblApellido.setBounds(10, 64, 72, 30);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefono.setBounds(10, 105, 72, 30);
		contentPane.add(lblTelefono);
		
		JLabel lblFecNac = new JLabel("Fecha Nac.");
		lblFecNac.setFont(new Font("Arial", Font.BOLD, 14));
		lblFecNac.setBounds(10, 146, 90, 30);
		contentPane.add(lblFecNac);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setBounds(137, 29, 228, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(137, 70, 228, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(137, 111, 228, 20);
		contentPane.add(txtTelefono);
		
		txtFecNac = new JTextField();
		txtFecNac.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFecNac.setColumns(10);
		txtFecNac.setBounds(137, 152, 228, 20);
		contentPane.add(txtFecNac);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
					bandera = false;
				}
				
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
					bandera = false;
				}
				
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
					bandera = false;
				}
				
				if(txtFecNac.getText().isEmpty()) {
					txtFecNac.setBackground(Color.RED);
					bandera = false;
				}
				
				if(bandera) {
					
				} else {
					
				}
				
				
			}
		});
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnMostrar.setBounds(276, 202, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblMostrarDatosIngresados = new JLabel("");
		lblMostrarDatosIngresados.setFont(new Font("Arial", Font.BOLD, 14));
		lblMostrarDatosIngresados.setBounds(10, 255, 355, 30);
		contentPane.add(lblMostrarDatosIngresados);
		
		
		
	}
}
