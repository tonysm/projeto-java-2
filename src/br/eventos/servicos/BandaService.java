package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.Banda;
import br.eventos.hibernate.dao.BandaDao;
import br.eventos.hibernate.dao.HibernateBandaDao;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

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
        
        public void persistir(Banda banda){
            if(!banda.getNome().isEmpty() || banda.getData() != null){
                if(banda.getId() != null)
                    bandaDao.alterar(banda);
                else
                    bandaDao.inserir(banda);
            } else {
                JOptionPane.showMessageDialog(
                    null
                    , "Ooops... Nome e Data de Formação são obrigatórios."
                );
            }
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
