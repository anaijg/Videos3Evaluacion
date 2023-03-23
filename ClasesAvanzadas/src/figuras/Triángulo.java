package figuras;

import java.util.ArrayList;

public class Triángulo extends Figura2D{
    Punto p1;
    Punto p2;
    Punto p3;

    public Triángulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triángulo(ArrayList<Punto> puntos) {
        super(3);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
    }

    @Override
    protected ArrayList<Linea> crearLíneas() {
        return null;
    }

    @Override
    protected double calcularPerímetro() {
        return 0;
    }

    @Override
    protected double calcularÁrea() {
        return 0;
    }
}
