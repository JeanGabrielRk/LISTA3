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

}
