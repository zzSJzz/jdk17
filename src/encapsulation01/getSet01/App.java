package encapsulation01.getSet01;

import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Quadrante quadrante = new Quadrante();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadrante");
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        quadrante.setX(x);
        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();
        quadrante.setY(y);
        quadrante.verifica_quadrante();
    }
}