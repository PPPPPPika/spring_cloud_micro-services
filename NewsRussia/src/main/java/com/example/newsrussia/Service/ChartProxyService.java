package com.example.newsrussia.Service;

import com.example.newsrussia.Models.Quotation;
import com.example.newsrussia.Models.Summary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "chart")
public interface ChartProxyService {
    @GetMapping("/currencychartbuilder/getchart")
    public List<Quotation> getChart();
}
