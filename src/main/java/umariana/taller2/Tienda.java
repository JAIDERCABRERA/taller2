package umariana.taller2;

import java.util.Scanner;
import producto.Productos;

/**
 *
 * @author jaider narvaez y mayk caicedo
 * 
 */
public class Tienda {
        public static void main(String[] args) {
        Productos p = new Productos();
        Scanner lector= new Scanner(System.in);
       
        boolean activo = true;
        do{
            System.out.println("Menu tienda");
            System.out.println("Elgie una opcion");
            System.out.println("1:Agregrar producto");
            System.out.println("2:Ver inventario");
            System.out.println("3:Organizar Productos");
            System.out.println("4:Eliminar Productos");
            System.out.println("5:Salir");
            
            
            int opcion =lector.nextInt();
            switch(opcion){
                case 1 -> p.agregarProducto();
                case 2 -> p.verInventario();
                // Organizar productos de manera ascendente
                // Organizar productos de manera ascendente 
               
                case 3 -> p.organizar();
                case 4 -> p.eliminarProducto();
                case 5 -> {
                    activo = false; 
                    System.out.println("programa finalizado");
                }
                default -> System.out.println("opcion no valida");
                    
                    
            }
            // agregrar producto al sistema
            // ver inventario del sistema
            //Elimirar productos del sisstma
            //salir
                        
        }while(activo);
        

        }
        

        }

