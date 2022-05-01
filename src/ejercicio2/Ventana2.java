package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txfPromedio;
	private JTextField txfCondicion;
	private JComboBox cbxTPS;
	//private JButton btnSalir;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void cerrar() {
		dispose();		
	}

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setTitle("Notas del estudiante");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNotasDelEstudiante = new JLabel("Notas del estudiante");
		lblNotasDelEstudiante.setFont(new Font("Arial", Font.BOLD, 14));
		lblNotasDelEstudiante.setBounds(40, 27, 182, 22);
		contentPane.add(lblNotasDelEstudiante);
		
		JLabel label = new JLabel("Notas del estudiante");
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(40, 275, 182, 22);
		contentPane.add(label);
		
		JPanel panel_superior = new JPanel();
		panel_superior.setBorder(new LineBorder(new Color(153, 180, 209), 1, true));
		panel_superior.setForeground(Color.GRAY);
		panel_superior.setBounds(30, 45, 338, 221);
		contentPane.add(panel_superior);
		panel_superior.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNota1.setBounds(40, 31, 70, 25);
		panel_superior.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNota2.setBounds(40, 76, 70, 25);
		panel_superior.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNota3.setBounds(40, 121, 70, 25);
		panel_superior.add(lblNota3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setFont(new Font("Arial", Font.BOLD, 14));
		lblTPS.setBounds(40, 166, 70, 25);
		panel_superior.add(lblTPS);
		
		txtNota1 = new JTextField();
		txtNota1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char A = arg0.getKeyChar();
				if (((A < '0') || A > '9') && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_PERIOD)) {
					arg0.consume();
				}
			}			
		});		
		txtNota1.setText("0");
		txtNota1.setBounds(122, 30, 165, 27);
		panel_superior.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char A = e.getKeyChar();
				if (((A < '0') || A > '9') && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_PERIOD)) {
					e.consume();
				}
			}
		});
		txtNota2.setText("0");
		txtNota2.setColumns(10);
		txtNota2.setBounds(122, 77, 165, 27);
		panel_superior.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char A = e.getKeyChar();
				if (((A < '0') || A > '9') && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_PERIOD)) {
					e.consume();
				}
			}
		});
		txtNota3.setText("0");
		txtNota3.setColumns(10);
		txtNota3.setBounds(122, 122, 165, 27);
		panel_superior.add(txtNota3);
		
		
		
		cbxTPS = new JComboBox();
		cbxTPS.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		cbxTPS.setToolTipText("");
		cbxTPS.setMaximumRowCount(2);
		cbxTPS.setBounds(122, 167, 165, 24);
		panel_superior.add(cbxTPS);
		
		JPanel panel_inferior = new JPanel();
		panel_inferior.setBorder(new LineBorder(SystemColor.activeCaption, 1, true));
		panel_inferior.setBounds(30, 293, 338, 133);
		contentPane.add(panel_inferior);
		panel_inferior.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(40, 34, 97, 25);
		lblPromedio.setFont(new Font("Arial", Font.BOLD, 14));
		panel_inferior.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion: ");
		lblCondicion.setFont(new Font("Arial", Font.BOLD, 14));
		lblCondicion.setBounds(40, 79, 97, 25);
		panel_inferior.add(lblCondicion);
		
		txfPromedio = new JTextField();
		txfPromedio.setEditable(false);
		txfPromedio.setColumns(10);
		txfPromedio.setBounds(147, 34, 165, 27);
		panel_inferior.add(txfPromedio);
		
		txfCondicion = new JTextField();
		txfCondicion.setEditable(false);
		txfCondicion.setColumns(10);
		txfCondicion.setBounds(147, 77, 165, 27);
		panel_inferior.add(txfCondicion);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean pass = true;
				float nota1=0, nota2=0, nota3=0;
				txtNota1.setBackground(Color.WHITE);
				txtNota2.setBackground(Color.WHITE);
				txtNota3.setBackground(Color.WHITE);
				
				if(txtNota1.getText().equals("")) {txtNota1.setBackground(Color.RED); pass=false;}
				if(txtNota2.getText().equals("")) {txtNota2.setBackground(Color.RED); pass=false;}
				if(txtNota3.getText().equals("")) {txtNota3.setBackground(Color.RED); pass=false;}
				
				if(pass) {
					nota1 = Float.parseFloat(txtNota1.getText());
					nota2 = Float.parseFloat(txtNota2.getText());
					nota3 = Float.parseFloat(txtNota3.getText());
					
					if(nota1<0 || nota1>10) {
						txtNota1.setText("");
						txtNota1.setBackground(Color.RED);
						pass=false;
					}
					
					if(nota2<0 || nota2>10) {
						txtNota2.setText("");
						txtNota2.setBackground(Color.RED);
						pass=false;
					}
					
					if(nota3<0 || nota3>10) {
						txtNota3.setText("");
						txtNota3.setBackground(Color.RED);
						pass=false;
					}
				}
				if(pass) {
					float prom = (nota1 + nota2 + nota3)/3;
					txfPromedio.setText(""+prom);
				}
				
				//Condición
				
				if (cbxTPS.getSelectedItem().toString().equals("Desaprobado") || nota1<6 || nota2<6 || nota3<6) {
					txfCondicion.setText("Libre");
					return;
				}
				
				if (cbxTPS.getSelectedItem().toString().equals("Aprobado")) {
					if (nota1>=8 && nota2>=8 && nota3>=8) {
						txfCondicion.setText("Promocionado");
						return;
					}
					
					else {
						txfCondicion.setText("Regular");
						return;
					}
				} 
				
				
			}
		});
		
		btnCalcular.setBounds(408, 101, 142, 42);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("0");
				txtNota2.setText("0");
				txtNota3.setText("0");
				txfPromedio.setText("");
				txfCondicion.setText("");
			}
		});
		btnNuevo.setBounds(408, 156, 142, 42);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrar();
			}
		});
		btnSalir.setBounds(408, 211, 142, 42);
		contentPane.add(btnSalir);
	}
}

