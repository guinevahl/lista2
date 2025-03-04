import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int eleitores, votosValidos, votosBrancos, votosNulos;

        System.out.println("Digite a quantidade de votos válidos: ");

        votosValidos = in.nextInt();

        System.out.println("Digite a quantidade de votos brancos: ");

        votosBrancos = in.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");

        votosNulos = in.nextInt();

        eleitores = votosValidos + votosBrancos + votosNulos;

        float percentualVotosValidos = (votosValidos * 100) / eleitores;

        float percentualVotosBrancos = (votosBrancos * 100) / eleitores;

        float percentualVotosNulos = (votosNulos * 100) / eleitores;

        System.out.println("A quantidade de eleitores é de " + eleitores + ".");

        System.out.println("O percentual de votos válidos é de " + percentualVotosValidos + "%.");

        System.out.println("O percentual de votos brancos é de " + percentualVotosBrancos + "%.");

        System.out.println("O percentual de votos nulos é de " + percentualVotosNulos + "%.");
    }
}
