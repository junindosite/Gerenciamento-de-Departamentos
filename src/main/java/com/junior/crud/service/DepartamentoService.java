package com.junior.crud.service;

import com.junior.crud.entity.Departamento;
import com.junior.crud.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public Departamento salvar(Departamento departamento) {
        return repository.save(departamento);
    }

    public List<Departamento> listarTodos() {
        return repository.findAll();
    }

    public Departamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departamento não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}