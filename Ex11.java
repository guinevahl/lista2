import java.util.Scanner;

public class Ex11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2, soma;
        
        System.out.println("Digite o primeiro numero: ");
        numero1 = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = in.nextInt();
        soma = numero1 + numero2;

        if(soma > 20){ soma = soma + 8;
            System.out.println("A soma é maior que 20, então adicionamos 8: " + soma);
        } else{ soma = soma - 10;
            System.out.println("A soma é menor ou igual a 20, então subtraímos 10: " + soma);}
    }
}