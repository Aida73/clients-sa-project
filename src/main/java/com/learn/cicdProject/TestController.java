package com.learn.cicdProject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "home", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @GetMapping
    public List<Sentiment> search(){
        return List.of(new Sentiment(1, "Très bon produit", 1),
                new Sentiment(1, "Pas du tout satisfaite", 0));
    }
}
