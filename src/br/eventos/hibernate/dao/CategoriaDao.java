package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.Categoria;

public interface CategoriaDao {
	public void inserir(Categoria cat);
	public void alterar(Categoria cat);
	public void excluir(Categoria cat);
	public List<Categoria> listarTodos();
}
