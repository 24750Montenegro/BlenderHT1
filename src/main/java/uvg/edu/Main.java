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



            if(!blender.isOn()){
                System.out.println("La licuadora está apagada, por favor enciendala para continuar.");
                System.out.println("1. Encender la licuadora");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                option = scanner.nextInt();
                if (option == 1){
                    blender.onOff();
                    System.out.println("La licuadora se ha encendido.");
                } else if (option == 2) {
                    System.out.println("Saliendo...");
                    salir = true;
                }else{
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }else{
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
                        if (blender.isFull() == false) {
                            System.out.println("La licuadora ya está vacia.");
                        } else {
                            if(!blender.empty()){
                                System.out.println("La licuadora se ha vaciado.");
                            }else{
                                System.out.println("La licuadora no se puede vaciar mientras está en uso.");
                            }
                        }
                        break;
                    case 2:
                        if (blender.isFull()) {
                            System.out.println("La licuadora ya está llena.");
                        } else {
                            if (blender.getSpeed() > 0) {
                                System.out.println("La licuadora no se puede llenar mientras está en uso.");
                            } else {
                                blender.fill();
                                System.out.println("La licuadora ha sido llenada.");
                            }
                        }
                        break;
                    case 3:
                        blender.increaseSpeed();
                        System.out.println("Velocidad incrementada. Velocidad actual: " + blender.getSpeed());
                        break;
                    case 4:
                        blender.decreaseSpeed();
                        System.out.println("Velocidad disminuida. Velocidad actual: " + blender.getSpeed());
                        break;
                    case 5:
                        System.out.println("Velocidad actual: " + blender.getSpeed());
                        break;
                    case 6:
                        if (blender.isFull()) {
                            System.out.println("La licuadora está llena.");
                        } else {
                            System.out.println("La licuadora no está llena.");
                        }
                        break;
                    case 7:
                        blender.onOff();
                        System.out.println("La licuadora se ha apagado.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
            }

        } while (!salir);

        scanner.close();
    }
}