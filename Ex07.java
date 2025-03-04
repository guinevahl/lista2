import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int salarioPorHora, horasTrabalhadas, salarioMensal, salarioAtual, salarioLiquido, taxaDesconto;

        System.out.println("Digite o valor do seu salário por hora: ");

        salarioPorHora = in.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");

        horasTrabalhadas = in.nextInt();

        System.out.println("Digite a taxa de desconto, em porcentagem: ");

        taxaDesconto = in.nextInt();

        salarioAtual = salarioPorHora * horasTrabalhadas;

        salarioMensal = salarioPorHora*176;

        salarioLiquido = salarioMensal - (salarioMensal * taxaDesconto / 100);

        System.out.println("Seu salário mensal é de R$"+ salarioMensal +".");

        System.out.println("Seu salário líquido é de R$"+ salarioLiquido +".");

        System.out.println("A diferença do seu salário líquido para o bruto é de R$"+ (salarioMensal-salarioLiquido) +".");

        System.out.println("Seu salário Atual é de R$"+ salarioAtual +".");

    }
}
