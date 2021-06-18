
package ejerciciojava.productos;

import ejerciciojava.Producto;

    public class ShampooSedal extends Producto{
    
	private int litros;
	
	public ShampooSedal (String nombre, int litros, int precio) {
            super(nombre,precio);
            this.litros=litros;
	}

	public int getLitros ()	{
            return (this.litros);
	}
	
	public void setLitros (int litros)	{
            this.litros=litros;
	}

	public String toString () {
            return "Nombre: "+getNombre()+" /// Litros: "+litros+"ml /// Precio: $"+getPrecio();
	}
    
    }
