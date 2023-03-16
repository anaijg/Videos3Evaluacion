package empresa;

public class Persona {
    private int añoNacimiento;
    private String dirección;
    private String nombre;

    public Persona(int añoNacimiento, String dirección, String nombre) {
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
