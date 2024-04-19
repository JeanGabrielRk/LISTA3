package br.edu.up.modelos;

import java.util.Scanner;

public class Verificacao {

    public static int contarNumerosNoIntervalo(double[] numeros) {
        int numerosNoIntervalo = 0;
        for (double numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                numerosNoIntervalo++;
            }
        }
        return numerosNoIntervalo;
    }

    public static char lerSexo(Scanner leitor) {
        char sexo;
        do {
            System.out.println("Informe o sexo (F - M): ");
            sexo = Character.toUpperCase(leitor.next().charAt(0));
        } while (sexo != 'F' && sexo != 'M');
        return sexo;
    }
    
    public static boolean estaAptoServicoMilitar(String sexo, int idade, String saude) {
        return (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) &&
               idade >= 18 &&
               saude.equalsIgnoreCase("Apto");
    }

    public static String verTriangulo(int ladoA, int ladoB, int ladoC) {
        
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero"; 
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles"; 
        } else {
            return "Escaleno";
        }
    }
    
    public static String classifica(int idade) {
        
        if (idade >= 5 && idade <= 7) {
            return "Infantil A"; 
        } 
        else if (idade >= 8 && idade <= 10) {
            return "Infantil B"; 
        } 
        else if (idade >= 11 && idade <= 13) {
            return "Juvenil A"; 
        } 
        else if (idade >= 14 && idade <= 17) {
            return "Juvenil B"; 
        } 
        else if (idade >= 18 && idade <= 25) {
            return "Senior"; 
        } 
        else {
            return "Fora da faixa etária";
        }
    }

    public static String classificacaoEscolar(double notafinal){

        if (notafinal >= 8 && notafinal <= 10) {
            return "A";
        } else if (notafinal >= 7 && notafinal < 8) {
            return "B";
        } else if (notafinal >= 6 && notafinal < 7) {
            return "C";
        } else if (notafinal >= 5 && notafinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public static String determinarCategoriaSeguro(int idade, String grupoRisco) {
       
        if (idade < 17 || idade > 70) {
            return null;
        }

        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case "Baixo":
                return "Categoria 1";

                case "Médio":
                return "Categoria 2";

                case "Alto":
                return "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case "Baixo":
                return "Categoria 2";

                case "Médio":
                return "Categoria 3";

                case "Alto":
                return "Categoria 4";
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case "Baixo":
                return "Categoria 3";

                case "Médio":
                return "Categoria 4";

                case "Alto":
                return "Categoria 5";
            }
        } 
        else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {

                case "Baixo":
                return "Categoria 4";

                case "Médio":
                return "Categoria 5";

                case "Alto":
                return "Categoria 6";
            }
        } 
        else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {

                case "Baixo":
                return "Categoria 7";

                case "Médio":
                return "Categoria 8";

                case "Alto":
                return "Categoria 9";
            }
        }

        return null;
    }

}
