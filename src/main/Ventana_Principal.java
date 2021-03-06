package main;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejercicio1.Ventana1;
import ejercicio2.Ventana2;
import ejercicio3.Ventana3;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Ventana_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// VENTANA PRINCIPAL - CONSTRUCTOR CON PROPIEDADES DE LA VENTANA
	public Ventana_Principal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupoN = new JLabel("Grupo N\u00AA6");
		lblGrupoN.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGrupoN.setBounds(12, 13, 114, 24);
		contentPane.add(lblGrupoN);
		
		JButton btnEjercicio_1 = new JButton("Ejercicio 1");
		btnEjercicio_1.setBounds(130, 56, 172, 38);
		contentPane.add(btnEjercicio_1);
		
		JButton btnEjercicio_2 = new JButton("Ejercicio 2");
		btnEjercicio_2.setBounds(130, 107, 172, 38);
		contentPane.add(btnEjercicio_2);
		
		JButton btnEjercicio_3 = new JButton("Ejercicio 3");
		btnEjercicio_3.setBounds(130, 158, 172, 38);
		contentPane.add(btnEjercicio_3);
		
		//EVENTOS DE LOS CONTROLES
		btnEjercicio_1.addActionListener(new e_boton1());
		btnEjercicio_2.addActionListener(new e_boton2());
		btnEjercicio_3.addActionListener(new e_boton3());

		
	}
}

// CLASES EVENTOS DE BOTONES
class e_boton1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
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
}

class e_boton2 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ventana2 Vent2 = new Ventana2();
		Vent2.setVisible(true);	
		}
}
class e_boton3 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Ventana3 Vent3 = new Ventana3();
		Vent3.setVisible(true);
		}
}
