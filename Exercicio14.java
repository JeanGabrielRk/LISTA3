import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        double vlrcusto[] = new double[4];
        double vlrvenda[] = new double[4];
        int i;
        double totalcusto = 0, totalvend = 0;
        double mediacusto, mediavenda;

        for (i = 0; i < 4; i++){
            System.out.println("Informe o custo: ");
            vlrcusto[i] = leitor.nextDouble();
            totalcusto = vlrcusto[i] + totalcusto;
    
            System.out.println("Informe o valor de venda: ");
            vlrvenda[i] = leitor.nextDouble();
            totalvend = totalvend + vlrvenda[i];

            double dif = Calculadora.mediapreco(vlrvenda[i], vlrcusto[i]);

            System.out.println("Diferença de: " + dif);
        }

        mediacusto = totalcusto / 4;
        mediavenda = totalvend / 4;

        System.out.println("Media de custo: " + mediacusto);
        System.out.println("Media de venda: " + mediavenda);
        

    }
}