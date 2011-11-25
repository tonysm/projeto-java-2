package br.eventos.dominio;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import br.eventos.hibernate.HibernateUtil;
import br.eventos.servicos.BandaService;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session sessao = sessionFactory.openSession();
		HibernateUtil.setSessao(sessao);
		
//		BandaService servico = BandaService.getInstance();
//		
//		Banda banda = new Banda();
//		banda.setNome("Sangria");
//		banda.setData(new Date());
//		banda.setDescricao("Banda de Emo");
//		servico.salvar(banda);
		
//		Banda banda;
//		banda = (Banda)sessao.get(Banda.class, 1l);
//		System.out.println(banda.getNome());
		
		sessao.close();
	}
}
