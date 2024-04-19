package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio20 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int nivel;
        double horas, valor;

        System.out.println("Digite o nivel do professor: ");
        nivel = leitor.nextInt();

        System.out.println("Digite a quantidade de horas: ");
        horas = leitor.nextDouble();

        valor = Calculadora.horaaula(nivel, horas);

        System.out.println("Salario: " + valor);
    }
}