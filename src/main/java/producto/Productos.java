
package producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jaider narvaez y mayk caicedo
 */
public class Productos {
    
    private String nombre;
    private int idProducto;
    private double precio; 
    private int cantidad;
     Scanner lector= new Scanner(System.in);
        ArrayList<Productos> misProductos = new ArrayList<>();

  
   
 public Productos() {
    
    }

    public Productos(String nombre, int idProducto, double precio, int cantidad) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    public void agregarProducto() {
      
        System.out.println("Agregue nombre del producto:");
        String nombre = lector.nextLine();
              lector.nextLine();
        System.out.println("Ingrese ID del producto:");
        int idProducto = lector.nextInt();
         
                   
        System.out.println("Añada precio al producto:");
        double precio = lector.nextDouble();
                    
        System.out.println("¿Qué cantidad de producto?");
        int cantidad = lector.nextInt();
                    
        Productos nuevoProducto = new Productos (nombre, idProducto, precio, cantidad);
        misProductos.add(nuevoProducto);
    }

    /**
     * Muestra el inventario de productos en el sistema
     */
    public void verInventario() {
        System.out.println("Productos en el inventario:");
        for(Productos p : misProductos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("ID Producto: " + p.getIdProducto());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Cantidad: " + p.getCantidad());
        }
    }

    /**
     * Elimina un producto de la lista por ID en el sistema
     */
    public void eliminarProducto() {
        System.out.println("Digite el ID del producto que quiere eliminar:");
        int id = lector.nextInt();
        Iterator<Productos> it = misProductos.iterator();
        while(it.hasNext()) {
            Productos p = it.next();
            if(p.getIdProducto() == id) {
                it.remove();
            }
        }
        System.out.println("Producto con ID " + id + " ha sido eliminado.");
    }
    public void organizar(){
           for (int i = 0; i < misProductos.size() - 1; i++) {
                        for (int j = i + 1; j < misProductos.size(); j++) {
                            Productos producto1 = misProductos.get(i);
                            Productos producto2 = misProductos.get(j);

                            if (producto1.getCantidad() > producto2.getCantidad()) {
                                // Intercambio de elementos
                                misProductos.set(i, producto2);
                                misProductos.set(j, producto1);
                            }
                        }
                    }

                    // Mostrar inventario ordenado en el sistema
                    System.out.println("ordenado  por cantidad:");
                    for (Productos p : misProductos) {
                        System.out.println("Nombre: " + p.getNombre());
                        System.out.println("id:" + p.getIdProducto());
                        System.out.println("Precio: " + p.getPrecio());
                        System.out.println("Cantidad: " + p.getCantidad());
                    }
    }
    
 
}

