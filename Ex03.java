import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");

        valor = sc.nextInt();

        if(valor>0){

            System.out.println("O valor é positivo");

        } else if (valor == 0) {

            System.out.println("O valor é igual a zero");

        } else{

            System.out.println("O valor é negativo");

        }
    }

}

