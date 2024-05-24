package com.bichinhos.gamification.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Card{
    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String descricao;
    private String status;
    private Integer nivelComplexidade;
    private LocalDate prazoEntrega;
    private Integer maxPessoas;
    private Integer pontos;
    private String numeroMatriculaAceitante;
    private String numeroCommit;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNivelComplexidade() {
        return nivelComplexidade;
    }

    public void setNivelComplexidade(Integer nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public Integer getMaxPessoas() {
        return maxPessoas;
    }

    public void setMaxPessoas(Integer maxPessoas) {
        this.maxPessoas = maxPessoas;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getNumeroMatriculaAceitante() {
        return numeroMatriculaAceitante;
    }

    public void setNumeroMatriculaAceitante(String numeroMatriculaAceitante) {
        this.numeroMatriculaAceitante = numeroMatriculaAceitante;
    }

    public String getNumeroCommit() {
        return numeroCommit;
    }

    public void setNumeroCommit(String numeroCommit) {
        this.numeroCommit = numeroCommit;
    }

}
