package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.Categoria;
import br.eventos.hibernate.HibernateUtil;

public class HibernateCategoriaDao implements CategoriaDao {

	@Override
	public void inserir(Categoria cat) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(cat);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(Categoria cat) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(cat);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(Categoria cat) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(cat);
		sessao.getTransaction().commit();
	}

	@Override
	public List<Categoria> listarTodos() {
		return null;
	}

}
