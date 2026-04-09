import entities.Informacoes;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Informacoes info = new Informacoes();

        System.out.println("Qual seu nome: ");
        info.nome = sc.nextLine();

        System.out.println("Qual sua nota 1? ");
        info.a = sc.nextDouble();
        if (info.a > 30) {
            System.out.println("A nota maxima é 30! Passe a nota correta");
            info.a = sc.nextDouble();
        }

        System.out.println("Qual sua nota 2? ");
        info.b = sc.nextDouble();
        if (info.b > 35) {
            System.out.println("A nota maxima é 35! Passe a nota correta");
            info.b = sc.nextDouble();
        }

        System.out.println("Qual sua nota 3? ");
        info.c = sc.nextDouble();
        if (info.c > 35) {
            System.out.println("A nota maxima é 35! Passe a nota correta");
            info.c = sc.nextDouble();
        }

        info.mediaTrimestres();

        sc.close();
    }
}