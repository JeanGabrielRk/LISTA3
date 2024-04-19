package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio07 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double custo, resultado;
        
        System.out.println("Informe o custo de fabrica R$: ");
        custo = leitor.nextDouble();

        resultado = Calculadora.imposto(custo);

        System.out.println("Custo do veiculo com impostos: " + resultado);

    }

}
