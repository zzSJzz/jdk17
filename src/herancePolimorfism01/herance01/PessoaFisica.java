package herancePolimorfism01.herance01;

public class PessoaFisica extends Cliente {
    private String cpf;
    PessoaFisica pessoaFisica1 = new PessoaFisica("Carlos", "4042020", "71996433793");

    PessoaFisica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    void imprimirDados() {
        System.out.println("Nome: " + this.pessoaFisica1.nome + "\nEndereço: " + this.pessoaFisica1.endereco + "\nTelefone: " + this.pessoaFisica1.telefone + "\nCPF: " + this.cpf);
    }
}
