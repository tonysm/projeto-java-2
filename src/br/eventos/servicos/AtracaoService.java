package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Atracao;
import br.eventos.hibernate.dao.AtracaoDao;
import br.eventos.hibernate.dao.HibernateAtracaoDao;

public class AtracaoService {
	private static AtracaoDao atracaoDao;
	private static AtracaoService singleton;
	
	static{
		singleton = new AtracaoService();
	}
	
	private AtracaoService(){
		atracaoDao = new HibernateAtracaoDao();
	}
	
	public static AtracaoService getInstance(){
		return singleton;
	}
	
	public void inserir(Atracao atracao){
		atracaoDao.inserir(atracao);
	}
	
	public void alterar(Atracao atracao){
		atracaoDao.alterar(atracao);
	}
	public void excluir(Atracao atracao){
		atracaoDao.excluir(atracao);
	}
	public List<Atracao> listarTodas(){
		return atracaoDao.listarTodas();
	}
}
