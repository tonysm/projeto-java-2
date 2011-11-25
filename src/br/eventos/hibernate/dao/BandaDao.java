package br.eventos.hibernate.dao;

import java.util.List;

import br.eventos.dominio.Banda;

public interface BandaDao {
	public void inserir(Banda bd);
	public void alterar(Banda bd);
	public void excluir(Banda db);
	public List<Banda> listarTodas();
}
