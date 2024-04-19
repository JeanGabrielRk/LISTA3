package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;
import br.edu.up.modelos.Verificacao;

public class Exercicio25 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, notafinal, matricula;
        String classifica, nome;

        System.out.println("Digite o nome: ");
        nome = leitor.next();

        System.out.println("Digite a matricula: ");
        matricula = leitor.nextDouble();

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        notafinal = Calculadora.mediaEscolar(nota1, nota2, nota3);
        classifica = Verificacao.classificacaoEscolar(notafinal);

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Resultado final: " + notafinal);
        System.out.println("Classificação: " + classifica);
    }
}