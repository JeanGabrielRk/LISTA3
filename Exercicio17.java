import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        double salariofunc, salariomin;
        String nome;

        System.out.println("Digite o nome do funcionario: ");
        nome = leitor.next();

        System.out.println("Informe o salario do funcionario: ");
        salariofunc = leitor.nextDouble();

        System.out.println("Informe o salario minimo: ");
        salariomin = leitor.nextDouble();
        
        double reajuste = Calculadora.reajustesalarial(salariofunc, salariomin);

        System.out.println("Funcionario: " + nome);
        System.out.println("Novo salario R$ " + (salariofunc + reajuste));
        System.out.println("Aumento de R$ " + reajuste);
    }
}