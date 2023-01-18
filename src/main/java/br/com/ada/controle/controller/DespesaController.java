package br.com.ada.controle.controller;

import br.com.ada.controle.model.Despesa;
import br.com.ada.controle.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesa")
public class DespesaController {
    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping("/{id}")
    public Despesa buscarPorID(@PathVariable Long id) {
        return despesaService.buscarPorId(id);
    }

    @GetMapping
    public List<Despesa> listarTodos() {
        return despesaService.listarTodos();
    }

    @DeleteMapping("/{id]")
    public String deletar(@PathVariable Long id) {
        return despesaService.deletar(id);
    }
}
