package encapsulation01.switchMeth;

import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a data: ");
        int d = sc.nextInt();
        System.out.print("Digite o mês: ");
        int m = sc.nextInt();
        System.out.print("Digite o ano: ");
        int y = sc.nextInt();
        Data data = new Data(d, m, y);
        data.validarData();
        System.out.println(data);
    }
}

