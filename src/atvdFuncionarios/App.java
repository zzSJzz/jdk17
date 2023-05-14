package atvdFuncionarios;

import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        System.out.println("Digite a senha principal: ");
        int senhaPrincipal = sc.nextInt();
        gerente.setSenha(senhaPrincipal);
        System.out.println("A senha foi alterada para: " + gerente.getSenha());
        int a = 1;

        while(true) {
            System.out.println("Acesso GERENTE \nSenha: ");
            int pw = sc.nextInt();
            if (gerente.getSenha() == pw) {
                System.out.println("Você acessou após a " + a + " tentativa.");
                System.out.println("PESSOA " + cont + "\nDigite nome: ");
                String nome = sc.next();
                sc.nextLine();
                System.out.println("CPF: ");
                String cpf = sc.next();
                System.out.println("Salário: ");
                sc.nextLine();
                double valor = (double)sc.nextFloat();
                Funcionarios funcionarios = new Funcionarios(nome, cpf, valor);
                funcionarios.imprimirDados();
                return;
            }

            ++a;
        }
    }
}
