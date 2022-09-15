package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	

    private String nome;
	private String descricao;
	
	//Métodos de acesso aos atributos
	public void setNome(String nome) {
		
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\n deve conter pelo menos 3 letras!");
		
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String Descricao) {
		if (Descricao.length() >= 10) {
			this.descricao = Descricao;
		} else {
			JOptionPane.showMessageDialog(null, "A descricao deve conter pelo menos 10 caracteres.");
		}
	}
	 
	public String getDescricao() {
		return descricao;
	}

}
