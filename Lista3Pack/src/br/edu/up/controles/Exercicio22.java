package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio22 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int tipo;
        double valorpagar, kwh;

        System.out.println("Digite o tipo, 1 - Residencia, 2 - Comercio, 3 - Industria: ");
        tipo = leitor.nextInt();

        System.out.println("Informe a quantidade KWh: ");
        kwh = leitor.nextDouble();

        valorpagar = Calculadora.valorluz(tipo, kwh);

        System.out.println("Valor a pagar R$: " + valorpagar);
    }
}