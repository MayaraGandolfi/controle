package br.com.ada.controle.service;

import br.com.ada.controle.model.Despesa;
import br.com.ada.controle.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa salvar(Despesa despesa){
        Despesa despesaEncontrada = despesaRepository.findByNumeroNF(despesa.getNumeroNF());
        if(despesaEncontrada != null){
            throw new IllegalArgumentException("Nota fiscal já esta cadastrada em outra despesa");
        }
        return despesaRepository.save(despesa);
    }

    public Despesa buscarPorNf(Integer numeroNf){
        return despesaRepository.findByNumeroNF(numeroNf);
    }

    public Despesa buscarPorId(Long id){
        return despesaRepository.findById(id).orElse(null);
    }

    public List<Despesa> listarTodos(){
        return (List<Despesa>) despesaRepository.findAll();
    }

    public String deletar(Long id){
        Despesa despesaEncontrada = buscarPorId(id);
        if (despesaEncontrada == null){
            throw new IllegalArgumentException("Despesa não encontrada");
        }
        despesaRepository.delete(despesaEncontrada);
        return "Despesa deletada";
    }
}
