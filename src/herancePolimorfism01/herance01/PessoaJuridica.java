package herancePolimorfism01.herance01;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;
    PessoaJuridica pessoajuridica1 = new PessoaJuridica("Carlos", "4042020", "71996433793");

    PessoaJuridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    void imprimirDados() {
        System.out.println("Nome: " + this.pessoajuridica1.nome + "\nEndereço: " + this.pessoajuridica1.endereco + "\nTelefone: " + this.pessoajuridica1.telefone + "\nCPF: " + this.cnpj + "\nNome Fantasia: " + this.nomeFantasia);
    }
}
