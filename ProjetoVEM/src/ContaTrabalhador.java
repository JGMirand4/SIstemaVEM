import java.util.Scanner;

public class ContaTrabalhador extends Conta{
private double vale; 
	
	Scanner input = new Scanner(System.in);
	
	ContaTrabalhador() {
		System.out.println("Sua conta � do tipo Trabalhador.\nPreencha os dados para prosseguir.");
		System.out.println("**************");
		System.out.print("Quanto � seu vale transporte: ");
		setVale(input.nextDouble());
		input.nextLine();
		System.out.print("Digite seu nome: ");
		setNome(input.nextLine());
		System.out.print("Digite sua idade: ");
		setIdade(input.nextInt());
		System.out.println("Digite seu cpf: ");
		setCpf(input.next());
		
		System.out.println("**************");
		System.out.println("Seja bem vindo " + getNome());
		int x = 0;
		while(x==0) {
		System.out.println("Qual tipo de servi�o voc� dejesa utilizar?\n [1]Comprar passagens [2]Ver saldo da conta [3]Recarregar o cart�o [4]Sair da central");
		int servico = input.nextInt();
			if(servico == 1) {
				Pagamento();
			} else if (servico == 2) {
				System.out.println("Seu saldo dispon�vel �: " + getVale());
			} else if (servico == 3) {
				System.out.println("Digite o valor que voc� deseja recarregar o VEM: ");
				Deposita(input.nextDouble());
			} else if (servico == 4){
				x++;
				System.out.println("Obrigado, o VEM agradece!!");
			}else {
				System.err.println("Comando invalido");
				
			}
		}
			
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	public void Pagamento() {
		if (saldo >= 4.10) {
			System.out.println("Voc� comprou uma passagem!");
			saldo -= 4.10;
		}else {
			System.err.println("Voc� n�o tem saldo suficiente para comprar uma passagem. Recarregue seu VEM imediatemente!");
		}
	}
	public double getVale() {
		return saldo;
	}

	public void setVale(double vale) {
		this.vale = vale;
	}
}

