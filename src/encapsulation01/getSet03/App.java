package encapsulation01.getSet03;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.setCor("Azul");
        lampada1.setMarca("Intelbras");
        lampada1.setPotencia("110W");
        lampada1.setPreco("50,00");
        lampada1.setTensao("10A");
        lampada1.setStatus(false);
        System.out.println(lampada1);
        lampada1.ascender();
        lampada1.apagar();
        Lampada lampada2 = new Lampada();
        lampada2.setCor("Azul");
        lampada2.setMarca("Intelbras");
        lampada2.setPotencia("110W");
        lampada2.setPreco("50,00");
        lampada2.setTensao("10A");
        lampada2.setStatus(false);
        System.out.println(lampada2);
        lampada2.ascender();
        lampada2.apagar();
    }
}