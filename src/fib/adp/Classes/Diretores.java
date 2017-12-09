package fib.adp.Classes;

import java.util.ArrayList;
import java.util.List;

import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class Diretores implements IFuncionarioCalc {
	
	private String nome;
	private Double salario;
	private Double comissao;
	private ECargos cargo;
	
	private List<IFuncionarioCalc> funcionarios;
	
	public Diretores(String nome, Double salario, Double comissao, ECargos cargo) {
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;	
		this.cargo = cargo;
		this.funcionarios = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void incluirFuncionario(IFuncionarioCalc func)
    {
		funcionarios.add(func);
    }

    public void removerFuncionario(IFuncionarioCalc func)
    {
        if (funcionarios.contains(func))
        	funcionarios.remove(func);
    }

    public List<IFuncionarioCalc> getFuncionarios()
    {
        return funcionarios;
    }
    
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public void setFuncionarios(List<IFuncionarioCalc> funcionarios) {
		this.funcionarios = funcionarios;
	}
	

	public ECargos getCargo() {
		return cargo;
	}

	public void setCargo(ECargos cargo) {
		this.cargo = cargo;
	}

	@Override
	public double receberPgto() { //retorna o total do salario
		return 0;
	}
	
	@Override
	public String dadosFuncionario() { //retorna o nome da empresa
		return " Nome: " + getNome() + " - Cargo: " + getCargo() + " ";
	}

}
