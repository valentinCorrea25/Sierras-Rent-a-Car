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
import javax.swing.JComboBox;

public class ConsultarReserva extends JFrame {
	
	private RentACarSystem racs;
	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombreCompleto;
	private JTextField txtCelular;

	public ConsultarReserva(RentACarSystem racs) {
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
		
		JLabel lblRegistrarCliente = new JLabel("Consultar Reservas");
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
		
		JButton btnModificarReserva = new JButton("Modificar Reserva");
		panel_2.add(btnModificarReserva);
		
		JButton btnRealizarBusqueda = new JButton("Busqueda");
		panel_2.add(btnRealizarBusqueda);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(311, 99, 114, 24);
		panel_1.add(lblNewLabel);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(310, 134, 115, 20);
		panel_1.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombreCompleto = new JTextField();
		txtNombreCompleto.setColumns(10);
		txtNombreCompleto.setBounds(331, 68, 220, 20);
		panel_1.add(txtNombreCompleto);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCompleto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNombreCompleto.setBounds(311, 34, 255, 24);
		panel_1.add(lblNombreCompleto);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(454, 134, 112, 20);
		panel_1.add(txtCelular);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblCelular.setBounds(454, 99, 112, 24);
		panel_1.add(lblCelular);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 265, 302);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JSpinner spEntrega = new JSpinner();
		spEntrega.setBounds(311, 208, 112, 20);
		panel_1.add(spEntrega);
		
		JSpinner spDevolucion = new JSpinner();
		spDevolucion.setBounds(454, 208, 112, 20);
		panel_1.add(spDevolucion);
		
		JLabel lblFechaEntrega = new JLabel("Entrega");
		lblFechaEntrega.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblFechaEntrega.setBounds(311, 172, 114, 32);
		panel_1.add(lblFechaEntrega);
		
		JLabel lblNewLabel_1_1 = new JLabel("Devolucion");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(452, 176, 114, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JComboBox comboEstado = new JComboBox();
		comboEstado.setBounds(351, 279, 179, 22);
		panel_1.add(comboEstado);
		
		JLabel lblEstadoDeReserva = new JLabel("Estado de Reserva");
		lblEstadoDeReserva.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblEstadoDeReserva.setBounds(350, 239, 180, 32);
		panel_1.add(lblEstadoDeReserva);
	}
}
