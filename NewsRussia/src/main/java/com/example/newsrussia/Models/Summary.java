package com.example.newsrussia.Models;

import java.util.List;

public class Summary {
    private List<Quotation> quotations;
    private News news;

    public Summary(List<Quotation> quotations, News news) {
        this.quotations = quotations;
        this.news = news;
    }

    public List<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Quotation> quotations) {
        this.quotations = quotations;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
