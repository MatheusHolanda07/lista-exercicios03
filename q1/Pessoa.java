package q1;

public class Pessoa {
private String nome;
private int idade;
private double altura;
private double peso;

public void setNome(String nome){
	this.nome = nome;
}

public String getNome(){
	return this.nome;
}


public void setIdade(int idade){
	this.idade = idade;
}

public int getIdade(){
	return this.idade;
}


public void setAltura(double altura){
	this.altura = altura;
}

public double getAltura(){
	return this.altura;
}


public void setPeso(double peso){
	this.peso = peso;
}

public double getPeso(){
	return this.peso;
}

public double calcularImc(){
	return (this.peso/(this.altura*this.altura));
	
	
}

public void imprimir(){
	System.out.println("Nome: "+getNome());
	System.out.println("\nPeso: "+getPeso());
	System.out.println("\nAltura: "+getAltura());
	System.out.println("\nIdade: "+getIdade());
	System.out.println("\nIMC: "+calcularImc());
	
}


}
