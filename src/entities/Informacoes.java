package entities;

public class Informacoes {
    public String nome;
    public double a;
    public double b;
    public double c;

    public double mediaTrimestres() {
        double notaFinal = a + b + c;
        System.out.println("Final Grade: " + notaFinal);

        if (notaFinal >= 60) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
            double quantoFalta = 60 - notaFinal;
            System.out.println("Falta para a aprovação " + quantoFalta + " pontos");
        }
        return notaFinal;
    }
}


