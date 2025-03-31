import java.util.Scanner;

public class Ex15{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int angulo1, angulo2, angulo3;

        System.out.println("Digite o primeiro ângulo: ");
        angulo1 = in.nextInt();
        System.out.println("Digite o segundo ângulo: ");
        angulo2 = in.nextInt();
        System.out.println("Digite o terceiro ângulo: ");
        angulo3 = in.nextInt();

        if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
            System.out.println("O triângulo é retângulo.");
        } else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
            System.out.println("O triângulo é obtuso.");
        } else{
            System.out.println("O triângulo é acutângulo.");
        }
    }
}