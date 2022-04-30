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
import javax.swing.JButton;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txfPromedio;
	private JTextField txfCondicion;

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

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setTitle("Notas del estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		txtNota1.setBounds(122, 30, 165, 27);
		panel_superior.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(122, 77, 165, 27);
		panel_superior.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(122, 122, 165, 27);
		panel_superior.add(txtNota3);
		
		JComboBox cbxTPS = new JComboBox();
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
		txfPromedio.setColumns(10);
		txfPromedio.setBounds(147, 34, 165, 27);
		panel_inferior.add(txfPromedio);
		
		txfCondicion = new JTextField();
		txfCondicion.setColumns(10);
		txfCondicion.setBounds(147, 77, 165, 27);
		panel_inferior.add(txfCondicion);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(408, 101, 142, 42);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(408, 156, 142, 42);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(408, 211, 142, 42);
		contentPane.add(btnSalir);
	}
}
