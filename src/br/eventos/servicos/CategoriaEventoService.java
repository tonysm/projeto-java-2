package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.CategoriaEvento;
import br.eventos.hibernate.dao.CategoriaEventoDao;
import br.eventos.hibernate.dao.HibernateCategoriaEventoDao;

public class CategoriaEventoService {
	private static CategoriaEventoDao categoriaEventoDao;
	private static CategoriaEventoService singleton;
	
	static {
		singleton = new CategoriaEventoService();
	}
	
	private CategoriaEventoService(){
		categoriaEventoDao = new HibernateCategoriaEventoDao();
	}
	
	public CategoriaEventoService getInstance(){
		return singleton;
	}
	
	public void inserir(CategoriaEvento catEvento){
		categoriaEventoDao.inserir(catEvento);
	}
	
	public void alterar(CategoriaEvento catEvento){
		categoriaEventoDao.alterar(catEvento);
	}
	
	public void excluir(CategoriaEvento catEvento){
		categoriaEventoDao.excluir(catEvento);
	}
	
	public List<CategoriaEvento> listar(){
		return categoriaEventoDao.listar();
	}
}
