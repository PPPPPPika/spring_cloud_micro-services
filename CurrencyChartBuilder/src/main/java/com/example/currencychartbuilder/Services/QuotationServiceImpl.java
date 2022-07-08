package com.example.currencychartbuilder.Services;

import com.example.currencychartbuilder.Models.Quotation;
import com.example.currencychartbuilder.Repositorys.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationServiceImpl implements QuotationService{
    private final QuotationRepository quotationRepository;

    @Autowired
    public QuotationServiceImpl(QuotationRepository quotationRepository) {
        this.quotationRepository = quotationRepository;
    }

    @Override
    public ResponseEntity<Quotation> saveQuotation(String currency, double price, long time){
        Quotation quotation = quotationRepository.save(new Quotation(null, currency, price, time));
        System.out.println(quotation);
        return ResponseEntity.ok(quotation);
    }

    @Override
    public List<Quotation> findAllQuotation() {
        return (List<Quotation>) quotationRepository.findAll();
    }
}
