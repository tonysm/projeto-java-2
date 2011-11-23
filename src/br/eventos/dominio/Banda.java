package br.eventos.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banda {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Date data;
	
	@Column(nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "banda")
	private List<Atracao> atracoes;
	
	public List<Atracao> getAtracoes() {
		return atracoes;
	}

	public void setAtracoes(List<Atracao> atracoes) {
		this.atracoes = atracoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
