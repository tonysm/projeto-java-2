package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.CategoriaEvento;

public interface CategoriaEventoDao {
	public void inserir(CategoriaEvento categoriaEvento);
	public void alterar(CategoriaEvento categoriaEvento);
	public void excluir(CategoriaEvento categoriaEvento);
	public List<CategoriaEvento> listar();
}
