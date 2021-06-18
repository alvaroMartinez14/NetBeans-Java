
package ejerciciojava;

import java.util.ArrayList;
import java.util.Collections;

    public class Producto implements Comparable<Producto>{
        
        private String nombre;
	private int precio;
        
        private ArrayList<Producto> precios;
        
        public Producto (String nombre, int precio) {
            this.nombre=nombre;
            this.precio=precio;
	}
        
        public String getNombre ()	{
            return (this.nombre);
	}
	
	public void setNombre (String nombre)	{
            this.nombre=nombre;
	}
        
        public int getPrecio ()	{
            return (this.precio);
	}
	
	public void setPrecio (int precio)	{
            this.precio=precio;
	}
        
        public String toString() {
            return nombre;
        }

        @Override
        public int compareTo(Producto p) {
            return p.getPrecio()-this.getPrecio();
        }
        
    }
