import java.util.Scanner;

public class Exercicio05 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double valor, resultado;
        
        System.out.println("Informe o valor do produto: ");
        valor = leitor.nextDouble();

        resultado = Calculadora.prestacao(valor);

        System.out.println("Valor da prestação: " + resultado);
    }

}
