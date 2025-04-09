package com.yuvrajpatil.analyzers.investments.controller;

import com.yuvrajpatil.analyzers.investments.model.Investment;
import com.yuvrajpatil.analyzers.investments.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/investments")
public class InvestmentController {

    @Autowired
    InvestmentService investmentService;

    @GetMapping("/investments")
    public ResponseEntity <List<Investment>> getAllInvestments () {
        List <Investment> investments =investmentService.getInvestments();
        if(investments.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(investments, HttpStatus.OK);
    }

    @GetMapping("/investments/{investmentId}")
    public ResponseEntity<Investment> getInvestmentById (@PathVariable String investmentId) {
        Investment investment = investmentService.getInvestmentById(investmentId);
        if(null == investment) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(investment, HttpStatus.OK);
    }

    @PostMapping("/investments")
    public void addInvestment(@RequestBody  Investment investmentObj) {
        investmentService.addInvestment(investmentObj);
    }

    @PutMapping("/investments")
    public void updateInvestment(@RequestBody  Investment investmentObj) {
        investmentService.updateInvestment(investmentObj);
    }

    @DeleteMapping("/investments/{investmentId}")
    public void deleteInvestment(@PathVariable String investmentId) {
        investmentService.deleteInvestment(investmentId);
    }
}
