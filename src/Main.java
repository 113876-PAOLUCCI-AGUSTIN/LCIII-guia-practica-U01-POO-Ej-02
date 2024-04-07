/*
 *
 * 1. Crear una clase Punto que permita representar puntos en un plano de un sistema de coordenadas
 * cartesianas. DONE.
 * Crear un programa que permita ingresar los datos de dos puntos y con ellos cree dos instancias
 * de la clase Punto. DONE
 * A partir de las instancias creadas calcular y mostrar la distancia existente entre ambos puntos.
 *
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STDIN
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas X y Y del primer punto");
        Integer x1 = teclado.nextInt();
        Integer y1 = teclado.nextInt();
        Punto p01 = new Punto(x1, y1);

        //teclado = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas X y Y del segundo punto");
        Integer x2 = teclado.nextInt();
        Integer y2 = teclado.nextInt();
        Punto p02 = new Punto(x2, y2);
    }

    public static Double getDistance(Punto p1, Punto p2) {
        Double firstTerm = (Math.pow((p2.getValorEjeX() - p1.getValorEjeX()),2));
        Double secondTerm = (Math.pow((p2.getValorEjeY() - p1.getValorEjeY()),2));
        Double thirdTerm = firstTerm + secondTerm;
        return Math.sqrt(thirdTerm);
        // Formula: d = √((x2 - x1)² + (y2 - y1)²)
    }
}