package com.bichinhos.gamification.controller;

import com.bichinhos.gamification.entity.Commit;
import com.bichinhos.gamification.service.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caminho/commits")//rota da api para esse endpoint
public class CommitController {

    @Autowired
    private CommitService commitService;

    @PostMapping("/submit")
    public ResponseEntity<?> submitCommit(@RequestBody Commit commit){
        Commit savedCommit = commitService.saveCommit(commit);
        return ResponseEntity.ok(savedCommit);
    }
}
