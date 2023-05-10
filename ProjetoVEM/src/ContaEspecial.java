import java.util.Scanner;

public class ContaEspecial extends Conta {
	
	Scanner input = new Scanner(System.in);
	
	ContaEspecial() {
		System.out.println("**************");
		System.out.println("Sua conta é do tipo Especial.\nPreencha os dados para prosseguir.");
		
		System.out.println("**************");
		System.out.print("Digite seu nome: ");
		setNome(input.nextLine());
		System.out.print("Digite sua idade: ");
		setIdade(input.nextInt());
		System.out.println("Digite seu cpf: ");
		setCpf(input.next());
		
		System.out.println("**************");
		System.out.println("Boa viagem " + getNome() + "! Com o VEM especial você tem passe livre para metrô e onibus de todo Recife!");
	}
	
}