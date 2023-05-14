package encapsulation01.switchMeth02;

public class Apolice {
    private String nome;
    private int idade;
    private float valor;

    public Apolice() {
    }

    void imprimir() {
        System.out.printf("Nome do segurado: %s\nIdade do segurado: %d\nValor do prêmio da apolice: %.2f", this.getNome(), this.getIdade(), this.getValor());
    }

    void calcularPremioApolice() {
        if (this.idade >= 18 & this.idade <= 25) {
            this.valor += this.valor * 20.0F / 100.0F;
        }

        if (this.idade >= 25 & this.idade <= 26) {
            this.valor += this.valor * 15.0F / 100.0F;
        }

        if (this.idade >= 36) {
            this.valor += this.valor * 10.0F / 100.0F;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    void espaco() {
        System.out.println("=====================\n\n=====================");
    }
}
