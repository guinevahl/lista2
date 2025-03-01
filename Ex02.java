import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura, base, area;

        System.out.println("Digite a altura do retângulo: ");

        altura = sc.nextInt();

        System.out.println("Digite a base do retângulo: ");

        base = sc.nextInt();

        area = altura * base;

        System.out.println("A área do retângulo é: " + area + "cm²");
    }
}
