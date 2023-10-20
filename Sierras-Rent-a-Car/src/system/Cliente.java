package system;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Cliente {
	
	
	private SimpleDateFormat sdf;
	private int cedula;
	private String nombreCompleto;
	private String direccion;
	private String email;
	private String ceular;
	private Calendar fechaNac;
	
	
	public Cliente(int cedula, String nombreCompleto, String direccion, String email, String ceular,
			Calendar fechaNac) {
		super();
		this.cedula = cedula;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.email = email;
		this.ceular = ceular;
		this.fechaNac = fechaNac;
		sdf = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public int getCedula() {
		return cedula;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getEmail() {
		return email;
	}
	public String getCeular() {
		return ceular;
	}
	public Calendar getFechaNac() {
		return fechaNac;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCeular(String ceular) {
		this.ceular = ceular;
	}
	public void setFechaNac(GregorianCalendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cedula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cedula == other.cedula;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion
				+ ", email=" + email + ", ceular=" + ceular + ", fechaNac=" + sdf.format(fechaNac) + "]";
	}
	
	
}
