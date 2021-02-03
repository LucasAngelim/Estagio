package Desafio;
import java.util.Scanner; //importando a classe scanner pra registrar dados do usu�rio.
public class dona_monica {
	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			
			System.out.println("Qual a idade da m�e?"); // Pequeno loop que pede ao usu�rio a idade da m�e at� que o valor registrado esteja de acordo com as restir��es.
		    int M;
		    do {
		        System.out.println("A m�e deve ter entre 40 e 110 anos.");
		        M = in.nextInt();
		    } while(M < 40 || M > 110);
			
			
			System.out.println("Qual a idade do primeiro irm�o?"); // Repeti��o do loop mas agora com as restri��es do primeiro irm�o.
		    int A;
		    do {
		        System.out.println("O primeiro irm�o deve ter entre a 1 ano e um ano a menos que a m�e.");
		        A = in.nextInt();
		    } while(A < 1 || A >= M);
			
			System.out.println("Qual a idade do segundo irm�o?."); // Repeti��o do loop mas agora com as restri��es do segundo irm�o.
			int B;
		    do {
		        System.out.println("O segundo irm�o tamb�m deve ter entre 1 ano e um ano a menos que a idade da m�e, por�m uma idade diferente do primeiro irm�o.");
		        B = in.nextInt();
		    } while(B < 1 || B >= M || B == A );

			int C = M-A-B; // Solu��o do problema matem�tico.
			
			if (B > C) C = B; // Condicionais caso um dos filhos com idades implementadas pelo usu�rio seja o mais velho.
			if (A > C) C = A;			
			
			System.out.println(" O filho mais velho tem " + C + " anos."); // Print com o resultado.
		    }
		}
