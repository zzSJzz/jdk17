package encapsulation01.getSet02;

public class Caneta {
    private final String marca;
    private final String cor;
    private final String tamanho;

    public Caneta(String marca, String cor, String tamanho) {
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    void imprimirDados() {
        System.out.printf("Caneta \nCor: %s \nMarca: %s \nTamanho: %s", this.cor, this.marca, this.tamanho);
    }
}
