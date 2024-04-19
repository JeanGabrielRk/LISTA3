package br.edu.up.controles;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;

public class Exercicio18 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        double salariofunc, abono;
        String nome, sexo;
        int idade;

        System.out.println("Digite o nome do funcionario: ");
        nome = leitor.next();

        System.out.println("Informe o salario do funcionario: ");
        salariofunc = leitor.nextDouble();

        System.out.println("Informe o sexo: ");
        sexo = leitor.next();

        System.out.println("Informe a idade: ");
        idade = leitor.nextInt();
        
        abono = Calculadora.abono(sexo, idade, salariofunc);

        System.out.println("Funcionario: " + nome);
        System.out.println("Abono R$ " + abono);
        System.out.println("Salario com abono R$ " + (salariofunc + abono));
    }
}