package animal;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Gato", "Preto", "Frio", 4.0F, 48.0F, 4);
        animal.impimirDados();
    }
}
