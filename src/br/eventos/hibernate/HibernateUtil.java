package br.eventos.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Session sessao;
	private static SessionFactory sessionFactory;
	
	static {
		Configuration config = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		HibernateUtil.sessionFactory = config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static Session getSessao(){
		return sessao;
	}
	
	public static void setSessao(Session sessao){
		HibernateUtil.sessao = sessao;
	}
}