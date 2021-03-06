package application;

import classes.Administrador;
import classes.Fornecedor;
import classes.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Fornecedor f1 = new Fornecedor("Francisco Fornecedor", "Rua da areia", "(83)1111-1111", 1100, 1000);
		System.out.println("Nome do Fornecedor: " + f1.getNome() + " \nEndere�o: " + f1.getEndereco() + ", Telefone: "
				+ f1.getTelefone() + ", Cr�dito: " + f1.getValorCredito() + ", D�vida: " + f1.getValorDivida()
				+ ", Saldo: " + f1.obterSaldo());

		Administrador adm1 = new Administrador("Francisco ADM", "Rua da areia", "(83)2222-2222", 3000.00, 3000.00);
		System.out.println("\nNome do Administrador: " + adm1.getNome() + " \nEndere�o: " + adm1.getEndereco()
				+ ", Telefone " + adm1.getTelefone() + ", Ajuda de Custo " + adm1.getAjudaCusto() + " \nSalario "
				+ adm1.calcularSalarioAdm());

		Vendedor v1 = new Vendedor("Francisco Vendedor", "Rua da areia", "(83)3333-3333", 1000.00, 1000, 0.1);
		System.out.println("\nNome do Vendedor: " + v1.getNome() + " \nEndere�o: " + v1.getEndereco() + ", Telefone: "
				+ v1.getTelefone() + ", Valor em venda: " + v1.getValorVendas() + ", Comiss�o " + v1.getComissao()
				+ ", \nSalario " + v1.calcularSalarioVend());

	}

}
