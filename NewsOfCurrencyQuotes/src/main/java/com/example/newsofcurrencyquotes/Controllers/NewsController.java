package com.example.newsofcurrencyquotes.Controllers;

import com.example.newsofcurrencyquotes.Models.News;
import com.example.newsofcurrencyquotes.Services.NewsService;
import com.example.newsofcurrencyquotes.Services.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newsofcurrencyquotes")
public class NewsController {
    private final NewsService newsService;

    @Autowired
    public NewsController(NewsServiceImpl newsServiceImpl) {
        this.newsService = newsServiceImpl;
    }

    @PostMapping("/receivenews")
    public ResponseEntity<News> postNews(@RequestParam String currency, @RequestParam double price){
        return newsService.createNews(currency, price);
    }

    @GetMapping("/getnews")
    public News getNews(@RequestParam String currency) throws Exception {
        return newsService.getLastNews(currency);
    }

}
