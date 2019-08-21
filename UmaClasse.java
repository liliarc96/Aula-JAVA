import java.util.Scanner;


public class UmaClasse {
	public static void main(String[] args) {
		int ano, idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		ano = leitor.nextInt();
		
		idade = 2019 - ano;
		System.out.println(idade);		
	}
}
