package atvdFuncionarios;

public class Funcionarios {
    private final String nome;
    private final String cpf;
    private final double valor;

    public Funcionarios(String nome, String cpf, double valor) {
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
    }

    public void imprimirDados() {
        System.out.printf("NOME: \n%s \n%s \n%.2f", this.nome, this.cpf, this.valor);
    }
}
