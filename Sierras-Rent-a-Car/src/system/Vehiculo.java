package system;

import java.io.File;
import java.util.Calendar;
import java.util.Objects;

public class Vehiculo {
	private int puertas;
	private String marca;
	private String modelo;
	private String matricula;
	private TipoVehiculo tipoVehiculo;
	private Calendar fechaInscripcion;
	private File fotos[];
	
	public Vehiculo(int puertas, String marca, String modelo, TipoVehiculo tipoVehiculo, File fotos[], String matricula) {
		super();
		this.puertas = puertas;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.fotos = fotos;
		this.matricula = matricula;
		fechaInscripcion = Calendar.getInstance();
	}
	
	public int getPuertas() {
		return puertas;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public Calendar getFechaInscripcion() {
		return fechaInscripcion;
	}
	public File[] getFotos() {
		return fotos;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setFotos(File[] fotos) {
		this.fotos = fotos;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Vehiculo [puertas=" + puertas + ", marca=" + marca + ", modelo=" + modelo + ", tipoVehiculo="
				+ tipoVehiculo + "]";
	}
	
	
}
