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

    public static double mediapreco(double vlrcusto, double vlrvenda){
        double custodd = vlrcusto - vlrvenda;

        if (vlrcusto < vlrvenda){
            System.out.println("Prejuizo: ");
        }
        else if (vlrvenda > vlrcusto){
            System.out.println("Lucro: ");
        }
        else{
            System.out.println("Empate: ");
        }

        return custodd;
    }

    public static double descontocombustivel(int opcao, double valorcarro){
        double desconto;

        if (opcao == 1){
            desconto = (25 * valorcarro) / 100;
            return desconto;
        }
        else if (opcao == 2){
            desconto = (21 * valorcarro) / 100;
            return desconto;
        }
        else if (opcao == 3){
            desconto = (14 * valorcarro) / 100;
            return desconto;
        }
        else {
            return 0;
        }
    }

    public static double aumento(double salario){
        double aumento;

        if (salario < 3000){
            aumento = (50 * salario) / 100;
            return aumento;
        }
        else if (salario >= 3000 && salario < 10000){
            aumento = (20 * salario) / 100;
            return aumento;
        }
        else if (salario >= 10000 && salario < 20000){
            aumento = (15 * salario) / 100;
            return aumento;
        }
        else {
            aumento = (10 * salario) / 100;
            return aumento;
        }
    }

    public static double reajustesalarial(double salariofunc, double salariomin){
        double reajuste;

        reajuste = salariomin - salariofunc;
        return reajuste;
    }

    public static double abono(String sexo, int idade, double salariofunc){
        double abono = 0;

        if (sexo.equals("M")){
            if (idade >= 30){
                abono = 100;
            }
            else {
                abono = 50;
            }
        }
        else if (sexo.equals("F")){
            if (idade >= 30){
                abono = 200;
            }
            else {
                abono = 80;
            }
        }
        return abono;
    }

    public static double horaaula(int nivel, double horas){
        double valor;

        if (nivel == 1){
            valor = horas * 12;
        }
        else if (nivel == 2){
            valor = horas * 17;
        }
        else {
            valor = horas * 25;
        }

        return valor;
    }

    public static double valorluz(int tipo, double kwh){
        double total;

        if (tipo == 1){
            total = kwh * 0.60;
        }
        else if (tipo == 2){
            total = kwh * 0.48;
        }
        else if (tipo == 3){
            total = kwh * 1.29;
        }
        else {
            return 0;
        }
        return total;
    }
    
}
