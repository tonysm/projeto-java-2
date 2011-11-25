package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.Atracao;
import br.eventos.hibernate.HibernateUtil;

public class HibernateAtracaoDao implements AtracaoDao {

	@Override
	public void inserir(Atracao atracao) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(atracao);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(Atracao atracao) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(atracao);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(Atracao atracao) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(atracao);
		sessao.getTransaction().commit();
	}

	@Override
	public List<Atracao> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
