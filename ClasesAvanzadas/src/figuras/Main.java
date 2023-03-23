package figuras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Puntos:
        Punto p1 = new Punto(1, 0);
        Punto p2 = new Punto(0, 1);
        Punto p3 = new Punto(2, 2);
        Punto p4 = new Punto(2, 3);
        // Crea un ArrayList de puntos y añade los puntos que has creado.
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);
        //Muestra las coordenadas de los cuatro puntos./
        for (Punto elemento: puntos) {
            System.out.println(elemento.toString());
        }


        Linea linea1 = new Linea(p1, p3);
        System.out.printf("%.2f", linea1.calcularLongitud());
        System.out.println("\n" + linea1);
        linea1.dibujarLinea();
        System.out.println();
        // creamos un triángulo pasándole el arraylist de puntos
        // (utilizará solamente los tres primeros)
        Triángulo triángulo = new Triángulo(puntos);
        System.out.println(triángulo.p1);
    }
}
