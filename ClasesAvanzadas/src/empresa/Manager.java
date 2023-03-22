package empresa;

import java.time.LocalDate;
import java.util.Scanner;

public class Manager extends Empleado{
    private boolean sonrisa;

    public Manager(int añoNacimiento, String dirección, String nombre, String id, LocalDate fechaInicio, Long salario, boolean sonrisa) {
        super(añoNacimiento, dirección, nombre, id, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        String cadena = "Datos del empleado\n" + "* nombre: " + getNombre()
                + "\n* dirección: " + getDirección() + "\n* año de nacimiento: " + getAñoNacimiento()
                + "\n* fecha de inicio: " + getFechaInicio() + "\n* salario: " + getSalario() + " €";

        if (sonrisa) {
            cadena = cadena + ":)";
        } else {
            cadena = cadena + ":(";
        }

        return cadena;
    }



    // esta clase hereda de Empleado, que es abstracta,
    // y ésta de Persona, que es abstracta, así que
    // debemos desarrollar el método abstracto aquí, que es la primera
    // que hereda y no es abstracta
    @Override
    public void imprimirDatosPersonales() {
        System.out.println(toString());
    }

    // se les pregunte su nivel (Junior, Senior, Experto). Si es Junior, la subida es del 1%, si es Senior, del 1,5% y si es experto, del 2%.
    @Override
    public void subirSalario() {
       double nuevoSalario = this.getSalario() + this.getSalario() * 0.02;
       this.setSalario(nuevoSalario);

    }
}
