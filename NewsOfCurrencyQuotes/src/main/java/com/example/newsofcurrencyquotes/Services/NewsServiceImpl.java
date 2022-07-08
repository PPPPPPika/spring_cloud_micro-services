package com.example.newsofcurrencyquotes.Services;

import com.example.newsofcurrencyquotes.Models.News;
import com.example.newsofcurrencyquotes.Repositorys.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService{
    private final NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public ResponseEntity<News> createNews(String currency, double price) {
        News news = newsRepository.save(new News(null, "УКРЕПЛЕНИЕ РУБЛЯ!", currency, price));
        return ResponseEntity.ok(news);
    }

    @Override
    public News getLastNews(String currency) throws Exception {
        Optional<News> news = newsRepository.getLastNews(currency);
        if (news.isPresent())
            return news.get();
        else
            throw new Exception("Argument us null");
    }
}
