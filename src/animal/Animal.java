package animal;

public class Animal {
    private final String nome;
    private final String cor;
    private final String ambiente;
    private final float comprimento;
    private final float velocidadeMedia;
    private final int numeroPatas;

    public Animal(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int numeroPatas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidadeMedia = velocidadeMedia;
        this.numeroPatas = numeroPatas;
    }

    void impimirDados() {
        System.out.printf("NOME: %s\nCor : %s\nAmbiente: %s\nComprimento: %.2f cm     VelocidadeMedia: %.2f km/h\nNúmero de patas: %d patas", this.nome, this.cor, this.ambiente, this.comprimento, this.velocidadeMedia, this.numeroPatas);
    }
}
