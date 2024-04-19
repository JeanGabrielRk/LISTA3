package br.edu.up.controles;

import java.util.Scanner;
import br.edu.up.modelos.Aluno;

public class Exercicio01 {

    public static void executar(){

    Scanner leitor = new Scanner(System.in);

    double nota1, nota2, nota3;
    String nome;
    
    System.out.println("Digite o nome: ");
    nome = leitor.next();

    System.out.println("Digite uma nota: ");
    nota1 = leitor.nextDouble();

    System.out.println("Digite uma nota: ");
    nota2 = leitor.nextDouble();

    System.out.println("Digite uma nota: ");
    nota3 = leitor.nextDouble();

    Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

    double media = aluno.calcularMedia();

    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Media: " + media);

    }

}
