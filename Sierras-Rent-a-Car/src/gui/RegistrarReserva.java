package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
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
import java.util.Calendar;
import javax.swing.border.MatteBorder;

import system.RentACarSystem;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class RegistrarReserva extends JFrame {

	private JPanel contentPane;
	private RentACarSystem racs;
	private JTextField txtModelo;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtCedula;
	private JTextField xtxNombre;
	private JTextField txtMail;
	private JTextField txtCliente;
	private JTextField txtVehiculo;

	public RegistrarReserva( RentACarSystem racs) {
		this.racs = racs;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 791, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblRegistrarCliente = new JLabel("Registrar Reserva");
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
		btnCancelar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		panel_2.add(btnCancelar);
		
		JButton btnGuardarReserva = new JButton("Guardar Reserva");
		btnGuardarReserva.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		panel_2.add(btnGuardarReserva);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vehiculos");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(99, 11, 121, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblDireccion = new JLabel("Clientes");
		lblDireccion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblDireccion.setBounds(500, 11, 109, 24);
		panel_1.add(lblDireccion);
		
		JLabel lblCelular = new JLabel("Fecha de entrega");
		lblCelular.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 17));
		lblCelular.setBounds(296, 148, 157, 31);
		panel_1.add(lblCelular);
		
		JSpinner spFechaEntrega = new JSpinner();
		spFechaEntrega.setModel(new SpinnerDateModel(new Date(1697511600000L), null, null, Calendar.DAY_OF_YEAR));
		spFechaEntrega.setBounds(296, 183, 171, 20);
		panel_1.add(spFechaEntrega);
		
		JLabel lblFechaDeDevolucion = new JLabel("Fecha de devolucion");
		lblFechaDeDevolucion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 17));
		lblFechaDeDevolucion.setBounds(296, 214, 155, 31);
		panel_1.add(lblFechaDeDevolucion);
		
		JSpinner spFechaDevolucion = new JSpinner();
		spFechaDevolucion.setModel(new SpinnerDateModel(new Date(1697511600000L), null, null, Calendar.DAY_OF_YEAR));
		spFechaDevolucion.setBounds(296, 249, 171, 20);
		panel_1.add(spFechaDevolucion);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(89, 76, 115, 20);
		panel_1.add(txtModelo);
		txtModelo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 148, 229, 174);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(89, 46, 115, 20);
		panel_1.add(txtMatricula);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(89, 105, 115, 20);
		panel_1.add(txtMarca);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(23, 49, 56, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Modelo");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(23, 77, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Marca");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(23, 107, 46, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Busqueda");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		btnNewButton.setBounds(224, 73, 89, 23);
		panel_1.add(btnNewButton);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(531, 46, 115, 20);
		panel_1.add(txtCedula);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cedula");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(465, 49, 46, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nombre");
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1_2.setBounds(465, 77, 46, 14);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mail");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(465, 108, 34, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		xtxNombre = new JTextField();
		xtxNombre.setColumns(10);
		xtxNombre.setBounds(531, 76, 115, 20);
		panel_1.add(xtxNombre);
		
		JButton btnNewButton_1 = new JButton("Busqueda");
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		btnNewButton_1.setBounds(666, 73, 89, 23);
		panel_1.add(btnNewButton_1);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(531, 105, 115, 20);
		panel_1.add(txtMail);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(502, 148, 229, 174);
		panel_1.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		txtCliente.setColumns(10);
		txtCliente.setBounds(352, 299, 115, 20);
		panel_1.add(txtCliente);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cliente");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(296, 302, 46, 14);
		panel_1.add(lblNewLabel_1_2_1);
		
		txtVehiculo = new JTextField();
		txtVehiculo.setEditable(false);
		txtVehiculo.setColumns(10);
		txtVehiculo.setBounds(352, 330, 115, 20);
		panel_1.add(txtVehiculo);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Vehiculo");
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		lblNewLabel_1_2_1_1.setBounds(296, 333, 56, 14);
		panel_1.add(lblNewLabel_1_2_1_1);
	}
}
