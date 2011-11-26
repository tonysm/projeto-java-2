package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.LocalDeEvento;
import br.eventos.hibernate.dao.HibernateLocalDeEventoDao;
import br.eventos.hibernate.dao.LocalDeEventoDao;

public class LocalDeEventoService {
	private static LocalDeEventoDao localDeEventoDao;
	private static LocalDeEventoService singleton;
	
	static {
		singleton = new LocalDeEventoService();
	}
	
	private LocalDeEventoService(){
		localDeEventoDao = new HibernateLocalDeEventoDao();
	}
	
	public LocalDeEventoService getInstance(){
		return singleton;
	}
	
	public void inserir(LocalDeEvento local){
		localDeEventoDao.inserir(local);
	}
	
	public void alterar(LocalDeEvento local){
		localDeEventoDao.alterar(local);
	}
	
	public void excluir(LocalDeEvento local){
		localDeEventoDao.excluir(local);
	}
	
	public List<LocalDeEvento> listarTodas(){
		return localDeEventoDao.listar();
	}
}
