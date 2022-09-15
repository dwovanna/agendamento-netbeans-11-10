package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("Cardiologia cuida do coração");
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		JOptionPane.showMessageDialog(null, especialidade.getDescricao());
		
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
	
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Otorrinolaringologia Cuida da garganta");
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
		
		System.out.println(especialidade2.getNome());
		System.out.println(especialidade2.getDescricao());
		

	}

}
