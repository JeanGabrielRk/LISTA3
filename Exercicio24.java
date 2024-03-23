import java.util.Scanner;

public class Exercicio24 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, notafinal;

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        notafinal = Calculadora.meidaponderada(nota1, nota2, nota3);

        System.out.println("Resultado final: " + notafinal);
    }
}