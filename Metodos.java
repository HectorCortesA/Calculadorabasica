package case1;

import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);
    int opcion = 0;

    void ciclo() {

        do {
            System.out.println("Menu");
            System.out.println("1. suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            Scanner sc = new Scanner(System.in);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    break;

                default:
                    break;
            }
        } while (opcion != 5);
    }

    int nume1, nume2;
    int result;
    Scanner op = new Scanner(System.in);

    void suma() {
        System.out.println("ingrese el primer valor");
        nume1 = op.nextInt();
        System.out.println("ingrese el segundo valor");
        nume2 = op.nextInt();
        result = nume1 + nume2;
        System.out.println("Resultado es: " + result);

    }

    void resta() {

        System.out.println("ingrese el primer valor");
        nume1 = op.nextInt();
        System.out.println("ingrese el segundo valor");
        nume2 = op.nextInt();
        result = nume1 - nume2;
        System.out.println("Resultado es: " + result);
    }

    void multi() {

        System.out.println("ingrese el primer valor");
        nume1 = op.nextInt();
        System.out.println("ingrese el segundo valor");
        nume2 = op.nextInt();
        result = nume1 * nume2;
        System.out.println("Resultado es: " + result);
    }

    void division() {

        System.out.println("ingrese el primer valor");
        nume1 = op.nextInt();
        System.out.println("ingrese el segundo valor");
        nume2 = op.nextInt();
        result = nume1 / nume2;
        System.out.println("Resultado es: " + result);
    }

}
