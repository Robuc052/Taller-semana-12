
package com.mycompany.tallers12;

/**
 *
 * @author James Honeyman - Roberto Cubillan
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TallerS12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int x = 0;

        while (x == 0) {
            System.out.println("============          MENU          ============\n");
            System.out.println("1. Definicion de ArrayList");
            System.out.println("2. Diferencias entre ArrayList y Arreglo o Vector");
            System.out.println("3. Metodos de la clase ArrayList");
            System.out.println("4. Conclusiones sobre el uso de ArrayList");
            System.out.println("5. Funcionalidades del ArrayList");
            System.out.println("6. Salir");
            System.out.println("================================================\n");
            System.out.print("Seleccione una opcion: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("------------------------------------------");
                    System.out.println(ArrayInfo.getDefinicion());
                    System.out.println("------------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println(ArrayInfo.getDiferencias());
                    System.out.println("------------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    System.out.println(ArrayInfo.getMetodos());
                    System.out.println("------------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------------");
                    System.out.println(ArrayInfo.getConclusiones());
                    System.out.println("------------------------------------------");
                    break;
                case 5:
                    SubMenu(scanner, list);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }

    private static void SubMenu(Scanner scanner, ArrayList<String> list) {
        int y = 0;
        while (y == 0) {
            System.out.println("-------       SUBMENU        ---------\n");
            System.out.println("1. Agregar un elemento al ArrayList");
            System.out.println("2. Eliminar un elemento del ArrayList");
            System.out.println("3. Buscar un elemento en el ArrayList");
            System.out.println("4. Mostrar el contenido del ArrayList");
            System.out.println("5. Volver al menu principal");
            System.out.println("--------------------------------------\n");
            System.out.print("Seleccione una opcion: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elementoAgregar = scanner.nextLine();
                    list.add(elementoAgregar);
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese el indice del elemento a eliminar: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    if (i >= 0 && i < list.size()) {
                        list.remove(i);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Indice no valido.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a buscar: ");
                    String elementoBusca = scanner.nextLine();
                    if (list.contains(elementoBusca)) {
                        System.out.println("El elemento esta en la lista.");
                    } else {
                        System.out.println("El elemento no se encuentra en la lista.");
                    }
                    break;
                case 4:
                    System.out.println("Contenido del ArrayList: " + list);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }
}
