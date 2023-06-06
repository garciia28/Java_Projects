package com.practica.evidencia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ejercicio {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio window = new Ejercicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 792, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce tu correo electrónico: ");
		lblNewLabel.setBounds(40, 49, 185, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(236, 46, 235, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dime las unidades que tienes en stock: ");
		lblNewLabel_1.setBounds(40, 84, 235, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(285, 81, 125, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Selecciona el método de pago que vas a usar: ");
		lblNewLabel_2.setBounds(40, 116, 353, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opción", "Tarjeta", "PayPal", "Efectivo"}));
		comboBox.setBounds(333, 112, 153, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Elige un producto: ");
		lblNewLabel_3.setBounds(40, 148, 140, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opción", "Mesa", "Silla", "Lámpara", "Sofá"}));
		comboBox_1.setBounds(160, 144, 163, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Acepta la política de privacidad");
		lblNewLabel_4.setBounds(40, 208, 185, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(511, 208, 153, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(382, 204, 89, 23);
		frame.getContentPane().add(btnComprar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        boolean isChecked = chckbxNewCheckBox.isSelected();
		        btnComprar.setEnabled(isChecked);
		        if (isChecked) {
		            // Mostrar mensaje de confirmación de compra en el JLabel
		            lblNewLabel_5.setText("¡Producto comprado!");
		        } else {
		            lblNewLabel_5.setText(""); // Limpiar el mensaje si el checkbox se desmarca
		        }
		    }
		});
		chckbxNewCheckBox.setBounds(239, 208, 21, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		




	}
}
