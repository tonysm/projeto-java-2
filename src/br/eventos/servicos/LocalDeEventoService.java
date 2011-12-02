package br.eventos.servicos;

import java.util.List;

import br.eventos.dominio.LocalDeEvento;
import br.eventos.hibernate.dao.HibernateLocalDeEventoDao;
import br.eventos.hibernate.dao.LocalDeEventoDao;
import javax.swing.JOptionPane;

public class LocalDeEventoService {
	private static LocalDeEventoDao localDeEventoDao;
	private static LocalDeEventoService singleton;
	
	static {
		singleton = new LocalDeEventoService();
	}
	
	private LocalDeEventoService(){
		localDeEventoDao = new HibernateLocalDeEventoDao();
	}
	
	public static LocalDeEventoService getInstance(){
		return singleton;
	}
	
	public void persistir(LocalDeEvento local){
            if(!local.getNome().isEmpty()
                    && !local.getEndereco().isEmpty()
                    && local.getCapacidadeMaxima() != 0){
                
                if(local.getId() != null){
                    localDeEventoDao.alterar(local);
                } else {
                    localDeEventoDao.inserir(local);
                }
                
            } else {
                JOptionPane.showMessageDialog(
                    null
                    , "Ooops... Nome, endereço e capacidade máxima são obrigatórios."
                );
            }
        }
	
	public void excluir(LocalDeEvento local){
		localDeEventoDao.excluir(local);
	}
	
	public List<LocalDeEvento> listarTodas(){
		return localDeEventoDao.listar();
	}
        
        public LocalDeEvento carregar(Long id){
            return localDeEventoDao.carregar(id);
        }
}
