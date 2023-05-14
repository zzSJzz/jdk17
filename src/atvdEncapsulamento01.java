import java.io.PrintStream;
import java.util.Scanner;

public class atvdEncapsulamento01 {
    int velocidade;
    private String marca;
    private String cor;

    public atvdEncapsulamento01() {
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public String setMarca(String novaMarca) {
        this.marca = novaMarca;
        return this.marca;
    }

    public String setCor(String novaCor) {
        this.cor = novaCor;
        return this.cor;
    }

    void definirVelocidadeInicial(int velocidadeInicial) {
        this.velocidade = velocidadeInicial;
    }

    void acelerar(int valor) {
        this.velocidade += valor;
    }

    boolean reduzir(int valor) {
        if (this.velocidade >= valor) {
            this.velocidade -= valor;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atvdEncapsulamento01 automovel = new atvdEncapsulamento01();
        automovel.definirVelocidadeInicial(automovel.velocidade);
        System.out.println("Digite a marca do carro: ");
        String novaMarca = sc.nextLine();
        automovel.setMarca(novaMarca);
        System.out.println("Digite a cor do carro: ");
        String novaCor = sc.nextLine();
        automovel.setCor(novaCor);
        PrintStream var10000 = System.out;
        String var10001 = automovel.getMarca();
        var10000.println("Marca do carro: " + var10001 + "\nCor do carro: " + automovel.getCor() + "\nO carro está parado: " + automovel.velocidade + "km/h");
        System.out.println("Quantos km/h deseja aumentar: ");
        int valor = sc.nextInt();
        automovel.acelerar(valor);
        System.out.println("O carro foi acelerado com sucesso!\nVelocidade atual: " + automovel.velocidade + "km/h");
        System.out.println("Quantos km/h deseja reduzir: ");
        valor = sc.nextInt();
        boolean reduz = automovel.reduzir(valor);
        if (reduz) {
            System.out.println("A velocidade do carro foi reduzida com sucesso!\nVelocidade atual: " + automovel.velocidade + "km/h");
        } else {
            System.out.println("A velocidade do carro não foi reduzida!\nVelocidade atual: " + automovel.velocidade + "km/h");
        }

    }
}