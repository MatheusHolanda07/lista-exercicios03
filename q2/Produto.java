package q2;

public class Produto {
private String nome;
private double precoCusto;
private double precoVenda;
private double margemLucro;


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public double getPrecoCusto() {
	return precoCusto;
}
public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}


public double getPrecoVenda() {
	return precoVenda;
}
public void setPrecoVenda(double precoVenda) {
	if((this.precoVenda = precoVenda)<this.precoCusto){
		System.out.println("Preço da venda inferior ao da compra!!!");
	}
}


public double getMargemLucro() {
	return margemLucro;
}
public void setMargemLucro(double margemLucro) {
	this.margemLucro = margemLucro;
}

public double calcularMargemLucro(){
	return (getPrecoVenda()-getPrecoCusto());
}


public double getMargemLucroPorcenagem(){
	return ((calcularMargemLucro()/getPrecoCusto())*100);
}

public void imprimir(){
	System.out.println("Nome: "+getNome());
	System.out.println("Custo: "+getPrecoCusto());
	System.out.println("Venda: "+getPrecoVenda());
	System.out.println("Margem de lucro: "+calcularMargemLucro()+"$");
	System.out.println("Lucro porcentagem: "+getMargemLucroPorcenagem()+"%");

}



}
