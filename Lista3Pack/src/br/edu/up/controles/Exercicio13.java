package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Verificacao;

public class Exercicio13 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe quantas inserções: ");
        int n = leitor.nextInt();

        String[] nome = new String[n];
        String[] sexo = new String[n];
        int[] idade = new int[n];
        String[] saude = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = leitor.next();

            System.out.println("Digite o sexo: ");
            sexo[i] = leitor.next();

            System.out.println("Digite a idade: ");
            idade[i] = leitor.nextInt();

            System.out.println("Digite a saúde (Apto/Inapto): ");
            saude[i] = leitor.next();

            if (Verificacao.estaAptoServicoMilitar(sexo[i], idade[i], saude[i])) {
                System.out.println(nome[i] + " está apto para cumprir o serviço militar obrigatório.");
            } else {
                System.out.println(nome[i] + " não está apto para cumprir o serviço militar obrigatório.");
            }
        }

        leitor.close();
    }
}