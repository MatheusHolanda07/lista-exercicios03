package q3;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Conta conta1 = new Conta();
	
	System.out.println("seu nome...");
	String nome = sc.nextLine();
	conta1.setNome(nome);
	
	System.out.println("seu numero...");
	int num = sc.nextInt();
	conta1.setNumero(num);
	
	System.out.println("seu saldo...");
	double saldo = sc.nextDouble();
	conta1.setSaldo(saldo);
	
	System.out.println("valor p/sacar:");
	double saque = sc.nextDouble();
	conta1.setSaca(saque);
	
	
	conta1.imprimeNome();
}
}
