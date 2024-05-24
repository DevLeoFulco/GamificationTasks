package com.bichinhos.gamification.service;

import com.bichinhos.gamification.entity.Card;
import com.bichinhos.gamification.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private CardRepository cardRepository;

    public List<Card> getAvailableCards(){
        return cardRepository.findByStatus("Disponível");
    }

    public Card saveCard (Card card){
        return  cardRepository.save(card);
    }

    public Card getCardById(Long id){
        return cardRepository.findById(id).orElse(null);
    }
}
