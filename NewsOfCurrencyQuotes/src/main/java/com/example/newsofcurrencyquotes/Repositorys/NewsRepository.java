package com.example.newsofcurrencyquotes.Repositorys;

import com.example.newsofcurrencyquotes.Models.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewsRepository extends CrudRepository <News, Long> {
    @Query(value = "SELECT id, topic, currency, price FROM news WHERE (id = (SELECT MAX(id) FROM news)) AND currency = :currency", nativeQuery = true)
    Optional<News> getLastNews(String currency);
}
