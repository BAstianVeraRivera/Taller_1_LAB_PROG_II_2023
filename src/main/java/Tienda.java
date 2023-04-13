import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DispositivoTecnologico buscarDispositivoPorModelo() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese el modelo del producto");
		String modeloDispositivo = intro.nextLine();
		for(DispositivoTecnologico dispositivo : dispositivosTecnologicos){
			if(dispositivo.getModelo().equals(modeloDispositivo)){
				return dispositivo;
			}
		}
		return null;
	}
	public DispositivoTecnologico buscarDispositivoPorMarca() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese el marca del producto");
		String marcaDispositivo = intro.nextLine();
		for(DispositivoTecnologico dispositivo : dispositivosTecnologicos){
			if(dispositivo.getMarca().equals(marcaDispositivo)){
				return dispositivo;
			}
		}
		return null;
	}
	public static ArrayList<DispositivoTecnologico> obtenerComputadores(Tienda tienda) {
		ArrayList<DispositivoTecnologico> computadores = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : tienda.dispositivosTecnologicos) {
			if (dispositivo instanceof Computador) {
				computadores.add((Computador) dispositivo);
			}
		}
		return computadores;
	}
	public static ArrayList<DispositivoTecnologico> obtenerNotebooks(Tienda tienda) {
		ArrayList<DispositivoTecnologico> notebooks = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : tienda.dispositivosTecnologicos) {
			if (dispositivo instanceof Notebooks) {
				notebooks.add((Notebooks) dispositivo);
			}
		}
		return notebooks;
	}
	public static ArrayList<DispositivoTecnologico> obteneTablets(Tienda tienda) {
		ArrayList<DispositivoTecnologico> tablets = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : tienda.dispositivosTecnologicos) {
			if (dispositivo instanceof Tablet) {
				tablets.add((Tablet) dispositivo);
			}
		}
		return tablets;
	}
	public void agregarCliente() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese nombre del cliente");
		String nombre = intro.next();
		System.out.println("Ingrese apellido del cliente");
		String apellido = intro.next();
		System.out.println("Ingrese correo del cliente");
		String correo = intro.next();
		System.out.println("Ingrese número de contacto del cliente");
		String nroContacto = intro.next();
		System.out.println("Ingrese estado civil del cliente");
		String estadoCivil = intro.next();
		System.out.println("Ingrese ciudad del cliente");
		String ciudad = intro.next();
		Cliente cliente = new Cliente(nombre,apellido,correo,nroContacto,estadoCivil,ciudad);
		this.clientes.add(cliente);
		System.out.println(cliente);
		System.out.println("Cliente agregado");
	}
}