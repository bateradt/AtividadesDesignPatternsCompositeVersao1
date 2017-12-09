package fib.adp.Teste;

import fib.adp.Classes.Diretores;
import fib.adp.Classes.FuncionarioComissionado;
import fib.adp.Classes.FuncionarioSalario;
import fib.adp.Enum.ECargos;
import fib.adp.Interface.IFuncionarioCalc;

public class TesteParte1 {
	
	public static void main(String[] args) {
		//crio a hierarquia dos funcionarios da empresa
		Diretores presidente = new Diretores("Bill", 15000.00, 0.0, ECargos.PRESIDENTE); 
		
		Diretores diretorComercial = new Diretores("Ted", 5500.00, 20.00, ECargos.DIRETORCOMERCIAL);
		
		Diretores diretorProducao = new Diretores("Bob", 4000.00, 0.0, ECargos.DIRETORPRODUCAO);
		
		IFuncionarioCalc vendedor = new FuncionarioComissionado("Mike", 3000.00, 8.00, 16400.00, ECargos.VENDEDOR);
		
		IFuncionarioCalc vendedor2 = new FuncionarioComissionado("Will", 2500.00, 10.00, 8900.00, ECargos.VENDEDOR);
		
		IFuncionarioCalc desenvolvedor1 = new FuncionarioSalario("On", 1500.00, ECargos.DESENVOLVEDOR);
		IFuncionarioCalc desenvolvedor2 = new FuncionarioSalario("Max", 2500.00, ECargos.DESENVOLVEDOR);
		IFuncionarioCalc desenvolvedor3 = new FuncionarioSalario("Snow", 2000.00, ECargos.DESENVOLVEDOR);
		
		//incluo os funcionarios na hierarquia proposta
		diretorComercial.incluirFuncionario(vendedor);
		diretorComercial.incluirFuncionario(vendedor2);
		
		diretorProducao.incluirFuncionario(desenvolvedor1);
		diretorProducao.incluirFuncionario(desenvolvedor2);
		diretorProducao.incluirFuncionario(desenvolvedor3);
		
		presidente.incluirFuncionario(diretorComercial);
		presidente.incluirFuncionario(diretorProducao);
		
		//mostro a hierarquia dos funcionarios em árvore
		System.out.println(presidente.dadosFuncionario());
		for (IFuncionarioCalc diretores : presidente.getFuncionarios()) {    	
            System.out.println("\t" + diretores.dadosFuncionario() ); //mostro o nome, cargo do funcionario do nó primário da árvore
                        
            if (diretores instanceof Diretores) { //irá listar a hierarquias dos funcionarios na árvore
                for (IFuncionarioCalc func : ((Diretores)diretores).getFuncionarios())
                    System.out.println("\t\t" + func.dadosFuncionario());
            }
        }
		
	}
}
