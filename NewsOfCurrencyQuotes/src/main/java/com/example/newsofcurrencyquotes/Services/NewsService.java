package com.example.newsofcurrencyquotes.Services;

import com.example.newsofcurrencyquotes.Models.News;
import org.springframework.http.ResponseEntity;

public interface NewsService {
    ResponseEntity<News> createNews(String currency, double price);
    News getLastNews(String currency) throws Exception;
}
