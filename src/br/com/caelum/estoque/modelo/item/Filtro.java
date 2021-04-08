package br.com.caelum.estoque.modelo.item;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Filtro {

	private TipoItem tipo;

	private String nome;

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
