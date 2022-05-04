package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public Ventana3() {
		setTitle("Seleccion m\u00FAltiple");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		setBounds(100, 100, 500, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(35, 23, 408, 44);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 174, 14);
		panel_1.add(lblNewLabel);
		
		JRadioButton radioWindows = new JRadioButton("Windows");
		radioWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioWindows.setBounds(176, 8, 89, 23);
		panel_1.add(radioWindows);
		
		JRadioButton radioMac = new JRadioButton("Mac");
		radioMac.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioMac.setBounds(267, 8, 50, 23);
		panel_1.add(radioMac);
		
		JRadioButton radioLinux = new JRadioButton("Linux");
		radioLinux.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioLinux.setBounds(328, 7, 62, 23);
		panel_1.add(radioLinux);
		
		//Grupo de options
		ButtonGroup grupoRadios = new ButtonGroup();
		grupoRadios.add(radioWindows);
		grupoRadios.add(radioMac);
		grupoRadios.add(radioLinux);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(35, 78, 408, 98);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(30, 37, 143, 14);
		panel_2.add(lblNewLabel_1);
		
		JCheckBox checkProg = new JCheckBox("Programaci\u00F3n");
		checkProg.setFont(new Font("Tahoma", Font.BOLD, 12));
		checkProg.setBounds(191, 7, 117, 23);
		panel_2.add(checkProg);
		
		JCheckBox checkAdmin = new JCheckBox("Administraci\u00F3n");
		checkAdmin.setFont(new Font("Tahoma", Font.BOLD, 12));
		checkAdmin.setBounds(191, 33, 117, 23);
		panel_2.add(checkAdmin);
		
		JCheckBox checkDisGra = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		checkDisGra.setFont(new Font("Tahoma", Font.BOLD, 12));
		checkDisGra.setBounds(191, 60, 117, 23);
		panel_2.add(checkDisGra);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de horas en el computador:");
		
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(48, 209, 239, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char A = arg0.getKeyChar();
				if (((A < '0')) && (A != KeyEvent.VK_BACK_SPACE) && (A != KeyEvent.VK_PERIOD)) {
					arg0.consume();
				}
			}			
		});
		textField.setBounds(300, 207, 99, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String msjRadios =""; String msjChecks =""; String horas = textField.getText();
					if ( radioWindows.isSelected() ) msjRadios ="Windows"; //Recordar poner grupo de JRadioButons para seleccionar uno solo 
					if ( radioMac.isSelected() ) msjRadios ="Mac"; 
					if ( radioLinux.isSelected() ) msjRadios ="Linux"; 
					
					if ( checkProg.isSelected() ) msjChecks +=  "Programaci�n - "; 
					if ( checkAdmin.isSelected() ) msjChecks +="Administraci�n - "; 
					if ( checkDisGra.isSelected() ) msjChecks +="Dise�o gr�fico - "; 
					
					if(esNumerico( horas)== false) horas ="";
					
					if(msjRadios == "" || msjChecks =="" || horas =="")	validar(false);
					else validar(msjRadios, msjChecks, horas);
					
				}catch(Exception e1) {
				}
			}

			private boolean esNumerico(String horas) {
				try {
					Float.parseFloat(horas);
					return true;
				}catch (NumberFormatException e) {
					return false;
				}
			}
			
		});
		btnAceptar.setBounds(321, 243, 89, 23);
		panel.add(btnAceptar);
		
		setLocationRelativeTo(null);  
	}
	
	private void validar(boolean bool) {
		if(!bool) {
			JOptionPane.showMessageDialog(this, "Ingrese los datos requeridos.", "Advertencia", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void validar(String msjRadios, String msjChecks, String horas) {
			JOptionPane.showMessageDialog(this,  msjRadios + " - " + msjChecks  +  horas + " Hs", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}
	}
	