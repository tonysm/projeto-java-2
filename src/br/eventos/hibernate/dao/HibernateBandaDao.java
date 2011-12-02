package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.Banda;
import br.eventos.hibernate.HibernateUtil;
import org.hibernate.Query;

public class HibernateBandaDao implements BandaDao {

	@Override
	public void inserir(Banda bd) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.save(bd);
		sessao.getTransaction().commit();
	}

	@Override
	public void alterar(Banda bd) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.update(bd);
		sessao.getTransaction().commit();
	}

	@Override
	public void excluir(Banda bd) {
		Session sessao = HibernateUtil.getSessao();
		sessao.beginTransaction();
		sessao.delete(bd);
		sessao.getTransaction().commit();
	}

	@Override
	public List<Banda> listarTodas() {
                Session sessao = HibernateUtil.getSessao();
                Query query = sessao.createQuery("from Banda");
                List<Banda> o = query.list();
                return o;
	}
        
        public Banda carregar(Long id){
            
            String hql = "from Banda where id = :id";
            
            Session sessao = HibernateUtil.getSessao();
            sessao.beginTransaction();
            Query query = sessao.createQuery(hql);
            query.setParameter("id", id);
            
            Banda banda = (Banda)query.uniqueResult();
            sessao.getTransaction().commit();
            return banda;
        }
	
}
