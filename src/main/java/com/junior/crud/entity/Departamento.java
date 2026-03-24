package com.junior.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Long id;

    @Column(name = "nome_departamento")
    private String nome;

    @Column(name = "localizacao_departamento")
    private String localizacao;

    public Departamento() {}

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getLocalizacao() { return localizacao; }

    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}