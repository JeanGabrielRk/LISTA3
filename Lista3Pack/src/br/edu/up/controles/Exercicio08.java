package br.edu.up.controles;

import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio08 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        String nome;
        double media, nota1, nota2, nota3;
        
        System.out.println("Informe o nome do aluno: ");
        nome = leitor.next();
        
        System.out.println("Digite uma nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite uma nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Digite uma nota: ");
        nota3 = leitor.nextDouble();

        media = Calculadora.media(nota1, nota2, nota3);

        if (media >= 7){
            System.out.println("Aprovado");
            System.out.println("Nome: " + nome);
            System.out.println("Media: " + media);
        }
        else if (media <= 5) {
            System.out.println("Reprovado");
            System.out.println("Nome: " + nome);
            System.out.println("Media: " + media);
        }
        else {
            System.out.println("Recuperação");
            System.out.println("Nome: " + nome);
            System.out.println("Media: " + media);
        }

    }

}
