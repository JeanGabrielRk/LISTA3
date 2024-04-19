package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio16 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int i;
        double salario[] = new double[4];
        double aumento;

        for (i = 0; i < 4; i++){
            System.out.println("Informe o salario R$: ");
            salario[i] = leitor.nextDouble();

            aumento = Calculadora.aumento(salario[i]);

            System.out.println("Aumento de R$: " + aumento);

        }
        
    }
}