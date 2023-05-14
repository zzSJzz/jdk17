package encapsulation01.getSet03;

public class Lampada {
    private String tensao;
    private String cor;
    private String marca;
    private String preco;
    private String potencia;
    private boolean status;

    public Lampada() {
    }

    public String getTensao() {
        return this.tensao;
    }

    public void setTensao(String voltagem) {
        this.tensao = voltagem;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco() {
        return this.preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        String var10000 = this.getTensao();
        return "Lampada{voltagem='" + var10000 + "', cor='" + this.getCor() + "', marca='" + this.getMarca() + "', preco='" + this.getPreco() + "', potencia='" + this.getPotencia() + "', status=" + this.isStatus() + "}\n";
    }

    void ascender() {
        this.setStatus(true);
        System.out.println("Lâmpada acesa.");
        System.out.println("Status: " + this.isStatus() + "\n");
    }

    void apagar() {
        this.setStatus(false);
        System.out.println("Lampada apagada.");
        System.out.println("Status: " + this.isStatus());
    }
}