package com.bichinhos.gamification.controller;

import com.bichinhos.gamification.entity.Card;
import com.bichinhos.gamification.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caminho/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/available")
    public List<Card> getAvailableCards(){
        return cardService.getAvailableCards();
    }

    @PostMapping("/accept/{id}")
    public ResponseEntity<?> acceptCard(@PathVariable Long id, @RequestParam String matricla){
        Card card = cardService.getCardById(id);
        if (card != null && "Disponível".equals(card.getStatus())){
            card.setStatus("Em Andamento");
            card.setNumeroMatriculaAceitante(matricla);
            cardService.saveCard(card);

            return ResponseEntity.ok(card);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Card não disponível");
    }

}
