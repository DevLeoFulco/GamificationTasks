package com.bichinhos.gamification.entity;

import jakarta.persistence.*;

@Entity
public class Commit {

    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String numeroCommit;
    private Boolean aprovado;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

}
