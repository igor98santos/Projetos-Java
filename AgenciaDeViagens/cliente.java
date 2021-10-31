package AgenciaDeViagens;


import java.util.Scanner;

public class cliente {

public static void main(String[] args) {
		AgenciaDeViagens cliente = new AgenciaDeViagens();
		Scanner ler = new Scanner(System.in);/*abri meu Scanner*/
		System.out.println("========= Seja muito bem vindo a nossa agencia de viagens =========");
		System.out.println("========= A agência gol.d roger fica muito feliz com a sua visita =========");
		int option = 0;
		do {
			System.out.println("Digite uma opção: "
					+ "\n 1 - cadastrar-se"
					+ "\n 2 - cadastrar destino"
					+ "\n 3 - Ver pacotes"
					+ "\n 4 - cosultar meu destino cadastrado"
					+ "\n 5 - cosultar meus dados cadastrados"
					+ "\n 6 - sair");
			 option = ler.nextInt();
			
			switch (option) { 
			case 1:
				cliente.cadastrar();
				break;
			case 2:
				cliente.destino();
				break;
			case 3:
				cliente.pacotes();
				break;
			case 4:
				cliente.DadosViagem();
				break;
			case 5:
				cliente.DadosCliente();
				break;
			case 6:
				cliente.sair();
				break;
			default:
				System.out.println("opção invalida");
			}
		}while(option != 6);
		
		
		
		ler.close(); /*fechei meu Scanner*/

	}

}
