package AgenciaDeViagens;

import java.util.Scanner;

public class AgenciaDeViagens {
	Scanner ler = new Scanner(System.in);
	int assento;
	int dia;
	int més;
	int ano;
	String destino;
	String nome;
	int cpf;
	String Email;
	
	  public void DadosViagem() {
			  System.out.println("seu assento é o "+ getAssento()+", seu dia de viagem é "+getDia()+", o més de viagem é"+getMés()+", e o ano da sua viagem é"+getAno());
			 	  
	  }
	  
		public void DadosCliente() {
			  System.out.println("nome cadastrado "+getNome()+", seu cpf é "+getCpf()+", seu email é "+getEmail());
			
	  }
	  public void destino(){/*aonde vou efetuar o cadastro do destino (inicio)*/
			System.out.println("Digite seu destino de viagem:");
			String destino = ler.nextLine();
			setDestino(destino);
			
			System.out.println("Digite o numero de assento desejado:");
			int acento = ler.nextInt();
			setAssento(acento);
			
			System.out.println("Digite o dia ");
			int d = ler.nextInt();
			setDia(d);
			System.out.println("digite o més");
			int m = ler.nextInt();
			setMés(m);
			System.out.println("digite o ano");
			int ano = ler.nextInt();
			setAno(ano);
			
			System.out.println("Seu cadastro de viaje foi concluido com sucesso no acento" +getAssento()+", para o dia "+getDia()+", no més "+getMés()+", e o ano de "+getAno()+", uma boa viaje.");
			
			}/*fim*/
			
			/*metodo usado para sair do app*/
		   public void sair() {
				System.out.println("obrigado por acessar a nossa plataforma, saindo....");
			}/*fim*/
			
		   public void pacotes() { /*com o metodo pacotes vou mostrar alguns pacotes de viagem disponiveis (inicio)*/
				System.out.println("pacote viagem para disney 10% off, em até 24x no cartão");
				System.out.println("pacote viagem para africa 16% off, em até 18x no cartão");
				System.out.println("pacote viagem para stambu 20% off, em até 24x no cartão");
				System.out.println("pacote viagem para lua 6% off, em até 10x no cartão");
			} /*fim*/
			
			
			public void cadastrar() { /* esse é metodo usado para cadastrar o cliente (inicio)*/
				System.out.println("digite o email do cliente:");
				String email = ler.nextLine();
				setEmail(email);
				
				System.out.println("digite o nome do cliente:");
				String nome = ler.nextLine();
				setNome(nome);
				
				System.out.println("digite o cpf do cliente:");
				int cpf = ler.nextInt();
				setCpf(cpf);
				
				System.out.println("o cliente "+getNome()+", com o cpf "+getCpf()+", e o seu email "+getEmail()+", foi cadastrado com sucesso");
				
			}	/* (fim)*/
		
			public void con(int acento, String agenda, String destino,	String nome, String cpf , String Email) {
				
			}


			/*daqui para baixo sera meus getters e setters */
			
			public Scanner getLer() {
				return ler;
			}

			public void setLer(Scanner ler) {
				this.ler = ler;
			}

			public int getAssento() {
				return assento;
			}

			public void setAssento(int assento) {
				this.assento = assento;
			}

			public int getDia() {
				return dia;
			}

			public void setDia(int dia) {
				this.dia = dia;
			}

			public int getMés() {
				return més;
			}

			public void setMés(int més) {
				this.més = més;
			}

			public int getAno() {
				return ano;
			}

			public void setAno(int ano) {
				this.ano = ano;
			}

			public String getDestino() {
				return destino;
			}

			public void setDestino(String destino) {
				this.destino = destino;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getCpf() {
				return cpf;
			}

			public void setCpf(int cpf) {
				this.cpf = cpf;
			}

			public String getEmail() {
				return Email;
			}

			public void setEmail(String email) {
				Email = email;
			}
		
}

