package encapsulation01.dataSwitchFor;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroAcademico registroAcademico1 = new RegistroAcademico();
        System.out.println("Você é bolsista(S ou N): ");
        String bolsista = sc.nextLine();
        if (Objects.equals(bolsista, "S")) {
            registroAcademico1.seteBolsista(true);
        } else if (Objects.equals(bolsista, "N")) {
            registroAcademico1.seteBolsista(false);
        } else {
            System.out.println("Opção inválida, o programa será encerrado.");
        }

        registroAcademico1.inicializaRegistro("Carlos", "2022001", 2022);
        registroAcademico1.calculaMensalidade();
        registroAcademico1.mostraRegistro();
    }
}
