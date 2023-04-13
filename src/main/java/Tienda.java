import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	private String direccion;
	private String nombreTienda;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<DispositivoTecnologico> dispositivosTecnologicos = new ArrayList<DispositivoTecnologico>();

	public Tienda(String nombreTienda, String direccion) {
		this.nombreTienda = nombreTienda;
		this.direccion = direccion;
	}
	public ArrayList<CuentaCliente> cuentas = new ArrayList<CuentaCliente>();
	public void agregarCuenta(CuentaCliente cuenta) {
		this.cuentas.add(cuenta);
	}
	public void agregarDispositivos(DispositivoTecnologico dipositivo) {
		this.dispositivosTecnologicos.add(dipositivo);
	}


	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombreTienda() {return nombreTienda;}
	public void setNombreTienda(String nombreTienda) {this.nombreTienda = nombreTienda;}

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
	public static ArrayList<Computador> obtenerComputadores(Tienda tienda) {
		ArrayList<Computador> computadores = new ArrayList<Computador>();
		for (DispositivoTecnologico dispositivo : tienda.dispositivosTecnologicos) {
			if (dispositivo instanceof Computador) {
				computadores.add((Computador) dispositivo);
			}
		}
		return computadores;
	}
	public static ArrayList<Notebooks> obtenerNotebooks(Tienda tienda) {
		ArrayList<Notebooks> notebooks = new ArrayList<Notebooks>();
		for (DispositivoTecnologico dispositivo : tienda.dispositivosTecnologicos) {
			if (dispositivo instanceof Notebooks) {
				notebooks.add((Notebooks) dispositivo);
			}
		}
		return notebooks;
	}
	public static ArrayList<Tablet> obtenerTablets(Tienda tienda) {
		ArrayList<Tablet> tablets = new ArrayList<Tablet>();
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
		for(Cliente cliente1 : clientes){
			if(cliente1.getNombre().equals(cliente.getNombre())){
				this.clientes.remove(cliente);
			}
			else System.out.println(cliente);
			System.out.println("Cliente agregado");
		}
	}
	public void menuPrincipal(){
		System.out.println("Presione 1 si desea buscar dispositivos tecnológicos por marca");
		System.out.println("Presione 2 si desea buscar dispositivos tecnológicos por modelo");
		System.out.println("Presione 3 si desea ver computadores de escritorio");
		System.out.println("Presione 4 si desea ver notebooks");
		System.out.println("Presione 5 si desea ver tables");
		System.out.println("Presione 6 si desea salir");
	}
	public void mostrarMenu() {
		Tienda techy = new Tienda("Techy","San martin 2034");
		Cliente cliente1 = new Cliente("Bastian","Vera","vera.bastian99@gmail.com","","","");
		Cliente cliente2 = new Cliente("Christian","Ortega","ortega.christian01@gmail.com","","","");
		Notebooks Macbook = new Notebooks("Apple", "8 GB", "1 Terabyte", "","","",1000000,"","",10000);
		Notebooks Zenbook = new Notebooks("Asus", "8 GB", "1 Terabyte", "","","",900000,"","",10000);
		Notebooks Matebook = new Notebooks("Huawei", "8 GB", "1 Terabyte", "","","",800000,"","",10000);
		Computador Imac = new Computador("Apple", "8 GB", "1 Terabyte", "","","",1200000,"","","");
		Computador MateDesk = new Computador("Huawei", "12 GB", "1 Terabyte", "","","",1500000,"","","");
		Computador GameDesk = new Computador("Razer", "16 GB", "1 Terabyte", "","","",2000000,"","","");
		Tablet Ipad = new Tablet("Apple", "4 GB", "1 Terabyte", "","","",900000,"","");
		Tablet MiPad = new Tablet("Xiaomi", "12 GB", "1 Terabyte", "","","",400000,"","");
		Tablet STab = new Tablet("Samsung", "12 GB", "1 Terabyte", "","","",500000,"","");
		Pantalla pantalla = new Pantalla("","",2017);
		CuentaCliente cuenta1 = new CuentaCliente();
		CuentaCliente cuenta2 = new CuentaCliente();
		// ASOCIAR CUENTAS A CLIENTES
		cliente1.agregarCuenta(cuenta1);
		cliente2.agregarCuenta(cuenta2);
		// ASOCIAR CUENTAS A TIENDA
		techy.agregarCuenta(cuenta2);
		techy.agregarCuenta(cuenta1);
		Imac.agregarPantalla(pantalla);
		MateDesk.agregarPantalla(pantalla);
		GameDesk.agregarPantalla(pantalla);
		techy.agregarDispositivos(Macbook);
		techy.agregarDispositivos(Zenbook);
		techy.agregarDispositivos(Matebook);
		techy.agregarDispositivos(Ipad);
		techy.agregarDispositivos(MiPad);
		techy.agregarDispositivos(STab);
		techy.agregarDispositivos(Imac);
		techy.agregarDispositivos(MateDesk);
		techy.agregarDispositivos(GameDesk);


		int opcion= 0;
		do{
			Scanner intro = new Scanner(System.in);
			menuPrincipal();
			opcion = intro.nextInt();
			switch(opcion){
				case 1:
					techy.buscarDispositivoPorMarca();
					break;
				case 2:
					techy.buscarDispositivoPorModelo();
					break;
				case 3:
					ArrayList<Computador> computadores = obtenerComputadores(techy);
					for (Computador computador : computadores) {
						System.out.println(computador);
					}
					break;
				case 4:
					ArrayList<Notebooks> notebooks = obtenerNotebooks(techy);
					for (Notebooks notebook : notebooks) {
						System.out.println(notebook);
					}
					break;
				case 5:
					ArrayList<Tablet> tablets = obtenerTablets(techy);
					for (Tablet tablet : tablets) {
						System.out.println(tablet);
					}
					break;
				case 6:
					break;

			}


		}while(opcion!=6);

	}
}