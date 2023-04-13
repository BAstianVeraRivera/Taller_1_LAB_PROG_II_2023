public class Tablet extends DispositivoTecnologico {
	private String resolucionTablet;
	private String accesorios;

	public Tablet(String marca, String ramo, String almacenamiento, String procesador, String modelo, String añoFabricacion, int precio, String resolucionTablet, String accesorios) {
		super(marca, ramo, almacenamiento, procesador, modelo, añoFabricacion, precio);
		this.resolucionTablet = resolucionTablet;
		this.accesorios = accesorios;
	}

	public String getResolucionTablet() {
		return this.resolucionTablet;
	}

	public void setResolucionTablet(String resolucionTablet) {
		this.resolucionTablet = resolucionTablet;
	}

	public String getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}
}