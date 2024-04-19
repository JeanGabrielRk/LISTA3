package br.edu.up.controles;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class Exercicio02 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double distancia, combustivel;

        System.out.println("Informe a distancia total percorrida: ");
        distancia = leitor.nextDouble();

        System.out.println("Informe o total de combustivel gasto: ");
        combustivel = leitor.nextDouble();
        
        double media = Calculadora.consumo(distancia, combustivel);

        System.out.println("Autonomia: " + media);

    }
}
