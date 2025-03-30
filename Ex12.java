import java.util.Scanner;

public class Ex12{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        float maças;

        System.out.print("Quantas maças você comprou? ");
        maças = in.nextFloat();

        if(maças < 12){ maças = maças *1.5f;
            System.out.printf("O preço total é R$"+maças);
        } else{ maças = maças *1.3f;
            System.out.printf("O preço total é R$"+maças);}
 
    }
}