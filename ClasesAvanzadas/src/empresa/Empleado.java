package empresa;

import java.time.LocalDate;

public abstract class Empleado extends Persona{
    private LocalDate fechaInicio;
    private double salario;

    public Empleado(int añoNacimiento, String dirección, String nombre, String id, LocalDate fechaInicio, Long salario) {
        super(añoNacimiento, dirección, nombre, id);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena = "Datos del empleado\n" + "* nombre: " + getNombre()
                + "\n* dirección: " + getDirección() + "\n* año de nacimiento: " + getAñoNacimiento()
                + "\n* fecha de inicio: " + fechaInicio + "\n* salario: " + salario + " €";

        return cadena;
    }

    //En la clase Empleado, añade el método abstracto subirSalario().
    public abstract void subirSalario();
}
