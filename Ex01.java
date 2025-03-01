import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int metros, centimetros;

        System.out.println("Digite o valor em metros: ");

        metros = sc.nextInt();

        centimetros = metros * 100;

        System.out.println("O valor em centimetros é: " + centimetros + "cm");
    }
}