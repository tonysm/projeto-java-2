package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Evento;
import br.eventos.hibernate.dao.EventoDao;
import br.eventos.hibernate.dao.HibernateEventoDao;

public class EventoService {
	private static EventoDao eventoDao;
	private static EventoService singleton;
	
	static {
		singleton = new EventoService();
	}
	
	private EventoService(){
		eventoDao = new HibernateEventoDao();
	}
	
	public static EventoService getInstance(){
		return singleton;
	}
	
	public void inserir(Evento evento){
		eventoDao.inserir(evento);
	}
	public void alterar(Evento evento){
		eventoDao.alterar(evento);
	}
	public void excluir(Evento evento){
		eventoDao.excluir(evento);
	}
	public List<Evento> listarTodos(){
		return eventoDao.listarTodos();
	}
}
