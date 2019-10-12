package q1;

public class Teste {
public static void main(String[] args) {
	Pessoa novaP = new Pessoa();
	novaP.setNome("Ronaldo");
	novaP.setIdade(34);
	novaP.setAltura(1.87);
	novaP.setPeso(85);
	
	System.out.println("Nome: "+novaP.getNome()+"\nidade: "+novaP.getIdade()+"\naltura: "+novaP.getAltura()+"\npeso:"+novaP.getPeso());
	novaP.calcularImc();
	novaP.imprimir();
	
	
}
}
