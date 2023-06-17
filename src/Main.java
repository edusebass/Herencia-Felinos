import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leopardo leopardo = new Leopardo("", "", 0, "", 0, 0, 0);
        Leon leon = new Leon("", "", 0, "", 0, 0, "");
        Gato gato = new Gato("", "", 0, "", 0, null, "");
        Tigre tigre = new Tigre("", "", 0, "", 0, 0, "");

        int op; // variable uso del men

        do {
            menu();
            System.out.println("Ingresar opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1: {
                    System.out.println("Ingresa la raza: ");
                    leopardo.setRaza(sc.nextLine());
                    System.out.println("Ingresa el nombre: ");
                    leopardo.setNombre(sc.nextLine());
                    System.out.println("Ingresa la edad: ");
                    leopardo.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa el habitat: ");
                    leopardo.setHabitat(sc.nextLine());
                    System.out.println("Ingresa el peso:");
                    leopardo.setPeso(sc.nextInt());
                    System.out.println("Ingresa el numero de lunares: ");
                    leopardo.setNum_lunares(sc.nextInt());
                    System.out.println("Ingresa las presas capturadas: ");
                    leopardo.setPresas_capturadas(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Mostrando datos del leopardo");
                    leopardo.imprimirleopardo();
                    sc.nextLine();
                    break;

                }
                case 2: {
                    System.out.println("Ingresa la raza: ");
                    gato.setRaza(sc.nextLine());
                    System.out.println("Ingresa el nombre: ");
                    gato.setNombre(sc.nextLine());
                    System.out.println("Ingresa la edad: ");
                    gato.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa el habitat: ");
                    gato.setHabitat(sc.nextLine());
                    System.out.println("Ingresa el peso:");
                    gato.setPeso(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa si es mascotra TRUE OR FALSE: ");
                    gato.setMascota(sc.nextBoolean());
                    sc.nextLine();
                    System.out.println("Ingresa el nombre del dueño: ");
                    gato.setNombre_dueño(sc.nextLine());
                    gato.imprimirgato();
                    sc.nextLine();
                    break;
                }
                case 3: {
                    System.out.println("Ingresa la raza: ");
                    leon.setRaza(sc.nextLine());
                    System.out.println("Ingresa el nombre: ");
                    leon.setNombre(sc.nextLine());
                    System.out.println("Ingresa la edad: ");
                    leon.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa el habitat: ");
                    leon.setHabitat(sc.nextLine());
                    System.out.println("Ingresa el peso:");
                    leon.setPeso(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa la medida de la melena: ");
                    leon.setMedida_melena(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa la intensidad del rugido: ");
                    leon.setRugido(sc.nextLine());
                    leon.imprimirleon();
                    sc.nextLine();
                    break;
                }
                case 4: {
                    System.out.println("Ingresa la raza: ");
                    tigre.setRaza(sc.nextLine());
                    System.out.println("Ingresa el nombre: ");
                    tigre.setNombre(sc.nextLine());
                    System.out.println("Ingresa la edad: ");
                    tigre.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingresa el habitat: ");
                    tigre.setHabitat(sc.nextLine());
                    System.out.println("Ingresa el peso:");
                    tigre.setPeso(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese el numero de rayas del tigre: ");
                    tigre.setNum_rayas(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese el salto: ");
                    tigre.setSalto(sc.nextLine());
                    tigre.imprimirtigre();
                    sc.nextLine();

                    break;
                }
            }
        } while (op != 5);
    }

    private static void menu() {
        System.out.println("\n\t\t ===== MENU PRINCIPAL =====\n");
        System.out.println("1. Leopardo");
        System.out.println("2. Gato");
        System.out.println("3. Leon");
        System.out.println("4. Tigre");
        System.out.println("5. SALIR");
    }
}
