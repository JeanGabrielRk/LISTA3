package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Verificacao;

public class Exercicio21 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int idade;
        String classificacao;

        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();

        classificacao = Verificacao.classifica(idade);

        System.out.println("Classificação: " + classificacao);
    }
}