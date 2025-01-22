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
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        blender.switchPowerStatus();
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

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

                switch (option) {
                    case 1:
                        if (blender.actualCapacity() == 0){
                            System.out.println("La licuadora ya está vacía.");
                            break;
                        }else {


                            System.out.println("1. vaciar completamente");
                            System.out.println("2. vaciar un volumen específico");
                            System.out.print("Seleccione una opción: ");
                            option = scanner.nextInt();
                            scanner.nextLine(); // Consumir el salto de línea
                            if (option == 1) {

                                if (blender.checkSpeed() == 0) {
                                    blender.emptyBlender();
                                    System.out.println("La licuadora ha sido vaciada.");
                                } else {
                                    System.out.println("La licuadora está en uso, no se puede vaciar.");
                                }

                            } else if (option == 2) {
                                if (blender.checkSpeed() == 0) {
                                    System.out.print("Ingrese la cantidad de ml a vaciar: ");
                                    float ml = scanner.nextFloat();
                                    scanner.nextLine(); // Consumir el salto de línea
                                    blender.emptyBlender(ml);
                                } else {
                                    System.out.println("La licuadora está en uso, no se puede vaciar.");
                                }

                            } else {
                                System.out.println("Opción no válida.");
                            }
                        }
                        break;
                    case 2:
                        if (blender.isFull()) {
                            System.out.println("La licuadora ya está llena.");
                            break;
                        }else {


                            System.out.println("1. Llenar completamente");
                            System.out.println("2. Llenar un volumen específico");
                            System.out.print("Seleccione una opción: ");
                            option = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Ingrese el producto a llenar: ");
                            String prod = scanner.nextLine();

                            switch (option) {
                                case 1:
                                    if (blender.checkSpeed() == 0) {
                                        blender.fillBlender(prod);
                                    } else {
                                        System.out.println("La licuadora está en uso, no se puede llenar.");
                                    }
                                    break;
                                case 2:
                                    if (blender.checkSpeed() == 0) {
                                        System.out.print("Ingrese la cantidad de ml a llenar: ");
                                        float ml = scanner.nextFloat();
                                        scanner.nextLine(); // Consumir el salto de línea
                                        blender.fillBlender(prod, ml);
                                    } else {
                                        System.out.println("La licuadora está en uso, no se puede llenar.");
                                    }
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        blender.increaseSpeed();
                        break;
                    case 4:
                        blender.decreaseSpeed();
                        break;
                    case 5:
                        System.out.println("La licuadora está a velocidad " + blender.checkSpeed());
                        break;
                    case 6:
                        if (blender.isFull()) {
                            System.out.println("La licuadora está llena.");
                        } else {
                            System.out.println("La licuadora no está llena. Capacidad actual: " + blender.actualCapacity());
                        }

                        break;
                    case 7:
                        blender.switchPowerStatus();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }

            }

        }while (!salir) ;

        scanner.close();

    }
}