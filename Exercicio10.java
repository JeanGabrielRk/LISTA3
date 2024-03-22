import java.util.Scanner;

public class Exercicio10 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade da pessoa: ");
        idade = leitor.nextInt();

        Calculadora.maioridade(idade);

    }

}
