import java.util.Scanner;

public class Ex14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoAtual, anoNascimento;

        System.out.println("Digite o ano atual: ");
        anoAtual = in.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = in.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade < 16){
            System.out.println("Você não é obrigado a votar.");
        }else if(idade >= 16 && idade < 18){
            System.out.println("Você pode votar, mas não é obrigatório.");
        }else{ 
            System.out.println("Você é obrigado a votar.");
        }
    }
}