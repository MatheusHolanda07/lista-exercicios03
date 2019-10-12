package q2;

import java.util.Scanner;
public class Teste {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Produto nProduto = new Produto();
	
	System.out.println("Nome do produto");
	String nome = sc.nextLine();
	nProduto.setNome(nome);
	
	System.out.println("Preço do Custo: ");
	double custo = sc.nextDouble();
	nProduto.setPrecoCusto(custo);
	
	System.out.println("Preço da venda: ");
	double venda = sc.nextDouble();
	nProduto.setPrecoVenda(venda);
	
	nProduto.imprimir();
	
	
	
	
}	

	
}
