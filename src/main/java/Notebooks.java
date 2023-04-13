public class Notebooks extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private int bateria;

	public Notebooks(String marca, String ramo, String almacenamiento, String procesador, String modelo, String añoFabricacion, int precio, String resolucionPantalla, String tipoTeclado, int bateria) {
		super(marca, ramo, almacenamiento, procesador, modelo, añoFabricacion, precio);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getTipo() {
		return "notebook";
	}
}