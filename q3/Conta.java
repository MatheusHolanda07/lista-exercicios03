package q3;

public class Conta {
private int numero;
private String nome;
public double saldo;
public double valor;

public void Conta(String nome,int numero, double saldo){
	
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}


public boolean setSaca(double valor){
	if((valor) <= (this.getSaldo())){
		return true ;
	}else{
		return false;
	}
}
public double getSaca(double valor){
	return this.valor=valor;
}



public void deposita(double valor){
	
}

public boolean transfere(Conta destino, double valor){
	return true;
}

public void imprimeNome(){
	System.out.println("Nome: "+getNome()+"\nSaldo: "+(this.getSaldo()-this.getSaca(valor)));
}

















}
