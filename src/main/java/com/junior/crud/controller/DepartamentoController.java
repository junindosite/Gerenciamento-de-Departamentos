package com.junior.crud.controller;

import com.junior.crud.entity.Departamento;
import com.junior.crud.service.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private final DepartamentoService service;

    public DepartamentoController(DepartamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Departamento salvar(@RequestBody Departamento departamento) {
        return service.salvar(departamento);
    }

    @GetMapping
    public List<Departamento> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Departamento buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}