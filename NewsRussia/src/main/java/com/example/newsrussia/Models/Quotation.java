package com.example.newsrussia.Models;

public class Quotation {
    private Long id;
    private String currency;
    private Double price;
    private Long time;

    public Quotation(){

    }

    public Quotation(Long id, String currency, Double price, Long time) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
