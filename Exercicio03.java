import java.util.Scanner;

public class Exercicio03 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        
        String nome;
        double salario, totalvendas, salariofinal;

        System.out.println("Digite o nome do vendedor: ");
        nome = leitor.next();

        System.out.println("Digite o salario: ");
        salario = leitor.nextDouble();

        System.out.println("Digite o total de vendas: ");
        totalvendas = leitor.nextDouble();

        salariofinal = Calculadora.comissao(salario, totalvendas);

        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Salario final: " + salariofinal);


    }

}
