import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Domingo\n2 - Segunda\n3 - Terça\n4 - Quarta\n5 - Quinta\n6 - Sexta\n7 - Sabado");
         int x = sc.nextInt();
         String dia = "";

         switch (x) {
             case 1:
                 dia = "domingo";
                 break;
             case 2:
                 dia = "segunda";
                 break;
             case 3:
                 dia = "terça";
                 break;
             case 4:
                 dia = "quarta";
                 break;
             case 5:
                 dia = "quinta";
                 break;
             case 6:
                 dia = "sexta";
                 break;
             case 7:
                 dia = "sabado";
                 break;
             default:
                 System.out.println("Dia inválido!");

         }
        System.out.println("Hoje é " + dia);
        sc.close();
    }
}