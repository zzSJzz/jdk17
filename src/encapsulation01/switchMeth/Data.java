package encapsulation01.switchMeth;

public class Data {
    private final int dia;
    private final int mes;
    private final int ano;
    private String mes2;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    void validarData() {
        if (this.getDia() <= 31 & this.getDia() >= 1) {
            System.out.println("Você digitou um dia válido. \n");
        } else {
            System.out.println("Você digitou um dia inválido. \n");
            System.exit(0);
        }

        if (this.getMes() <= 12 & this.getMes() >= 1) {
            System.out.println("Você digitou um mês válido. \n");
        } else {
            System.out.println("Você digitou um mês inválido. \n");
            System.exit(0);
        }

        switch (this.getMes()) {
            case 1:
                this.mes2 = "Janeiro";
                break;
            case 2:
                this.mes2 = "Fervereiro";
                break;
            case 3:
                this.mes2 = "Março";
                break;
            case 4:
                this.mes2 = "Abril";
                break;
            case 5:
                this.mes2 = "Maio";
                break;
            case 6:
                this.mes2 = "Junho";
                break;
            case 7:
                this.mes2 = "Julho";
                break;
            case 8:
                this.mes2 = "Agosto";
                break;
            case 9:
                this.mes2 = "Setembro";
                break;
            case 10:
                this.mes2 = "Outubro";
                break;
            case 11:
                this.mes2 = "Novembro";
                break;
            case 12:
                this.mes2 = "Dezembro";
        }

        if (this.getMes() <= 3000 & this.getMes() >= 0) {
            System.out.println("Você digitou um ano válido. \n");
        } else {
            System.out.println("Você digitou um ano inválido. \n");
            System.exit(0);
        }

        if (this.getAno() % 400 == 0) {
            System.out.println("O ano é bissexto \n");
        } else if (this.getAno() % 4 == 0 & this.getAno() % 100 != 0) {
            System.out.println("O ano é bissexto \n");
        } else {
            System.out.println("O ano não é bissexto \n");
        }

    }

    public String toString() {
        int var10000 = this.getDia();
        return "" + var10000 + " de " + this.getMes() + " de " + this.mes2 + " de " + this.getAno();
    }
}
