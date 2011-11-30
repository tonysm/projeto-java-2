package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Banda;
import br.eventos.hibernate.dao.BandaDao;
import br.eventos.hibernate.dao.HibernateBandaDao;
import java.text.SimpleDateFormat;

public class BandaService {
	private static BandaDao bandaDao;
	private static BandaService bandaService;
	
	static {
		bandaService = new BandaService();
	}
	
	private BandaService(){
		//singleton
		bandaDao = new HibernateBandaDao();
	}
	
	public static BandaService getInstance(){
		return bandaService;
	}
	
	public void salvar(Banda banda){
		if(!banda.getNome().isEmpty()
                        && banda.getData() != null){
			bandaDao.inserir(banda);
		}
			
	}
	
	public void editar(Banda banda){
		if(!banda.getNome().isEmpty()
                        && banda.getId() != null)
			bandaDao.alterar(banda);
	}
	
	public List<Banda> listarTodas(){
		return bandaDao.listarTodas();
	}
	
	public void excluir(Banda banda){
		bandaDao.excluir(banda);
	}
        
        public Banda carregar(Long id){
            return bandaDao.carregar(id);
        }
	
}
