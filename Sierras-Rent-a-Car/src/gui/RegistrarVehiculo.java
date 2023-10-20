package gui;

import java.awt.EventQueue;

import system.TipoVehiculo;
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
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map.Entry;
import java.util.Calendar;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;

import RentACarUtils.Utils;
import system.Cliente;
import system.RentACarSystem;
import system.TipoVehiculo;
import system.Vehiculo;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class RegistrarVehiculo extends JFrame {

	private RentACarSystem racs;
	private Utils util;
	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JSpinner spPuertas;
	private JComboBox<TipoVehiculo> comboTiposVehiculos;
	private File fotos[];
	private JLabel lblFoto;
	private JTextField txtMatricula;

	public RegistrarVehiculo(RentACarSystem racs, Utils util) {
		this.util = util;
		this.racs = racs;
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

		JLabel lblRegistrarCliente = new JLabel("Registrar Vehiculo");
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

		JButton btnGuardarVehiculo = new JButton("Guardar Vehiculo");
		btnGuardarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String marca = txtMarca.getText();
					String modelo = txtModelo.getText();
					String matricula = txtMatricula.getText();
					int puertas = (int) spPuertas.getValue();
					TipoVehiculo tipo = (TipoVehiculo) comboTiposVehiculos.getSelectedItem();

					Vehiculo vehiculo = new Vehiculo(puertas, marca, modelo, tipo, fotos, matricula);
					Entry<String, Boolean> result = util.validarDatosVehiculo(vehiculo);
					if (result.getValue()) {
						racs.addVehiculo(vehiculo);
						JOptionPane.showMessageDialog(null, result.getKey());
						
						fotos = null;
						txtModelo.setText("");
						txtMarca.setText("");
						txtMatricula.setText("");
						spPuertas.setValue(0);
						comboTiposVehiculos.setSelectedIndex(0);
						lblFoto.setIcon(null);
						
					} else {
						JOptionPane.showMessageDialog(null, result.getKey());
						vehiculo = null;
					}

				} catch (NumberFormatException exept) {
					JOptionPane.showMessageDialog(null,
							"Ha intentado utilizar letras en el campo de numeros o hay campos vacios!\nIntentelo de vuelta");
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		panel_2.add(btnGuardarVehiculo);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel.setBounds(46, 31, 115, 24);
		panel_1.add(lblNewLabel);

		txtMarca = new JTextField();
		txtMarca.setBounds(46, 66, 115, 20);
		panel_1.add(txtMarca);
		txtMarca.setColumns(10);

		JLabel lblDireccion = new JLabel("Modelo");
		lblDireccion.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblDireccion.setBounds(194, 31, 114, 24);
		panel_1.add(lblDireccion);

		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(193, 66, 115, 20);
		panel_1.add(txtModelo);

		JLabel lblCelular = new JLabel("Cantidad de puertas");
		lblCelular.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblCelular.setBounds(46, 163, 262, 24);
		panel_1.add(lblCelular);

		lblFoto = new JLabel("");
		lblFoto.setBounds(350, 71, 155, 168);
		lblFoto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblFoto);

		JLabel lblNewLabel_2 = new JLabel("Foto del Vehiculo");
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(341, 31, 182, 24);
		panel_1.add(lblNewLabel_2);

		spPuertas = new JSpinner();
		spPuertas.setBounds(46, 198, 262, 20);
		panel_1.add(spPuertas);

		JLabel lblTipoDeVehiculo = new JLabel("Tipo de Vehiculo");
		lblTipoDeVehiculo.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblTipoDeVehiculo.setBounds(46, 229, 204, 24);
		panel_1.add(lblTipoDeVehiculo);

		comboTiposVehiculos = new JComboBox();
		comboTiposVehiculos.setModel(new DefaultComboBoxModel<TipoVehiculo>(TipoVehiculo.values()));
		comboTiposVehiculos.setBounds(46, 264, 204, 22);
		panel_1.add(comboTiposVehiculos);

		JButton btnNewButton = new JButton("Cargar Imagenes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean utilizable = true;
				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Solo tipo JPG, PNG y GIF", "jpg",
						"png", "gif", "jpeg");
				fc.setFileFilter(imgFilter);
				fc.setMultiSelectionEnabled(true);
				fc.setDialogTitle("Seleccione las imagenes que quiera utilizar");
				int resultado = fc.showSaveDialog(RegistrarVehiculo.this);

				try {
					if (resultado != JFileChooser.CANCEL_OPTION) {
						File files[] = fc.getSelectedFiles();
						
						if (files == null) {
							JOptionPane.showMessageDialog(null, "Error en la seleccion de las fotos");
						}else {
							for(File file : files) {
								String fileName = file.getName().toLowerCase();
								if (!fileName.endsWith(".jpg") && !fileName.endsWith(".png") && !fileName.endsWith(".gif")) {
									utilizable = false;
								}
							}
							if(utilizable) {
								fotos = files;
								ImageIcon imgIcon = new ImageIcon(new ImageIcon(files[0].getAbsolutePath()).getImage()
										.getScaledInstance(155, 168, Image.SCALE_SMOOTH));
								lblFoto.setIcon(imgIcon);
							}else {
								JOptionPane.showMessageDialog(null, "Los formatos de los archivos no son validos");
							}
						}
					}
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		btnNewButton.setBounds(350, 254, 154, 24);
		panel_1.add(btnNewButton);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 23));
		lblMatricula.setBounds(46, 97, 115, 24);
		panel_1.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(46, 132, 262, 20);
		panel_1.add(txtMatricula);
	}
}
