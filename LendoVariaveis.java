import java.util.Scanner;


public class LendoVariaveis {
	public static void main(String[] args) {
		//Variavel nome (string)
		String nome = "Lília Ribeiro Cantalice";
		//Variavel idade (int)
		int idade = 23;
		System.out.println(nome + "," + idade);
		
		//Ler todo input do sistema
		Scanner leitor = new Scanner(System.in);
		//Output na tela
		System.out.println("Informe seu nome:");
		//Variavel nome recebe o input do usuário
		nome = leitor.nextLine();
		System.out.println(nome);
		
		System.out.println("Informe sua idade:");
		idade = leitor.nextInt();
		System.out.println(idade);
		
		System.out.println(nome + "," + idade);
	}
}
