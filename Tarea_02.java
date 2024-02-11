import java.util.Scanner;

public class Tarea_02 {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double[] ingresoDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número");
        double a = scanner.nextDouble();
        System.out.println("Ingresa el segundo número");
        double b = scanner.nextDouble();
        double[] datos = { a, b };
        return datos;

    }

    public static void continuar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseas realizar otra operación? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("n")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculadora de operaciones básicas");
        Scanner scanner = new Scanner(System.in);
        double[] datos;
        while (true) {
            System.out.println("Que operación deseas realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            int operacion = scanner.nextInt();
            switch (operacion) {
                case 1:
                    datos = ingresoDatos();
                    System.out.println("El resultado de la suma es: " + suma(datos[0], datos[1]));
                    continuar();
                    break;
                case 2:
                    datos = ingresoDatos();
                    System.out.println("El resultado de la resta es: " + resta(datos[0], datos[1]));
                    continuar();
                    break;
                case 3:
                    datos = ingresoDatos();
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion(datos[0], datos[1]));
                    continuar();
                    break;
                case 4:
                    datos = ingresoDatos();
                    System.out.println("El resultado de la división es: " + division(datos[0], datos[1]));
                    continuar();
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }
        }

    }
}