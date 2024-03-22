import java.util.Scanner;

public class Exercicio04 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double dolar, cotacao, resultado;
        
        System.out.println("Informe o valor em dolar: ");
        dolar = leitor.nextDouble();

        System.out.println("Informe a cotação: ");
        cotacao = leitor.nextDouble();

        resultado = Calculadora.conversao(dolar, cotacao);

        System.out.println("Convertido R$: " + resultado);
    }

}
