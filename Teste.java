package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto objProduto = new Produto(JOptionPane.showInputDialog("Dite o tipo de produto"),
				JOptionPane.showInputDialog("Digite a marca"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
		
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("digite o nome do cliente"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a renda media do cliente")),
				objProduto);
		
		System.out.print("Nome: " + objCliente.getNome()+
				"\nTipo de produto: " + objCliente.getProduto().getTipo()+
				"\nIdade: " + objCliente.getIdade() +
				"\nRenda media: " + objCliente.getRendaMedia()+
				"\nMarca: " + objCliente.getProduto().getMarca()+
				"\nQuantidade: " + objCliente.getProduto().getQuantidade() +
				"\nvalor: " + objCliente.getProduto().getValor());
		
		
		
		
		

	}
