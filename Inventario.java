package Proyecto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    private static List<Producto> productos;
    private String username;
    private String password;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("==== MENÚ DEL INVENTARIO ====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Informe del inventario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        registrarProducto();
                        break;
                    case 2:
                        mostrarInventario();
                        break;
                    case 3:
                        generarInformeInventario();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido. Inténtelo nuevamente.");
                scanner.nextLine();
                opcion = 0;
            }
        } while (opcion != 4);
    }

    public void registrarProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese las unidades del producto: ");
        int unidades = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(marca, precio, unidades);
        agregarProducto(producto);
        System.out.println("Producto registrado exitosamente.");
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("==== INVENTARIO ====");
            System.out.println("Marca\t\tPrecio\t\tUnidades");
            System.out.println("----------------------------------------");
            for (Producto producto : productos) {
                System.out.printf("%-16s%-16.2f%-16d\n", producto.GetMarca(), producto.GetPrecio(), producto.getUnidades());
            }
            System.out.println("----------------------------------------");
        }
    
    }

    public void generarInformeInventario() {
    	for (Producto producto : productos) {
        System.out.println("==== INFORME DE INVENTARIO ====");
        System.out.println("Cantidad de productos: " + producto.getUnidades());
    	}
    }
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.mostrarMenu();
    }
}