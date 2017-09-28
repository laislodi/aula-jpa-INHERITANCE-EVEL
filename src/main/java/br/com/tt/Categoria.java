package br.com.tt;

import java.util.List;

public class Categoria {

	private String nome;
	private String descricao;
	private List<Atributo> atributo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Atributo> getAtributo() {
		return atributo;
	}

	public void setAtributo(List<Atributo> atributo) {
		this.atributo = atributo;
	}
	
	

}
