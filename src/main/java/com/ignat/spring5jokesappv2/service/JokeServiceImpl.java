package com.ignat.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotesService;

    public JokeServiceImpl() {
        this.quotesService = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotesService.getRandomQuote();
    }
}
