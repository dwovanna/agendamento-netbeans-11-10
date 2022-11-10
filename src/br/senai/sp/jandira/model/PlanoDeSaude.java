package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {
	
	private String operadora;
	private String categoria;
	private String numero;
        private Integer codigo;
	private LocalDate validade;
	private static int quantidade;
    private String descricao;
    private String nome;
	
	public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
		this.operadora = operadora;
                this.categoria = categoria;
                this.numero = numero;
                this.validade = validade;		
                gerarCodigo();
	}
	
	public PlanoDeSaude() {
		this.quantidade++;	
                gerarCodigo();
	}

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        gerarCodigo();
    }
	
	
	//Métodos de acessos aos atributos
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	
	public LocalDate getValidade(){
		return validade;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    private void gerarCodigo(){
        this.quantidade++;
        this.codigo = quantidade;
    }
    
     public String getPlanoDeSaudeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }
	
}