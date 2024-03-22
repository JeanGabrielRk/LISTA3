import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        double numero[] = new double[80];
    
        for (int i = 0; i < 80; i++) {
                System.out.println("Digite um numero: ");
                numero[i] = leitor.nextDouble();
        }
    
    int contador = Verificacao.contarNumerosNoIntervalo(numero);
    System.out.println("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + contador);
    
    }

}

