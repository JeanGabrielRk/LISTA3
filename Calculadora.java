public class Calculadora {
    
    public static double consumo(double distancia, double combustivel){
        return distancia / combustivel;
    }

    public static double comissao(double salario, double totalvendas){
        double porc = (15 * totalvendas) / 100;
        return salario + porc;
    }

    public static double conversao(double dolar, double cotacao){
        return dolar * cotacao;
    }

    public static double prestacao(double valor){
        return valor / 5;
    }

    public static double acrescimo(double custo, double ganho){
        double porc = (ganho * custo) / 100;
        return porc + custo;
    }

    public static double imposto(double custo){
        double porc1 = (45 * custo) / 100;
        double total = porc1 + custo;
        double porc2 = (28 * total) / 100;
        double totalfinal = total + porc2;
        return totalfinal;
    }

    public static double media(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;

        return media;
    }

    public static double maioridade(int idade){
        if (idade >= 18){
            System.out.println("Maior de idade");
            return idade;
        }
        else {
            System.out.println("Menor de idade");
            return idade;
        }
    }

    public static double desconto(double ano, double valor){

        if (ano < 2000){
            double porc = (12 * valor) / 100;
            double descontado = valor - porc;
            return descontado;
        }
        else {
            double porc = (7 * valor) / 100;
            double descontado = valor - porc;
            return descontado;
        }
    }
}
