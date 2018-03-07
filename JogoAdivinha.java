import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		
		//Calcular um número random;
		//Pedir ao utilizador para inserir números até ele acertar ou perder todas as vidas;
		
		System.out.println("JOGO DA ADIVINHA\n\n");
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(100);
		int numeroUtilizador;
		int numeroVidas = 4;
		
		System.out.println("Batota: "+numeroAleatorio);
		
		do {
			System.out.println("Insira a sua tentativa, ainda tem "+numeroVidas+" vidas");
			numeroUtilizador = scanner.nextInt();
			numeroVidas--;
			
		// dar uma dica - número maior ou menor;
			
			if (numeroUtilizador<numeroAleatorio) {
				System.out.println("O número é maior...");
			}else if (numeroUtilizador>numeroAleatorio) {
				System.out.println("O número é menor...");
			}else {
				System.out.println("BINGO!!!");
			}
			
		}while(numeroAleatorio != numeroUtilizador && numeroVidas>0);
		
		if (numeroAleatorio == numeroUtilizador) {
			System.out.println("Ganhou o jogo!!!");
		}else {
			System.out.println("Perdeu o jogo...");
		}	
	}
}
