package br.edu.up.controles;

import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio06 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double custo, ganho, resultado;
        
        System.out.println("Informe o preço de custo: ");
        custo = leitor.nextDouble();

        System.out.println("Informe o percentual de ganho: ");
        ganho = leitor.nextDouble();

        resultado = Calculadora.acrescimo(custo, ganho);

        System.out.println("Valor com acrescimo: " + resultado);

       
    }

}
