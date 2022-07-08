package com.example.currencychartbuilder.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "quotation", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quotation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "time", nullable = false)
    private Long time;
}
