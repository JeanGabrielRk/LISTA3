package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Verificacao;

public class Exercicio19 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int ladoA, ladoB, ladoC;
        String tipo;

        System.out.println("Digite o lado A: ");
        ladoA = leitor.nextInt();

        System.out.println("Digite o lado B: ");
        ladoB = leitor.nextInt();
        
        System.out.println("Digite o lado C: ");
        ladoC = leitor.nextInt();
       
        tipo = Verificacao.verTriangulo(ladoA, ladoB, ladoC);

        System.out.println("Tipo: " + tipo);
    }
}