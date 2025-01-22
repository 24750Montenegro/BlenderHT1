package uvg.edu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IBlender blender = new Blender();

        int option;
        boolean salir  = false;
        do {
            System.out.println("\n--- Menú de Control de Licuadora ---");


            if (blender.checkPowerStatus() == 0) {
                System.out.println("1. Encender licuadora");

            } else {
                System.out.println("1. Vaciar licuadora");
                System.out.println("2. Llenar la licuadora");
                System.out.println("3. Incrementar velocidad");
                System.out.println("4. Disminuir velocidad");
                System.out.println("5. Consultar velocidad actual");
                System.out.println("6. Consultar si está llena");
                System.out.println("7. Apagar");
                System.out.print("Seleccione una opción: ");
                option = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea


            }

        }while (!salir) ;

        scanner.close();

    }
}