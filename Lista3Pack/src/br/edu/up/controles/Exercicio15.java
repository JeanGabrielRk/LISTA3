package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio15 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int opcao;
        double valorcarro;
        double desconto;

        do {

            System.out.println("Informe o valor do veiculo: ");
            valorcarro = leitor.nextDouble();

            System.out.println("Selecione uma opção: 1 - Alcool, 2 - Gasolina, 3 - Diesel");
            opcao = leitor.nextInt();

            desconto = Calculadora.descontocombustivel(opcao, valorcarro);

            System.out.println("Desconto: " + desconto);

        } while (valorcarro != 0);
    }
}