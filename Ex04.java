import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
    
     int valor1, valor2;

        System.out.println("Digite o primeiro valor: ");

        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");

        valor2 = sc.nextInt();

        if(valor1 > valor2){

            System.out.println("O primeiro valor é maior que o segundo.");

        } else if (valor1 == valor2) {

            System.out.println("Os valores são iguais.");

        } else{

            System.out.println("O segundo valor é maior que o primeiro.");

        }
    }
}
