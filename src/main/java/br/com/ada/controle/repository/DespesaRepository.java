package br.com.ada.controle.repository;

import br.com.ada.controle.model.Despesa;
import br.com.ada.controle.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DespesaRepository extends CrudRepository<Despesa,Long> {
    Despesa findByNumeroNF(int nf);
    Despesa findById(Despesa despesa);
    List<Despesa> findAll(Despesa despesa);
}
