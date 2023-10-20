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

public class ConsultarVehiculo extends JFrame {

	private RentACarSystem racs;
	private JPanel contentPane;
	private JTextField txtModelo;
	private JTextField txtMarca;

	public ConsultarVehiculo(RentACarSystem racs) {
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
		
		JLabel lblRegistrarCliente = new JLabel("Consultar Vehiculos");
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
		
		JButton btnRealizarBusqueda = new JButton("Busqueda");
		panel_2.add(btnRealizarBusqueda);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(311, 77, 114, 24);
		panel_1.add(lblNewLabel);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(310, 112, 220, 20);
		panel_1.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(310, 46, 220, 20);
		panel_1.add(txtMarca);
		
		JLabel lblNombreCompleto = new JLabel("Marca");
		lblNombreCompleto.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNombreCompleto.setBounds(311, 11, 216, 24);
		panel_1.add(lblNombreCompleto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 265, 302);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblFechaEntrega = new JLabel("Tipo");
		lblFechaEntrega.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblFechaEntrega.setBounds(311, 143, 114, 32);
		panel_1.add(lblFechaEntrega);
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setBounds(311, 186, 219, 22);
		panel_1.add(comboTipo);
		
		JLabel lblEstadoDeReserva = new JLabel("Estado del Vehiculo");
		lblEstadoDeReserva.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblEstadoDeReserva.setBounds(311, 219, 219, 32);
		panel_1.add(lblEstadoDeReserva);
		
		JComboBox comboEstado = new JComboBox();
		comboEstado.setEnabled(false);
		comboEstado.setBounds(311, 262, 219, 22);
		panel_1.add(comboEstado);
	}
}
