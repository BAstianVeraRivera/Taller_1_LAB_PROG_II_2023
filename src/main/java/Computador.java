public class Computador extends DispositivoTecnologico {
	private String tajetaVideo;
	private String fuentePoder;
	private String chasis;
	public Pantalla unnamed_Pantalla_;

	public Computador(String marca, String ramo, String almacenamiento, String procesador, String modelo, String añoFabricacion, int precio, String tajetaVideo, String fuentePoder, String chasis) {
		super(marca, ramo, almacenamiento, procesador, modelo, añoFabricacion, precio);
		this.tajetaVideo = tajetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
	}

	public String getTajetaVideo() {
		return this.tajetaVideo;
	}

	public void setTajetaVideo(String tajetaVideo) {
		this.tajetaVideo = tajetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getTipo() {
		return "computador";
	}
}