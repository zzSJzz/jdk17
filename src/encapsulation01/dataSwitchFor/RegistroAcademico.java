package encapsulation01.dataSwitchFor;

import encapsulation01.switchMeth.Data;

public class RegistroAcademico {
    private String nomeDoAluno;
    private String numeroDaMatricula;
    private Data dataDeNascimento;
    private boolean eBolsista;
    private int anoDaMatricula;
    private float mensalidade;

    public RegistroAcademico() {
    }

    public boolean iseBolsista() {
        return this.eBolsista;
    }

    public void seteBolsista(boolean eBolsista) {
        this.eBolsista = eBolsista;
    }

    public float getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    void inicializaRegistro(String nomeDoAluno, String numeroDaMatricula, int anoDaMatricula) {
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDaMatricula = numeroDaMatricula;
        this.dataDeNascimento = new Data(19, 6, 2003);
        this.anoDaMatricula = anoDaMatricula;
        this.setMensalidade(400.0F);
    }

    void calculaMensalidade() {
        if (this.iseBolsista()) {
            this.setMensalidade(this.getMensalidade() / 2.0F);
        }

    }

    void mostraRegistro() {
        System.out.printf("Registro Acadêmico\nNome: %s\nNúmero do aluno: %s", this.nomeDoAluno, this.numeroDaMatricula);
        Data var10001 = this.dataDeNascimento;
        System.out.println("\nData de nascimento: " + var10001 + "\nÉ bolsista: " + this.iseBolsista() + "\nAno de matrícula: " + this.anoDaMatricula + "\nValor da mensalidade: R$ " + this.getMensalidade());
    }
}