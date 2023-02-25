package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	public static int numTV; 
	
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
	public void setPrecio(int prec) {
		this.precio=prec;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	//Get y Set para volumen
	public  void setVolumen(int vol) {
		if ((estado=true) && (vol>=0 && vol<=7)) {
			volumen=vol;
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
	
	public static void getNumeroTV(int numTV) {
		TV.numTV=numTV;
	}
	
	
	
	public boolean turnOn() {
		this.estado=true;
		return estado;
		
	}
	
	public boolean turnOff() {
		this.estado=false;
		return estado;
		
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
	//cambio de canal y cambio de volumen
	public void canalUp() {
		if (estado==true) {
			if (getCanal()>=1 && getCanal()<=119) {
				canal++;
				
			}
		}
	}

	public void canalDown() {
		if (estado==true) {
			if (getCanal()>=2 && getCanal()<=120) {
				canal--;
				
			}
		}
		
	}
	
	public void volumenUp() {
		if (estado==true) {
			if (getVolumen()>=1 && getVolumen()<=119) {
				volumen++;
				
			}
		}
	}
	
	public void volumenDown() {
		if (estado==true) {
			if (getVolumen()>=1 && getVolumen()<=7) {
				volumen--;	
			}
		}
	}
}
