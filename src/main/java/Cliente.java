import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String correo;
	private String nroContacto;
	private String estadoCivil;

	public Cliente(String nombre, String apellido, String correo, String nroContacto, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.nroContacto = nroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}
	public ArrayList<CuentaCliente> cuentas = new ArrayList<CuentaCliente>();
	public void agregarCuenta(CuentaCliente cuenta) {
		this.cuentas.add(cuenta);
	}

	private String ciudad;
	public Tienda unnamed_Tienda_;
	public CuentaCliente cuenta;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNroContacto() {
		return this.nroContacto;
	}

	public void setNroContacto(String nroContacto) {
		this.nroContacto = nroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}