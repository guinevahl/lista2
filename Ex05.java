import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float numerador, denominador;

        float resultado;

        System.out.println("Digite o numerador: ");

        numerador = sc.nextFloat();

        System.out.println("Digite o denominador: ");

        denominador = sc.nextFloat();
        
        resultado = numerador/denominador;

        if(denominador == 0){

            System.out.println("ERRO: Não é possível dividir por zero.");

        }else{

            System.out.println("A divisão é igual a "+ resultado);

        }
    }
}
