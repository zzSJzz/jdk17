package atvdConta;

import java.util.Scanner;

public class ContaCorrente {
    float saldo;
    private String numero;

    public ContaCorrente() {
    }

    public String getNumero() {
        return this.numero;
    }

    public String setNumero(String novoNumero) {
        this.numero = novoNumero;
        return this.numero;
    }

    void definirSaldoInicial(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    void depositar(float valor) {
        this.saldo += valor;
    }

    boolean sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        conta.definirSaldoInicial(500.0F);
        System.out.println("O saldo inicial da conta é " + conta.saldo);
        System.out.println("Qual valor você deseja sacar:");
        Float valor = entrada.nextFloat();
        conta.sacar(valor);
        System.out.println("Valor depositado com succeso! \nValor atual: " + conta.saldo);
        System.out.println("Qual valor você deseja depositar: ");
        valor = entrada.nextFloat();
        conta.depositar(valor);
        System.out.println("Valor depositado com succeso! \nValor atual: " + conta.saldo);
        System.out.println("O saldo atual é " + conta.saldo);
        boolean saque = conta.sacar(500.0F);
        if (saque) {
            System.out.println("O saque foi relizado com sucesso");
            System.out.println("Valor estante: " + conta.saldo);
        }

    }
}
