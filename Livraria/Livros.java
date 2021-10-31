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
		
		System.out.println("os criterios da nossa livraria são: \n Critério A: (0,25*"+getQtd()+") + 7,50; \n Critério B: (0,50* "+getQtd()+") + 2,50;\n Critério c: (0,65* "+getQtd()+") + 1,50;");
		Double criterioA =(0.25 * getQtd())+7.50;
		Double criterioB =(0.50 * getQtd())+2.50;
		Double criterioC =(0.65 * getQtd())+1.50; 
		if(criterioA == criterioB) {
			System.out.println("o criterio c é a melhor opção: "+criterioC);
		}else if(criterioA == criterioC){
			System.out.println("o criterio b é a melhor opção: "+criterioB);
		}else if(criterioB == criterioC){
			System.out.println("O CRITERIO A é a melhor opção: "+criterioA);
		}else if(criterioA > criterioB && criterioA > criterioC) {
			System.out.println("O CRITERIO A é a melhor opção: "+criterioA);
		}else if(criterioB > criterioC && criterioB > criterioA){
			System.out.println("O CRITERIO B é a melhor opção: "+criterioB);
		}else if(criterioC > criterioA && criterioC > criterioB) {
			System.out.println("O CRITERIO C é a melhor opção: "+criterioC);
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
