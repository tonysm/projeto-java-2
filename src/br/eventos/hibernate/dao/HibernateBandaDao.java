package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.hibernate.HibernateUtil;

public class HibernateBandaDao implements BandaDao {

	@Override
	public void inserir(BandaDao bd) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(bd);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(BandaDao bd) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(bd);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BandaDao> listarTodas() {
		// TODO Auto-generated method stub
		return null;
	}
}
