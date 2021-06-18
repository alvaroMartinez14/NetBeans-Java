
package ejerciciojava.productos;

import ejerciciojava.Producto;

    public class Frutillas extends Producto{
    
	private String unidad;
	
	public Frutillas (String nombre, String unidad, int precio) {
            super(nombre,precio);
            this.unidad=unidad;
	}

	public String getUnidad ()	{
            return (this.unidad);
	}
	
	public void setUnidad (String litros)	{
            this.unidad=unidad;
	}

	public String toString () {
            return "Nombre: "+getNombre()+" /// Precio: $"+getPrecio()+" /// Unidad de venta: "+unidad;
	}
    
    }
