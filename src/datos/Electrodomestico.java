package datos;



public class Electrodomestico {

	private String nombre;
	private int cantidad;
	private String marca;
	private String peso;
	private int valorU;
	
	public Electrodomestico(String nombre, int cantidad, String marca, String pe, int valorU) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.marca = marca;
		this.peso = pe;
		this.valorU = valorU;
	}//Electrodomestico

	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getPeso() {
		return peso;
	}



	public void setPeso(String peso) {
		this.peso = peso;
	}



	public int getValorU() {
		return valorU;
	}



	public void setValorU(int valorU) {
		this.valorU = valorU;
	}



	public Object[] getDetalles() {
		Object[] data = {this.marca,this.nombre, this.cantidad, this.valorU,this.peso};
		System.out.println(data);
		return data;
	}//Objet getDetalles
	
	public static Electrodomestico build(int cantidad, String nombre, String marca,int valorU,String peso){
		return new Electrodomestico(nombre, cantidad,marca,peso,valorU);
	}//static Electrodomesticos
		
}
