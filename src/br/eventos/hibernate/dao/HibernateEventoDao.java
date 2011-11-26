package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.Evento;
import br.eventos.hibernate.HibernateUtil;

public class HibernateEventoDao implements EventoDao {

	@Override
	public void inserir(Evento evento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(evento);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(Evento evento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(evento);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(Evento evento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(evento);
		sessao.getTransaction().commit();
	}

	@Override
	public List<Evento> listarTodos() {
		return null;
	}

}
