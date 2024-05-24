package com.bichinhos.gamification.dto;

public class CardDto {
    private Long id;
    private String status;
    private String descricao;
    private String nivelComplexidade;
    private String prazoEntrega;
    private int quantidadePessoas;
    private int pontos;
    private String numeroMatriculaAceitante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivelComplexidade() {
        return nivelComplexidade;
    }

    public void setNivelComplexidade(String nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNumeroMatriculaAceitante() {
        return numeroMatriculaAceitante;
    }

    public void setNumeroMatriculaAceitante(String numeroMatriculaAceitante) {
        this.numeroMatriculaAceitante = numeroMatriculaAceitante;
    }
}
