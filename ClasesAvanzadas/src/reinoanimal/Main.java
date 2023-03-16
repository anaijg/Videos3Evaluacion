package reinoanimal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        //System.out.println(m.saludar()); // devuelve un String, debemos imprimirlo
        Gato g = new Gato();
        //System.out.println(g.saludar());
        Humano h = new Humano();
        //System.out.println(h.saludar());
        // en general si tiene que elegir entre dos métodos, elige el que esté "más próximo" (el más específico)
        // :)
        // si no lo imprimimos malamente vamos a ver nada


        // Crea un arraylist de mamíferos con un mamífero, un gato y un humano. Recórrelo de forma que todos saluden.

    }
}
