package com.example.newsrussia.Controllers;

import com.example.newsrussia.Models.News;
import com.example.newsrussia.Models.Quotation;
import com.example.newsrussia.Models.Summary;
import com.example.newsrussia.Service.ChartProxyService;
import com.example.newsrussia.Service.NewsProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/NewsRussia")
public class NewsRussiaController {
    private final ChartProxyService chartProxyService;
    private final NewsProxyService newsProxyService;

    @Autowired
    public NewsRussiaController(ChartProxyService chartProxyService, NewsProxyService newsProxyService) {
        this.chartProxyService = chartProxyService;
        this.newsProxyService = newsProxyService;
    }

    @GetMapping("/EconomyNews")
    public ResponseEntity<Summary> getLastNews(@RequestParam String currency){
        List<Quotation> quotationList = chartProxyService.getChart();
        News news = newsProxyService.getNews(currency);
        return ResponseEntity.ok(new Summary(quotationList, news));
    }

}
