import java.util.Scanner;

public class Exercicio21 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int idade;
        String classificacao;

        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();

        classificacao = Verificacao.classifica(idade);

        System.out.println("Classificação: " + classificacao);
    }
}