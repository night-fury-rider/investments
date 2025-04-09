package com.yuvrajpatil.analyzers.investments.repository;

import com.yuvrajpatil.analyzers.investments.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepo extends JpaRepository<Investment, String> {
}
