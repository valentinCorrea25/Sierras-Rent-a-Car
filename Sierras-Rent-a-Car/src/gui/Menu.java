package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import RentACarUtils.Utils;
import system.RentACarSystem;

import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private RentACarSystem racs;
	private Utils util;

	public Menu(RentACarSystem racs) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		this.racs = racs;
		util = new Utils(racs);
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(0, 3, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panelCentral.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/imgs/personal-assistant (1).png")));
		panel.add(lblNewLabel);
		
		JButton btnConsultarCliente = new JButton("Consultar Cliente");
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCliente cc = new ConsultarCliente(racs);
				cc.setLocationRelativeTo(null);
				cc.setVisible(true);
			}
		});
		panel_1.add(btnConsultarCliente, BorderLayout.SOUTH);
		
		JPanel panel_2_1 = new JPanel();
		panelCentral.add(panel_2_1);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/imgs/calendar (2).png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JButton btnConsultarReserva = new JButton("Consultar Reserva");
		btnConsultarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarReserva cr = new ConsultarReserva(racs);
				cr.setLocationRelativeTo(null);
				cr.setVisible(true);
			}
		});
		panel_2_1.add(btnConsultarReserva, BorderLayout.SOUTH);
		
		JPanel panel_1_2 = new JPanel();
		panelCentral.add(panel_1_2);
		panel_1_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2_2 = new JPanel();
		panel_1_2.add(panel_2_2, BorderLayout.CENTER);
		panel_2_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Menu.class.getResource("/imgs/search.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2.add(lblNewLabel_1_1, BorderLayout.CENTER);
		
		JButton btnConsultarVehiculo = new JButton("Consultar Vehiculo");
		btnConsultarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarVehiculo cv = new ConsultarVehiculo(racs);
				cv.setLocationRelativeTo(null);
				cv.setVisible(true);
			}
		});
		panel_1_2.add(btnConsultarVehiculo, BorderLayout.SOUTH);
		
		JPanel panel_1_3 = new JPanel();
		panelCentral.add(panel_1_3);
		panel_1_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2_2_1 = new JPanel();
		panel_1_3.add(panel_2_2_1, BorderLayout.CENTER);
		panel_2_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Menu.class.getResource("/imgs/document.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2_1.add(lblNewLabel_1_1_1, BorderLayout.CENTER);
		
		JButton btnRegistrarCliente = new JButton("Registrar Cliente");
		btnRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarCliente rc = new RegistrarCliente(racs, util);
				rc.setLocationRelativeTo(null);
				rc.setVisible(true);
			}
		});
		panel_1_3.add(btnRegistrarCliente, BorderLayout.SOUTH);
		
		JPanel panel_1_4 = new JPanel();
		panelCentral.add(panel_1_4);
		panel_1_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_1_4.add(panel_2_2_1_1, BorderLayout.CENTER);
		panel_2_2_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(Menu.class.getResource("/imgs/car-key.png")));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2_1_1.add(lblNewLabel_1_1_1_1, BorderLayout.CENTER);
		
		JButton btnRegistrarReserva = new JButton("Registrar Reserva");
		btnRegistrarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarReserva rr = new RegistrarReserva(racs);
				rr.setLocationRelativeTo(null);
				rr.setVisible(true);
			}
		});
		panel_1_4.add(btnRegistrarReserva, BorderLayout.SOUTH);
		
		JPanel panel_1_5 = new JPanel();
		panelCentral.add(panel_1_5);
		panel_1_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2_2_1_1_1 = new JPanel();
		panel_1_5.add(panel_2_2_1_1_1, BorderLayout.CENTER);
		panel_2_2_1_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(Menu.class.getResource("/imgs/check-up.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2_1_1_1.add(lblNewLabel_1_1_1_1_1, BorderLayout.CENTER);
		
		JButton btnRegistrarVehiculo = new JButton("Registrar Vehiculo");
		btnRegistrarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarVehiculo rv = new RegistrarVehiculo(racs, util);
				rv.setLocationRelativeTo(null);
				rv.setVisible(true);
			}
		});
		panel_1_5.add(btnRegistrarVehiculo, BorderLayout.SOUTH);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(128, 0, 0));
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Sierras Rent-a-Car");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 29));
		lblNewLabel_2.setIcon(new ImageIcon(Menu.class.getResource("/imgs/Rent-a-car_clipdrop-background-removal (2).png")));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelSuperior.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panelSuperior.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre del Usuario");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panelSuperior.add(lblNewLabel_4);
		
		JPanel panel_Inferior = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_Inferior.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		contentPane.add(panel_Inferior, BorderLayout.SOUTH);
		
		JPanel panelIzquierdo = new JPanel();
		contentPane.add(panelIzquierdo, BorderLayout.WEST);
		
		JPanel panelDerecho = new JPanel();
		contentPane.add(panelDerecho, BorderLayout.EAST);
	}

}
