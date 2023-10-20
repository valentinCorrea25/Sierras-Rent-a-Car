package system;

import java.util.ArrayList;

public class RentACarSystem {

	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	private ArrayList<Reserva> reservas = new ArrayList<>();
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
		
	}
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
		
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	public void addVehiculo(Vehiculo v) {
		vehiculos.add(v);
	}
	
	public boolean esClienteDuplicado(Cliente c) {
		for(Cliente cli : clientes) {
			if(cli.equals(c)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean esVehiculoDuplicado(Vehiculo c) {
		for(Vehiculo veh : vehiculos) {
			if(veh.equals(c)) {
				return true;
			}
		}
		return false;
	}
	
	
}
