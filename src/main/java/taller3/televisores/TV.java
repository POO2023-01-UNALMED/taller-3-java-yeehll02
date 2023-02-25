package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	static int numTV; 
	
	//constructor
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		TV.numTV++;
	}
	
	//Get y Set para marca
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	//Get y Set para control
	public void setControl(Control control) {
		this.control=control;
	}
	
	public Control getControl() {
		return control;
	}
	
	//Get y Set para precio
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	//Get y Set para volumen
	public  void setVolumen(int volumen) {
		if ((estado==true) && (volumen>=0 && volumen<=7)) {
			this.volumen=volumen;
		}
		
	}
	
	public int getVolumen() {
		return volumen;
	}

	//Get y Set para canal
	public void setCanal(int can) {
		if (estado==true){
			if ((can>=1) && (can<=120)) {
			this.canal=can;
		}
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public static void setNumeroTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getNumeroTV() {
		return numTV;
	}
	
	
	public void turnOn() {
		this.estado=true;
		
		
	}
	
	public void turnOff() {
		this.estado=false;
		
		
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
	//cambio de canal y cambio de volumen
	public void canalUp() {
		if (estado==true) {
			if (canal>=1 && canal<=119) {
				canal++;
				
			}
		}
	}

	public void canalDown() {
		if (estado==true) {
			if (canal>=2 && canal<=120) {
				canal--;
				
			}
		}
		
	}
	
	public void volumenUp() {
		if (estado==true) {
			if (volumen>=0 && volumen<=6) {
				volumen++;
				
			}
		}
	}
	
	public void volumenDown() {
		if (estado==true) {
			if (volumen>=1 && volumen<=7) {
				volumen--;	
			}
		}
	}
}
