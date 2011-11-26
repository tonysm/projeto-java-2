package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.CategoriaEvento;
import br.eventos.hibernate.HibernateUtil;

public class HibernateCategoriaEventoDao implements CategoriaEventoDao {

	@Override
	public void inserir(CategoriaEvento categoriaEvento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(categoriaEvento);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(CategoriaEvento categoriaEvento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(categoriaEvento);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(CategoriaEvento categoriaEvento) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(categoriaEvento);
		sessao.getTransaction().commit();
	}

	@Override
	public List<CategoriaEvento> listar() {
		return null;
	}

}
