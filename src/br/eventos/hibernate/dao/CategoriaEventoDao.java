package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.CategoriaEvento;

public interface CategoriaEventoDao {
	public void inserir(CategoriaEvento cat);
	public void alterar(CategoriaEvento cat);
	public void excluir(CategoriaEvento cat);
	public List<CategoriaEvento> listarTodos();
}
