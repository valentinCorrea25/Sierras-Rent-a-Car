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

import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarCliente extends JFrame {

	private RentACarSystem racs;
	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombreCompleto;
	private JTextField textField_2;
	private JTextField txtEmail;
	private JTextField txtCelular;

	public ConsultarCliente(RentACarSystem racs) {
		this.racs = racs;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblRegistrarCliente = new JLabel("Consultar Cliente");
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
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_2.add(btnCancelar);
		
		JButton btnModificarCliente = new JButton("Modificar Cliente");
		panel_2.add(btnModificarCliente);
		
		JButton btnRealizarBusqueda = new JButton("Busqueda");
		panel_2.add(btnRealizarBusqueda);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(310, 106, 114, 24);
		panel_1.add(lblNewLabel);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(309, 141, 115, 20);
		panel_1.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombreCompleto = new JTextField();
		txtNombreCompleto.setColumns(10);
		txtNombreCompleto.setBounds(309, 75, 220, 20);
		panel_1.add(txtNombreCompleto);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNombreCompleto.setBounds(310, 40, 216, 24);
		panel_1.add(lblNombreCompleto);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblDireccion.setBounds(310, 238, 155, 24);
		panel_1.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(309, 273, 220, 20);
		panel_1.add(textField_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblEmail.setBounds(310, 172, 220, 24);
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(310, 207, 220, 20);
		panel_1.add(txtEmail);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(453, 141, 112, 20);
		panel_1.add(txtCelular);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblCelular.setBounds(453, 106, 112, 24);
		panel_1.add(lblCelular);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 265, 302);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
	}
}
