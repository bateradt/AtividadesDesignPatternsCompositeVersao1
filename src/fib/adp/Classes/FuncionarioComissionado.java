package fib.adp.Classes;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class FuncionarioComissionado implements IFuncionarioCalc { //crio o funcionario do tipo comissionado

	public FuncionarioComissionado(String nome, Double salario, Double comissao, Double valorTotalVendas,
			ECargos cargo) { //passo o nome, salario, comissao, total das vendas e o cargo do funcionario comissionado
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		this.valorTotalVendas = valorTotalVendas;
		this.cargo = cargo;
	}

	public Double salario;
	public Double comissao;
	public Double valorTotalVendas;
	public ECargos cargo;
	public String nome;

	public Double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(Double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public double receberPgto() { //efetuo a lógica do cálculo de um funcionário comissionado
		return 0;
	}
	
	@Override
	public String dadosFuncionario() { //retorno os dados do funcionario nome e cargo
		return "Nome: " + getNome() + " - Cargo " + cargo.name() + " ";
	}

}
