package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.LocalDeEvento;
import br.eventos.hibernate.HibernateUtil;
import org.hibernate.Query;

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
            Session sessao = HibernateUtil.getSessao();
            Query query = sessao.createQuery("from LocalDeEvento");
            List<LocalDeEvento> o = query.list();
            return o;
	}
        
        @Override
        public LocalDeEvento carregar(Long id){
            String hql = "from LocalDeEvento where id = :id";
            Session sessao = HibernateUtil.getSessao();
            sessao.beginTransaction();
            Query query = sessao.createQuery(hql);
            query.setParameter("id", id);
            
            LocalDeEvento local = (LocalDeEvento)query.uniqueResult();
            sessao.getTransaction().commit();
            return local;
        }

}
