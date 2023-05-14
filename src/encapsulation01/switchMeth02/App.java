package encapsulation01.switchMeth02;

import java.util.Scanner;

public class App {
    static Apolice apolice = new Apolice();
    static Scanner sc;
    float valor;

    public App() {
    }

    void oferecerDesconto() {
        System.out.println("Selecione uma cidade: \n1 - Curitiba\n2 - Rio de Janeiro\n3 - São Paulo\n4 - Belo Horizonte");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                this.valor = apolice.getValor() / 100.0F * 20.0F;
                this.valor = apolice.getValor() - this.valor;
                apolice.setValor(this.valor);
                break;
            case 2:
                this.valor = apolice.getValor() / 100.0F * 15.0F;
                this.valor = apolice.getValor() - this.valor;
                apolice.setValor(this.valor);
                break;
            case 3:
                this.valor = apolice.getValor() / 100.0F * 10.0F;
                this.valor = apolice.getValor() - this.valor;
                apolice.setValor(this.valor);
                break;
            case 4:
                this.valor = apolice.getValor() / 100.0F * 5.0F;
                this.valor = apolice.getValor() - this.valor;
                apolice.setValor(this.valor);
                break;
            default:
                System.out.println("Número incorreto, o programa será encerrado.");
                System.exit(0);
        }

    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Apolice\nDigite o nome do segurado: ");
        String nome = sc.nextLine();
        apolice.setNome(nome);
        System.out.println("Digite a idade do segurado: ");
        int idade = sc.nextInt();
        apolice.setIdade(idade);
        System.out.println("Digite o valor do prêmio da apolice: ");
        float valor = sc.nextFloat();
        apolice.setValor(valor);
        apolice.calcularPremioApolice();
        app.oferecerDesconto();
        apolice.espaco();
        apolice.imprimir();
    }

    static {
        sc = new Scanner(System.in);
    }
}
