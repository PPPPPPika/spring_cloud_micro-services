package com.example.currencychartbuilder.Controllers;

import com.example.currencychartbuilder.Models.Quotation;
import com.example.currencychartbuilder.Services.QuotationService;
import com.example.currencychartbuilder.Services.QuotationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currencychartbuilder")
public class CurrencyChartController {
    private final QuotationService quotationService;

    @Autowired
    public CurrencyChartController(QuotationServiceImpl quotationServiceImpl) {
        this.quotationService = quotationServiceImpl;
    }

    @PostMapping("/receiveqotation")
    public ResponseEntity<Quotation> getQuotation(@RequestParam String currency, @RequestParam double price, @RequestParam long time){
        return quotationService.saveQuotation(currency, price, time);
    }

    @GetMapping("/getchart")
    public List<Quotation> getChartQuotation(){
        return quotationService.findAllQuotation();
    }
}
