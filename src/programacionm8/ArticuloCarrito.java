/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionm8;
/**
 * 
 * @author Luigi
 *
 */
public class ArticuloCarrito {
	Articulo elemento;
	int cantidad;
	
	public ArticuloCarrito() {};
	
	public ArticuloCarrito(Articulo articulo, int cantidad) {
		this.elemento = articulo;
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return this.elemento + "x" + this.cantidad + "\n";
	}
}
