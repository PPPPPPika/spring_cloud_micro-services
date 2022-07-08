package com.example.newsrussia.Service;

import com.example.newsrussia.Models.News;
import com.example.newsrussia.Models.Summary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "news")
public interface NewsProxyService {
    @GetMapping("/newsofcurrencyquotes/getnews")
    public News getNews(@RequestParam String currency);
}
