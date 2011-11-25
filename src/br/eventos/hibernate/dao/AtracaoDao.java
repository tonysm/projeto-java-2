package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.Atracao;

public interface AtracaoDao {
	public void inserir(Atracao atracao);
	public void alterar(Atracao atracao);
	public void excluir(Atracao atracao);
	public List<Atracao> listar();
}
