package Desafio;
import java.util.Scanner; //importando a classe scanner pra registrar dados do usuário.
public class dona_monica {
	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			
			System.out.println("Qual a idade da mãe?"); // Pequeno loop que pede ao usuário a idade da mãe até que o valor registrado esteja de acordo com as restirções.
		    int M;
		    do {
		        System.out.println("A mãe deve ter entre 40 e 110 anos.");
		        M = in.nextInt();
		    } while(M < 40 || M > 110);
			
			
			System.out.println("Qual a idade do primeiro irmão?"); // Repetição do loop mas agora com as restrições do primeiro irmão.
		    int A;
		    do {
		        System.out.println("O primeiro irmão deve ter entre a 1 ano e um ano a menos que a mãe.");
		        A = in.nextInt();
		    } while(A < 1 || A >= M);
			
			System.out.println("Qual a idade do segundo irmão?."); // Repetição do loop mas agora com as restrições do segundo irmão.
			int B;
		    do {
		        System.out.println("O segundo irmão também deve ter entre 1 ano e um ano a menos que a idade da mãe, porém uma idade diferente do primeiro irmão.");
		        B = in.nextInt();
		    } while(B < 1 || B >= M || B == A );

			int C = M-A-B; // Solução do problema matemático.
			
			if (B > C) C = B; // Condicionais caso um dos filhos com idades implementadas pelo usuário seja o mais velho.
			if (A > C) C = A;			
			
			System.out.println(" O filho mais velho tem " + C + " anos."); // Print com o resultado.
		    }
		}
