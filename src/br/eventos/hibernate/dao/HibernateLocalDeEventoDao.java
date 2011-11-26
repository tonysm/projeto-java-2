package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.LocalDeEvento;
import br.eventos.hibernate.HibernateUtil;

public class HibernateLocalDeEventoDao implements LocalDeEventoDao {

	@Override
	public void inserir(LocalDeEvento local) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(local);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(LocalDeEvento local) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(local);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(LocalDeEvento local) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(local);
		sessao.getTransaction().commit();
	}

	@Override
	public List<LocalDeEvento> listar() {
		return null;
	}

}
