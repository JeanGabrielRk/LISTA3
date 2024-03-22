import java.util.Scanner;

public class Exercicio12 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double valor, ano, valorfinal;
        char opc = 's';
        int veic = 0;
        int veicnovo = 0;
        int totalveic = 0;

        do {

            System.out.println("Digite o ano do veiculo: ");
            ano = leitor.nextDouble();

            System.out.println("Digite o valor do veiculo: ");
            valor = leitor.nextDouble();

            if (ano < 2000){
                veic++;
            }
            else {
                veicnovo++;
            }

            valorfinal = Calculadora.desconto(ano, valor);

            System.out.println("Valor: " + valorfinal);

            System.out.println("Deseja continuar S - N: ");
            opc = leitor.next().charAt(0);

        } while (opc != 'N');

        totalveic = veic + veicnovo;

        System.out.println("Veiculos ate 2000: " + veic);
        System.out.println("Veiculos depois de 2000: " + veicnovo);
        System.out.println("Total de veiculos: " + totalveic);

    }
}
