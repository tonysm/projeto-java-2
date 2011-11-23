package br.eventos.hibernate;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportarBanco {
	public static void main(String[] args) {
		AnnotationConfiguration anotacao = new AnnotationConfiguration();
		Configuration configuracao = anotacao.configure("hibernate.cfg.xml");
		SchemaExport exportar = new SchemaExport(configuracao);
		exportar.create(true, true);
	}
}
