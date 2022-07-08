package com.example.currencychartbuilder.Repositorys;

import com.example.currencychartbuilder.Models.Quotation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotationRepository extends CrudRepository<Quotation, Long> {

}
