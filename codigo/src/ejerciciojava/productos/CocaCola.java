
package ejerciciojava.productos;

import ejerciciojava.Producto;

    public class CocaCola extends Producto{
    
	private double litros;
	
	public CocaCola (String nombre, double litros, int precio) {
            super(nombre,precio);
            this.litros=litros;
	}
	
	public double getLitros ()	{
            return (this.litros);
	}
	
	public void setLitros (double litros)	{
            this.litros=litros;
	}
	
	public String toString () {
            return "Nombre: "+getNombre()+" /// Litros: "+litros+" /// Precio: $"+getPrecio();
	}
    
    }
