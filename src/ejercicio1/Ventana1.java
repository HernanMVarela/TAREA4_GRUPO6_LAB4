package ejercicio1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecNac;
	private boolean bandera = true;
	private JLabel lblNombre = new JLabel("Nombre");
	private JLabel lblApellido = new JLabel("Apellido");
	private JLabel lblTelefono = new JLabel("Telefono");
	private JLabel lblFecNac = new JLabel("Fecha Nac.");
	private JLabel lblDatosIngresados = new JLabel("");
	private JLabel lblNombrelbl = new JLabel("Nombre");
	private JLabel lblApellidolbl = new JLabel("Apellido");
	private JLabel lblTelefonolbl = new JLabel("Teléfono");
	private JLabel lblFecNaclbl = new JLabel("Fec. Nac.");
	private JLabel lblNombretxt = new JLabel("");
	private JLabel lblApellidotxt = new JLabel("");
	private JLabel lblTelefonotxt = new JLabel("");
	private JLabel lblFecNactxt = new JLabel("");
	
	public Ventana1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
		lblNombre.setBounds(10, 23, 72, 30);
		contentPane.add(lblNombre);
		
		lblApellido.setFont(new Font("Arial", Font.BOLD, 14));
		lblApellido.setBounds(10, 64, 72, 30);
		contentPane.add(lblApellido);
				
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefono.setBounds(10, 105, 72, 30);
		contentPane.add(lblTelefono);
				
		lblFecNac.setFont(new Font("Arial", Font.BOLD, 14));
		lblFecNac.setBounds(10, 146, 90, 30);
		contentPane.add(lblFecNac);
				
		lblDatosIngresados.setFont(new Font("Arial", Font.BOLD, 14));
		lblDatosIngresados.setBounds(10, 255, 355, 30);
		contentPane.add(lblDatosIngresados);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char key = e.getKeyChar();
		        if (!(Character.isLetter(key)) ) {
		            e.consume();
				}
			}			
		});
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setBounds(137, 29, 228, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char key = e.getKeyChar();
		        if (!(Character.isLetter(key)) ) {
		            e.consume();
				}
			}			
		});
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(137, 70, 228, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char A = arg0.getKeyChar();
				if (((A < '0') || A > '9') && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_DELETE)) {
					arg0.consume();
				}
			}			
		});		
		txtTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(137, 111, 228, 20);
		contentPane.add(txtTelefono);
		
		txtFecNac = new JTextField();
		txtFecNac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char A = arg0.getKeyChar();
				if (((A < '0') || A > '9') && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_MINUS) && (A != KeyEvent.VK_SLASH)) {
					arg0.consume();}
			}			
		});	
		txtFecNac.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFecNac.setColumns(10);
		txtFecNac.setBounds(137, 152, 228, 20);
		contentPane.add(txtFecNac);
		
		lblNombrelbl.setVisible(false);
		lblNombrelbl.setFont(new Font("Arial", Font.BOLD, 14));
		lblNombrelbl.setBounds(10, 296, 125, 30);
		contentPane.add(lblNombrelbl);
		
		lblApellidolbl.setVisible(false);
		lblApellidolbl.setFont(new Font("Arial", Font.BOLD, 14));
		lblApellidolbl.setBounds(10, 336, 125, 30);
		contentPane.add(lblApellidolbl);
		
		lblTelefonolbl.setVisible(false);
		lblTelefonolbl.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefonolbl.setBounds(10, 377, 125, 30);
		contentPane.add(lblTelefonolbl);
		
		lblFecNaclbl.setVisible(false);
		lblFecNaclbl.setFont(new Font("Arial", Font.BOLD, 14));
		lblFecNaclbl.setBounds(10, 418, 125, 30);
		contentPane.add(lblFecNaclbl);
		
		lblNombretxt.setVisible(false);
		lblNombretxt.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombretxt.setBounds(137, 296, 228, 30);		
		contentPane.add(lblNombretxt);
		
		lblApellidotxt.setVisible(false);
		lblApellidotxt.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidotxt.setBounds(137, 336, 228, 30);		
		contentPane.add(lblApellidotxt);
		
		lblTelefonotxt.setVisible(false);
		lblTelefonotxt.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefonotxt.setBounds(137, 377, 228, 30);		
		contentPane.add(lblTelefonotxt);
		
		lblFecNactxt.setVisible(false);
		lblFecNactxt.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFecNactxt.setBounds(137, 418, 228, 30);		
		contentPane.add(lblFecNactxt);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
				} else {
					txtNombre.setBackground(Color.WHITE);
				}
				
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
				} else {
					txtApellido.setBackground(Color.WHITE);
				}
				
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
				} else {
					txtTelefono.setBackground(Color.WHITE);
				}
				
				if(txtFecNac.getText().isEmpty()) {
					txtFecNac.setBackground(Color.RED);
				} else {
					txtFecNac.setBackground(Color.WHITE);
				}
				
				if(txtNombre.getText().isEmpty()||txtApellido.getText().isEmpty()||txtTelefono.getText().isEmpty()||txtFecNac.getText().isEmpty()) {
					bandera = false;
				} else {
					bandera = true;
				}
				
				if(bandera) {
					MostrarLabels(true);
					lblDatosIngresados.setText("Los datos ingresados Fueron: ");
					lblNombretxt.setText(txtNombre.getText());
					lblApellidotxt.setText(txtApellido.getText());
					lblTelefonotxt.setText(txtTelefono.getText());
					lblFecNactxt.setText(txtFecNac.getText());
					
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFecNac.setText("");
					
				} else {
					MostrarLabels(false);
					lblDatosIngresados.setText("Completar todos los campos");
				}
			}
		});
		
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 12));
		btnMostrar.setBounds(276, 202, 89, 23);
		contentPane.add(btnMostrar);
		
	}
	
	private void MostrarLabels (boolean bandera) {
		lblNombrelbl.setVisible(bandera);
		lblApellidolbl.setVisible(bandera);
		lblTelefonolbl.setVisible(bandera);		
		lblFecNaclbl.setVisible(bandera);
		lblNombretxt.setVisible(bandera);
		lblApellidotxt.setVisible(bandera);
		lblTelefonotxt.setVisible(bandera);		
		lblFecNactxt.setVisible(bandera);
	}
}
