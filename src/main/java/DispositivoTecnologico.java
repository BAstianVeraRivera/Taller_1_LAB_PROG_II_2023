public abstract class DispositivoTecnologico {
	private String marca;
	private String ramo;
	private String almacenamiento;
	private String procesador;
	private String modelo;
	private String añoFabricacion;
	private int precio;

	public DispositivoTecnologico(String marca, String ramo, String almacenamiento, String procesador, String modelo, String añoFabricacion, int precio) {
		this.marca = marca;
		this.ramo = ramo;
		this.almacenamiento = almacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.precio = precio;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRamo() {
		return this.ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}