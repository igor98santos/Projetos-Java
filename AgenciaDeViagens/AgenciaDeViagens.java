package AgenciaDeViagens;

import java.util.Scanner;

public class AgenciaDeViagens {
	Scanner ler = new Scanner(System.in);
	int assento;
	int dia;
	int m�s;
	int ano;
	String destino;
	String nome;
	int cpf;
	String Email;
	
	  public void DadosViagem() {
			  System.out.println("seu assento � o "+ getAssento()+", seu dia de viagem � "+getDia()+", o m�s de viagem �"+getM�s()+", e o ano da sua viagem �"+getAno());
			 	  
	  }
	  
		public void DadosCliente() {
			  System.out.println("nome cadastrado "+getNome()+", seu cpf � "+getCpf()+", seu email � "+getEmail());
			
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
			System.out.println("digite o m�s");
			int m = ler.nextInt();
			setM�s(m);
			System.out.println("digite o ano");
			int ano = ler.nextInt();
			setAno(ano);
			
			System.out.println("Seu cadastro de viaje foi concluido com sucesso no acento" +getAssento()+", para o dia "+getDia()+", no m�s "+getM�s()+", e o ano de "+getAno()+", uma boa viaje.");
			
			}/*fim*/
			
			/*metodo usado para sair do app*/
		   public void sair() {
				System.out.println("obrigado por acessar a nossa plataforma, saindo....");
			}/*fim*/
			
		   public void pacotes() { /*com o metodo pacotes vou mostrar alguns pacotes de viagem disponiveis (inicio)*/
				System.out.println("pacote viagem para disney 10% off, em at� 24x no cart�o");
				System.out.println("pacote viagem para africa 16% off, em at� 18x no cart�o");
				System.out.println("pacote viagem para stambu 20% off, em at� 24x no cart�o");
				System.out.println("pacote viagem para lua 6% off, em at� 10x no cart�o");
			} /*fim*/
			
			
			public void cadastrar() { /* esse � metodo usado para cadastrar o cliente (inicio)*/
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

			public int getM�s() {
				return m�s;
			}

			public void setM�s(int m�s) {
				this.m�s = m�s;
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

