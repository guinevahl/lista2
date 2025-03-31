import java.util.Scanner;

public class Ex13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int avaliação1, avaliação2, media;

        System.out.println("Digite a primeira avaliação: ");
        avaliação1 = in.nextInt();
        System.out.println("Digite a segunda avaliação: ");
        avaliação2 = in.nextInt();
        media = (avaliação1 + avaliação2) / 2;

        if(media < 6){
            System.out.println("A média final foi de " + media + ", então o aluno está reprovado.");
            } 
        else{
            System.out.println("A média final foi de " + media + ", então o aluno está aprovado.");
            }
    }
}