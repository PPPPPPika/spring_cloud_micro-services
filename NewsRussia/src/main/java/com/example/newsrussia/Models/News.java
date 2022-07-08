package com.example.newsrussia.Models;

public class News {
    private Long id;
    private String topic;
    private String currency;
    private Double price;

    public News(){

    }

    public News(Long id, String topic, String currency, Double price) {
        this.id = id;
        this.topic = topic;
        this.currency = currency;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
