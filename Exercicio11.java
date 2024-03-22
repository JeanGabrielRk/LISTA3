import java.util.Scanner;

public class Exercicio11 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        String nome[] = new String[5];
        char sexo[] = new char[5];
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = leitor.next();

            System.out.println("Informe o sexo (F - M): ");
            sexo[i] = Verificacao.lerSexo(leitor);

            if (sexo[i] == 'M' || sexo[i] == 'm') {
                totalHomens++;
            } else if (sexo[i] == 'F' || sexo[i] == 'f') {
                totalMulheres++;
            }
        }

        System.out.println("\nInformações das pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome: " + nome[i] + " - Sexo: " + (sexo[i] == 'M' || sexo[i] == 'm' ? "Homem" : "Mulher"));
        }

        System.out.println("\nTotal de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        leitor.close();

    }

}
