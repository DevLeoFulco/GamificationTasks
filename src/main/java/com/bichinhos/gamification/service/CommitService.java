package com.bichinhos.gamification.service;

import com.bichinhos.gamification.entity.Commit;
import com.bichinhos.gamification.repository.CommitRepository;

public class CommitService {

    private CommitRepository commitRepository;

    public Commit saveCommit(Commit commit){
        return commitRepository.save(commit);
    }
}
