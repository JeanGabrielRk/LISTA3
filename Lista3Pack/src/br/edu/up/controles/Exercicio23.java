package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio23 {

    public static void executar(){

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o nome da pessoa:");
    String nome = leitor.next();

    System.out.println("Digite o sexo da pessoa (M ou F):");
    String sexo = leitor.next();

    System.out.println("Digite a altura da pessoa em metros:");
    double altura = leitor.nextDouble();

    System.out.println("Digite a idade da pessoa:");
    int idade = leitor.nextInt();

    double pesoIdeal = Calculadora.calcularPesoIdeal(sexo, altura, idade);

    System.out.println("Nome: " + nome);
    System.out.println("Peso Ideal: " + pesoIdeal + " kg");

    }
}

