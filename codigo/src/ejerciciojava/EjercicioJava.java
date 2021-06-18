
package ejerciciojava;

import ejerciciojava.productos.CocaCola;
import ejerciciojava.productos.CocaColaZero;
import ejerciciojava.productos.Frutillas;
import ejerciciojava.productos.ShampooSedal;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioJava {
    
    static CocaColaZero cz = new CocaColaZero("Coca Cola Zero",1.5,20);
    static CocaCola cc = new CocaCola("Coca Cola",1.5,18);
    static ShampooSedal ss = new ShampooSedal("Shampo Sedal",500,19);
    static Frutillas frt = new Frutillas("Frutillas","kilo",64);
    
    public static void main (String[]args) {
		
        System.out.println("La empresa Manolita es una experta en la venta y distribución de productos de alimentación.");
        System.out.println("Fundada en el año 2000. Contigo desde hace: "+edadEmpresa()+" años.");
        System.out.println();
	listaProductos();      
        ordenamiento();
    }
    
    static void listaProductos() {

        System.out.println("Productos:");
        System.out.println("====================");
        System.out.println(cz.toString());
        System.out.println(cc.toString());
        System.out.println(ss.toString());
        System.out.println(frt.toString());
        System.out.println("====================");
    }
    
    static long edadEmpresa() {
    
        LocalDate fNac = LocalDate.of(2000,Month.JANUARY,1);
        LocalDate fHoy = LocalDate.now();
        long edad= ChronoUnit.YEARS.between(fNac, fHoy);
        return edad;   
    }
        
    static void ordenamiento() {

        Set<Producto> p = new TreeSet<Producto>();
        
        p.add(new Producto(cz.getNombre(),cz.getPrecio()));
        p.add(new Producto(cc.getNombre(),cc.getPrecio()));
        p.add(new Producto(ss.getNombre(),ss.getPrecio()));
        p.add(new Producto(frt.getNombre(),frt.getPrecio()));
        
        Object[] array = p.toArray();
        int pos = array.length-1;
        
        System.out.println();
        System.out.println("Producto mas caro: "+array[0]);
        System.out.println("Producto mas barato: "+array[pos]);   
    }
}
