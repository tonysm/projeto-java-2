package br.eventos.hibernate.dao;

import java.util.List;

public interface BandaDao {
	public void inserir(BandaDao bd);
	public void alterar(BandaDao bd);
	public void excluir(Long id);
	public List<BandaDao> listarTodas();
}
