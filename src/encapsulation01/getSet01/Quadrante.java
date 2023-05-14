package encapsulation01.getSet01;

public class Quadrante {
    private int x;
    private int y;

    public Quadrante() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void verifica_quadrante() {
        if (this.x >= 0 & this.y >= 0) {
            System.out.println("Quadrante 1");
        } else if (this.x >= 0 & this.y < 0) {
            System.out.println("Quadrante 4");
        } else if (this.y < 0) {
            System.out.println("Quadrante 3");
        } else {
            System.out.println("Quadrante 2");
        }

    }
}
