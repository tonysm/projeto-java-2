package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.LocalDeEvento;

public interface LocalDeEventoDao {
	public void inserir(LocalDeEvento local);
	public void alterar(LocalDeEvento local);
	public void excluir(LocalDeEvento local);
	public List<LocalDeEvento> listar();
        public LocalDeEvento carregar(Long id);
}
