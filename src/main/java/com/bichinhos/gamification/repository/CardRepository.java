package com.bichinhos.gamification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bichinhos.gamification.entity.Card;
import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long>{
    List<Card> findByStatus(String status);
}
