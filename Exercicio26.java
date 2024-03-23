import java.util.Scanner;

public class Exercicio26 {

    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade:");
        int idade = leitor.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio, Alto):");
        String grupoRisco = leitor.next();

        String categoriaSeguro = Verificacao.determinarCategoriaSeguro(idade, grupoRisco);

        if (categoriaSeguro != null) {
            System.out.println("Nome do segurado: " + nome);
            System.out.println("Idade do segurado: " + idade);
            System.out.println("Grupo de risco: " + grupoRisco);
            System.out.println("Categoria de seguro: " + categoriaSeguro);
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }
    }

}
