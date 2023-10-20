package system;

import java.util.GregorianCalendar;

public class Reserva {

	public static int id; // ESTA ID SE TIENE QUE TOMAR A TRAVES DE LA SERIALIZACION TOMANDO LA ULTIMA ID CONOCIDA
	private Vehiculo vehiculo;
	private GregorianCalendar fechaRecogida;
	private GregorianCalendar fechaDevolucion;
	private Cliente cliente;
	private EstadoReserva estado;
	private int idReserva;
	
	public Reserva(Vehiculo vehiculo, GregorianCalendar fechaRecogida, GregorianCalendar fechaDevolucion,
			Cliente cliente) {
		super();
		this.vehiculo = vehiculo;
		this.fechaRecogida = fechaRecogida;
		this.fechaDevolucion = fechaDevolucion;
		this.cliente = cliente;
		idReserva = id;
		id++;
		estado = EstadoReserva.Reservado;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public GregorianCalendar getFechaRecogida() {
		return fechaRecogida;
	}
	public GregorianCalendar getFechaDevolucion() {
		return fechaDevolucion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public int getId() {
		return idReserva;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public void setFechaRecogida(GregorianCalendar fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	public void setFechaDevolucion(GregorianCalendar fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Reserva [vehiculo=" + vehiculo + ", fechaRecogida=" + fechaRecogida + ", fechaDevolucion="
				+ fechaDevolucion + ", cliente=" + cliente + "]";
	}
}
