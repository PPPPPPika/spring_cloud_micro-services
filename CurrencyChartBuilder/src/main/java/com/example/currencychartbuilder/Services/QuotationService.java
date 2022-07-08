package com.example.currencychartbuilder.Services;

import com.example.currencychartbuilder.Models.Quotation;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuotationService {
    ResponseEntity<Quotation> saveQuotation(String currency, double price, long time);
    List<Quotation> findAllQuotation();
}
