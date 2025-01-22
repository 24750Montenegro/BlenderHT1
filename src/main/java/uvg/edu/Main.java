package uvg.edu;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IBlender blender = new Blender();

        int option;
        do {
            System.out.println("\n--- Menú de Control de Licuadora ---");
            System.out.println("1. Encender la licuadora");
            System.out.println("2. Apagar la licuadora");
            System.out.println("3. Vaciar licuadora");
            System.out.println("4. Llenar la licuadora");
            System.out.println("5. Agregar ingrediente");
            System.out.println("6. Incrementar velocidad");
            System.out.println("7. Disminuir velocidad");
            System.out.println("8. Consultar velocidad actual");
            System.out.println("9. Consultar si está llena");
            System.out.println("10. Consultar si está encendida");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    blender.isOn();
                    System.out.println("La licuadora está encendida.");
                    break;
                case 2:
                    blender.isOff();
                    System.out.println("La licuadora está apagada.");
                    break;
                case 3:
                    if (blender.isFull() == false) {
                        System.out.println("La licuadora ya está vacia.");
                    } else {
                        blender.empty();
                        System.out.println("La licuadora se ha vaciado.");
                    }
                    break;
                case 4:
                    if (blender.isFull()) {
                        System.out.println("La licuadora ya está llena.");
                    } else {
                        blender.fill();
                        System.out.println("La licuadora ha sido llenada.");
                    }
                    break;
                case 5:
                    if (blender.isFull()) {
                        System.out.println("No se pueden agregar más ingredientes, la licuadora está llena.");
                    } else {
                        System.out.print("Ingrese el ingrediente a agregar: ");
                        String ingredient = scanner.nextLine();
                        blender.addIngredient(ingredient);
                        System.out.println("Se ha agregado " + ingredient + " a la licuadora.");
                    }
                    break;
                case 6:
                    blender.increaseSpeed();
                    System.out.println("Velocidad incrementada. Velocidad actual: " + blender.getSpeed());
                    break;
                case 7:
                    blender.decreaseSpeed();
                    System.out.println("Velocidad disminuida. Velocidad actual: " + blender.getSpeed());
                    break;
                case 8:
                    System.out.println("Velocidad actual: " + blender.getSpeed());
                    break;
                case 9:
                    if (blender.isFull()) {
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora no está llena.");
                    }
                    break;
                case 10:
                    if (blender.getState() == true) {
                        System.out.println("La licuadora está encendida.");
                    } else {
                        System.out.println("La licuadora está apagada.");
                    }
                    break;
                case 11:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (option != 11);

        scanner.close();
    }
}