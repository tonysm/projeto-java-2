package br.eventos.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import br.eventos.dominio.Evento;
import br.eventos.hibernate.HibernateUtil;
import org.hibernate.Query;

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
		Session sessao = HibernateUtil.getSessao();
                Query query = sessao.createQuery("from Evento");
                List<Evento> o = query.list();
                return o;
	}
        
        @Override
        public Evento carregar(Long id){
            String hql = "from Evento where id = :id";
            
            Session sessao = HibernateUtil.getSessao();
            sessao.beginTransaction();
            Query query = sessao.createQuery(hql);
            query.setParameter("id", id);
            
            Evento evento = (Evento)query.uniqueResult();
            sessao.getTransaction().commit();
            
            return evento;
        }

}
