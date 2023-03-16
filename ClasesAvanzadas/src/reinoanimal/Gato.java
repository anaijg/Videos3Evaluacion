package reinoanimal;

public class Gato extends Mamifero{
    // podemos sobreescribir los métodos de la superclase

    @Override
    public String saludar() {
        //return super.saludar(); // puedo dejarlo así o puedo personalizarlo en la subclase, o sea, aquí --> lo sobreescribo
        return "miau";
    }
}
