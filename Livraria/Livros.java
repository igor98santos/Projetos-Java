package Livraria;

import java.util.Scanner;

public class Livros {
	Scanner ler = new Scanner(System.in);
	int qtd;
	double[] criterio;
	String nome;
	
	void Comprar() {
		System.out.println("Informe seu nome: ");
		String nome = ler.nextLine();
		setNome(nome);
		
		System.out.println("digite a quantidade de livros");
		int qtdl = ler.nextInt();
		setQtd(qtdl);
		
		System.out.println("os criterios da nossa livraria s�o: \n Crit�rio A: (0,25*"+getQtd()+") + 7,50; \n Crit�rio B: (0,50* "+getQtd()+") + 2,50;\n Crit�rio c: (0,65* "+getQtd()+") + 1,50;");
		Double criterioA =(0.25 * getQtd())+7.50;
		Double criterioB =(0.50 * getQtd())+2.50;
		Double criterioC =(0.65 * getQtd())+1.50; 
		if(criterioA == criterioB) {
			System.out.println("o criterio c � a melhor op��o: "+criterioC);
		}else if(criterioA == criterioC){
			System.out.println("o criterio b � a melhor op��o: "+criterioB);
		}else if(criterioB == criterioC){
			System.out.println("O CRITERIO A � a melhor op��o: "+criterioA);
		}else if(criterioA > criterioB && criterioA > criterioC) {
			System.out.println("O CRITERIO A � a melhor op��o: "+criterioA);
		}else if(criterioB > criterioC && criterioB > criterioA){
			System.out.println("O CRITERIO B � a melhor op��o: "+criterioB);
		}else if(criterioC > criterioA && criterioC > criterioB) {
			System.out.println("O CRITERIO C � a melhor op��o: "+criterioC);
		}
		
	}
		
	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double[] getCriterio() {
		return criterio;
	}
	public void setCriterio(double[] criterio) {
		this.criterio = criterio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
