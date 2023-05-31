package Proyecto;

public class Producto {
	public String Producto;
	public String Marca="Lee´s Store";
	public double Precio;
	public int Unidades;
	
		
	public Producto(String Marca, double Precio,  int Unidades) {
		this.Marca= Marca;
		this.Precio= Precio;
		this.Producto= Producto;
		this.Unidades = Unidades;
	}




	public int getUnidades() {
		return Unidades;
	}




	public void setUnidades(int unidades) {
		Unidades = unidades;
	}




	public void SetPrecio(double Precio) {
		this.Precio= Precio;
	}
	
	public double GetPrecio() {
		return Precio;
	}
	public void SetProducto(String Producto) {
		this.Producto= Producto;
	}
	
	public String GetProducto() {
		return Producto;
	}
	
	public void SetMarca(String Marca) {
		this.Marca= Marca;
	}
	
	public String GetMarca() {
		return Marca;
	}
}