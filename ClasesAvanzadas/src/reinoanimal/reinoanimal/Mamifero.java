package reinoanimal.reinoanimal;

public class Mamifero {
    public String saludar() {
        return "el mamífero te saluda";
    }

    // voy a crear un método que no pueda sobreescribirse en ninguna de las clases hijas
    public final void saludarSecretamente() {
        System.out.println("Hola. Sssshhhhh");
    }
}

