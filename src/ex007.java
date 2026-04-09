import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char escolha;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (9 * c)/5 + 32;
            System.out.printf("A temperatura em Fahrenheith é %.1f%n", f);
            System.out.println("Deseja repetir? (s/n)");
            escolha = sc.next().charAt(0);
        } while (escolha != 'n');
        System.out.println("Programa Finalizado!");
        sc.close();
    }
}
