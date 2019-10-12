package q4;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		
		ArrayList<Funcionario> administrativo = new ArrayList();
		ArrayList<Funcionario> empressarial = new ArrayList();
		ArrayList<Funcionario> executivo = new ArrayList();
		ArrayList<Funcionario> todoFuncionarios = new ArrayList();
		
		Funcionario f1 = new Funcionario("Jose", "123", TipoFuncionario.EXECUTIVO);	
		executivo.add(0, f1);
		todoFuncionarios.add(0, f1);
		Funcionario f2 = new Funcionario("Martinez", "456", TipoFuncionario.EMPRESSARIAL);
		empressarial.add(0, f2);
		todoFuncionarios.add(1, f2);
		Funcionario f3 = new Funcionario("Valleria", "789", TipoFuncionario.ADIMINISTRATIVO);
		administrativo.add(0, f3);
		todoFuncionarios.add(2, f3);
		
	}
}
