package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Categoria;
import br.eventos.hibernate.dao.CategoriaDao;
import br.eventos.hibernate.dao.HibernateCategoriaDao;

public class CategoriaService {
	private static CategoriaDao categoriaDao;
	private static CategoriaService singleton;
	
	static {
		singleton = new CategoriaService();
	}
	
	private CategoriaService(){
		categoriaDao = new HibernateCategoriaDao();
	}
	
	public static CategoriaService getInstance(){
		return singleton;
	}
	
	public void inserir(Categoria cat){
		categoriaDao.inserir(cat);
	}
	
	public void alterar(Categoria cat){
		categoriaDao.alterar(cat);
	}
	
	public void excluir(Categoria cat){
		categoriaDao.excluir(cat);
	}
	
	public List<Categoria> listarTodas(){
		return categoriaDao.listarTodos();
	}
}
