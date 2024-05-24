package com.bichinhos.gamification.repository;

import com.bichinhos.gamification.entity.Card;
import com.bichinhos.gamification.entity.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommitRepository extends JpaRepository<Commit,Long> {
    List<Commit> findByCard (Card card);
}
