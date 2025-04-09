package com.yuvrajpatil.analyzers.investments.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "investments")
@AllArgsConstructor
@NoArgsConstructor
public class Investment {
    private String category;
    private  int currentValue;
    private LocalDateTime date;
    private  String folio;
    private String goal;
    @Id
    private  String id;
    private int investedValue;
    private  String subCategory;
}
