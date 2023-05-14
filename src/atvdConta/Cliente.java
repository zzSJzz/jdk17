package atvdConta;

    public class Cliente {
        private final String nome;
        private final int idade;

        public Cliente(String novoNome, int novaIdade) {
            this.nome = novoNome;
            this.idade = novaIdade;
        }

        public String getNome() {
            return this.nome;
        }

        public int getIdade() {
            return this.idade;
        }

        public static void main(String[] args) {
            Cliente cliente = new Cliente("João", 25);
            System.out.println("O nome é: " + cliente.nome + "\nA idade é: " + cliente.idade);
        }
    }
