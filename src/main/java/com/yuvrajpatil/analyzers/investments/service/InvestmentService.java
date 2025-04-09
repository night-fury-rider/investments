package com.yuvrajpatil.analyzers.investments.service;

import com.yuvrajpatil.analyzers.investments.model.Investment;
import com.yuvrajpatil.analyzers.investments.repository.InvestmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InvestmentService {

    @Autowired
    InvestmentRepo investmentRepo;


    public List<Investment> getInvestments() {
        return  investmentRepo.findAll();
    }


    public  Investment getInvestmentById(String investmentId) {
        return investmentRepo.findById(investmentId).orElse(new Investment("Empty Category", 0,LocalDateTime.now(), "Empty Folio", "Empty Goal", "0000", 0, "Empty Category"));
    }

    public void addInvestment(Investment investment) {
        investmentRepo.save(investment);
    }

    public void updateInvestment(Investment investment) {
        investmentRepo.save(investment);
    }

    public void deleteInvestment(String investmentId) {
        investmentRepo.deleteById(investmentId);
    }
}


