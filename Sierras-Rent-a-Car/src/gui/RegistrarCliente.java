package gui;

import system.*;

import java.awt.EventQueue;

import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DropMode;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import javax.swing.border.MatteBorder;

import RentACarUtils.Utils;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class RegistrarCliente extends JFrame {

	private RentACarSystem racs;
	private Utils util;
	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombreCompleto;
	private JTextField txtDireccion;
	private JTextField txtEmail;
	private JTextField txtCelular;
	private JSpinner spFechaDeNacimiento;

	public RegistrarCliente(RentACarSystem racs, Utils util) {
		this.racs = racs;
		this.util = util;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblRegistrarCliente = new JLabel("Registrar Cliente");
		lblRegistrarCliente.setBackground(new Color(128, 0, 0));
		lblRegistrarCliente.setForeground(new Color(255, 255, 255));
		lblRegistrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRegistrarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblRegistrarCliente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(100);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel_2.add(btnCancelar);
		
		JButton btnGuardarCliente = new JButton("Guardar Cliente");
		btnGuardarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombreCompleto = txtNombreCompleto.getText();
					String email = txtEmail.getText();
					String direccion = txtDireccion.getText();
					String celular = txtCelular.getText();
					int cedula = Integer.parseInt(txtCedula.getText());
					Calendar fechaNacimiento = new GregorianCalendar();
					Date fechaNac = ((Date) spFechaDeNacimiento.getValue());
					fechaNacimiento.setTime(fechaNac);

					Cliente cliente = new Cliente(cedula, nombreCompleto, direccion, email, celular, fechaNacimiento);
					Entry<String, Boolean> result = util.validarDatos(cliente);
					if (result.getValue()) {
						racs.addCliente(cliente);
						JOptionPane.showMessageDialog(null, result.getKey());
						
						txtCedula.setText("");
						txtCelular.setText("");
						txtDireccion.setText("");
						txtEmail.setText("");
						txtNombreCompleto.setText("");
					} else {
						JOptionPane.showMessageDialog(null, result.getKey());
						cliente = null; // se libera el espacio en memoria creado, Tengo entendido que la jvm elimina
										// las variables null de la memoria con el GarbageCollector pero sin necesidad
										// de llamarlo en el codigo
					}

				} catch (NumberFormatException exept) {
					JOptionPane.showMessageDialog(null,
							"Ha intentado utilizar letras en el campo de numeros o hay campos vacios!\nIntentelo de vuelta");
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		panel_2.add(btnGuardarCliente);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(56, 31, 155, 24);
		panel_1.add(lblNewLabel);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(55, 66, 156, 20);
		panel_1.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombreCompleto = new JTextField();
		txtNombreCompleto.setColumns(10);
		txtNombreCompleto.setBounds(309, 66, 220, 20);
		panel_1.add(txtNombreCompleto);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNombreCompleto.setBounds(313, 31, 216, 24);
		panel_1.add(lblNombreCompleto);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblDireccion.setBounds(56, 133, 155, 24);
		panel_1.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(55, 168, 156, 20);
		panel_1.add(txtDireccion);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblEmail.setBounds(309, 133, 220, 24);
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(309, 168, 220, 20);
		panel_1.add(txtEmail);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(54, 249, 156, 20);
		panel_1.add(txtCelular);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblCelular.setBounds(54, 214, 155, 24);
		panel_1.add(lblCelular);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblFechaDeNacimiento.setBounds(309, 230, 220, 24);
		panel_1.add(lblFechaDeNacimiento);
		
		spFechaDeNacimiento = new JSpinner();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		spFechaDeNacimiento.setModel(new SpinnerDateModel(new Date(1687230000000L), null, null, Calendar.DAY_OF_YEAR));
		spFechaDeNacimiento.setEditor(new JSpinner.DateEditor(spFechaDeNacimiento, sdf.toPattern()));
		spFechaDeNacimiento.setBounds(309, 265, 220, 20);
		panel_1.add(spFechaDeNacimiento);
	}
}
