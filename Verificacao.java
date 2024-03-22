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

}
