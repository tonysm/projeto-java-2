package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.Evento;

public interface EventoDao {
	public void inserir(Evento evento);
	public void alterar(Evento evento);
	public void excluir(Evento evento);
	public List<Evento> listarTodos();
        public Evento carregar(Long id);
}
