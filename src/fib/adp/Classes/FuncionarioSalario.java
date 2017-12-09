package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioSalario implements IFuncionarioCalc { //funcionario salario 

	public FuncionarioSalario (String nome, Double salario, ECargos cargo) { //passo o nome, salario e o cargo dele
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public Double salario;
	public ECargos cargo;
	public String nome;

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public double receberPgto() { //efetuo a logica do calculo de funcionario assalariado verificar o cargo dele
		return 0;
	}

	@Override
	public String dadosFuncionario() {
		return "Nome: " + getNome() + " - Cargo " + cargo.name() + " "; //retorno o nome cargo
	}

}
