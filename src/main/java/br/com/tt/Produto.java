package br.com.tt;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private Categoria categoria;
	private List<Atributo> atributo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Atributo> getAtributo() {
		return atributo;
	}

	public void setAtributo(List<Atributo> atributo) {
		this.atributo = atributo;
	}

	
}
