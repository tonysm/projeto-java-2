package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Evento;
import br.eventos.hibernate.dao.EventoDao;
import br.eventos.hibernate.dao.HibernateEventoDao;
import javax.swing.JOptionPane;

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
	
	public void persistir(Evento evento){
            if(!evento.getNome().isEmpty()
                    && !evento.getDescricao().isEmpty()
                    && evento.getData() != null){
                if(evento.getId() != null){
                    eventoDao.alterar(evento);
                } else {
                    eventoDao.inserir(evento);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Os campos nome, descrição e data do evento são obrigatórios.");
            }
        }
	public void excluir(Evento evento){
		eventoDao.excluir(evento);
	}
	public List<Evento> listarTodos(){
		return eventoDao.listarTodos();
	}
        public Evento carregar(Long id){
            return eventoDao.carregar(id);
        }
}
