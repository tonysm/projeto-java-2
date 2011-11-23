package br.eventos.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evento {
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "local_id")
	private LocalDeEvento local;
	
	@OneToMany(mappedBy = "evento")
	private List<CategoriaEvento> categoriaEvento;
	
	@OneToMany(mappedBy = "evento")
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LocalDeEvento getLocal() {
		return local;
	}

	public void setLocal(LocalDeEvento local) {
		this.local = local;
	}

	public List<CategoriaEvento> getCategoriaEvento() {
		return categoriaEvento;
	}

	public void setCategoriaEvento(List<CategoriaEvento> categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	} 
	
}
