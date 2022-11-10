package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador;
    private Integer codigo;
    private String nome;
    private String descricao;

    //construtor
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }

    public Especialidade() {
        gerarCodigo();
    }
    
    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    //Métodos de acessar aos atributos
    public int getContador() {
        return contador;
    }

    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido.\nDeve conter pelo menos 3 letras!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, "A descrição deve conter pelo menos 10 caracteres!", "Erro", JOptionPane.OK_OPTION);
        }
    }

    public String getDescricao() {
        return this.descricao;
    }
    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

}

