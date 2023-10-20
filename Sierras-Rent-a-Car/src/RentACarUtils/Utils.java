package RentACarUtils;

import java.util.Calendar;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import system.Cliente;
import system.Vehiculo;
import system.RentACarSystem;

public class Utils {

	private RentACarSystem racs;
	
	// Patrón para validar el email
	Pattern pattern = Pattern
			.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	Pattern patternCelular = Pattern.compile("^09[0-9]{1}[0-9]{3}[0-9]{3}$");
	
	public Utils(RentACarSystem racs) {
		this.racs = racs;
	}
	

	public Entry<String, Boolean> validarDatos(Cliente cli) { // 1- Datos correctos 2-Campo vacio 3-Error en fecha
																// 4-Error
																// en el correo
		boolean result = false;
		String mensaje = "";

		try {
			Matcher mather = pattern.matcher(cli.getEmail());
			Matcher matcherCelular = patternCelular.matcher(cli.getCeular());

			if (cli.getNombreCompleto().equals("") || cli.getEmail().equals("") || cli.getDireccion().equals("") // Campos
																													// vacios
					|| cli.getCeular().equals("") || cli.getFechaNac() == null) {
				mensaje = "Existen campos vacios o nulos";

			} else if (!(mather.find() == true)) { // Verificar Correo
				mensaje = "El email no es valido";

			} else if (cli.getNombreCompleto().length() < 4) { // Verificar Nombre
				mensaje = "El campo nombre requiere al menos 4 caracteres";

			} else if (cli.getCedula() < 9999999 || cli.getCedula() > 100000000) { // Verificar cedula
				System.out.println(cli.getCedula());
				mensaje = "La cedula no es valida";

			} else if (cli.getFechaNac().getTimeInMillis() >= Calendar.getInstance().getTimeInMillis()) {
				mensaje = "La fecha no puede ser mayor a la de hoy o la de hoy!!!!!!";

			} else if ((Calendar.getInstance().get(Calendar.YEAR) - cli.getFechaNac().get(Calendar.YEAR) < 18)) {
				mensaje = "El cliente tiene que ser mayor de 18";

			} else if (!(matcherCelular.find() == true)) {
				mensaje = "El telefono no es valido\n Formato( (099111222) van todos los numeros juntos)";
			}
			  else if (racs.esClienteDuplicado(cli)) {
				mensaje = "Ya existe otro cliente asociado a la cedula ingresada";
			} else {
				mensaje = "Cliente creado con exito!";
				result = true;
			}
		} catch (Exception e) {
			System.out.print(e);
		}

		Entry<String, Boolean> entry = Map.entry(mensaje, result);

		return entry;
	}

	public Entry<String, Boolean> validarDatosVehiculo(Vehiculo veh) {
		boolean result = false;
		String mensaje = "";

		if (veh.getMarca().equals("") || veh.getPuertas() == 0 || veh.getTipoVehiculo() == null
				|| veh.getModelo().equals("") || veh.getMatricula().equals("")) {
			mensaje = "Existen campos vacios o nulos";
			
		} else if (veh.getFotos() == null) {
			mensaje = "Faltan las fotos o la foto";
			
		} else if (veh.getMarca().length() < 4 || veh.getModelo().length() < 4) {
			mensaje = "El campo modelo y marca requieren al menos 4 caracteres";
			
		} else if (veh.getPuertas() > 5) {
			mensaje = "Los vehiculos no pueden tener una cantidad de puertas mayor a 5";
			
		} else if (racs.esVehiculoDuplicado(veh)) {
			mensaje = "Ya exite un vehiculo registrado con la matricula ingresada";
		}else {
			mensaje = "Vehiculo creado con exito!";
			result = true;
		}

		Entry<String, Boolean> entry = Map.entry(mensaje, result);
		return entry;
	}
}
