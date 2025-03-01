import java.util.Scanner;

public class Ex06 {
public static void main (String[] args){

    Scanner in = new Scanner(System.in);

    int anos, meses, dias;

    System.out.println("Digite a quantidade de anos que você tem: ");

    anos = in.nextInt();

    System.out.println("Digite a quantidade de meses que você tem: ");

    meses = in.nextInt();

    System.out.println("Digite a quantidade de dias que você tem: ");

    dias = in.nextInt();

    int idadeDias = (anos * 365) + (meses * 30) + dias;

    System.out.println("Você tem "+ idadeDias + " dias de vida.");
}

}
