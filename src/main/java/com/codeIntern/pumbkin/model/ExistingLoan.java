package com.codeIntern.pumbkin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ExistingLoan {

    @Id
    private String creditContextId;
    private String CreditScore;

    private String reportDrawnDate;
    private Long totalLoanAmount;
    private Long monthlyEmiAmount;

    public ExistingLoan(){

    }

    public ExistingLoan(String creditContextId, String creditScore, String reportDrawnDate, Long totalLoanAmount, Long monthlyEmiAmount) {
        this.creditContextId = creditContextId;
        CreditScore = creditScore;
        this.reportDrawnDate = reportDrawnDate;
        this.totalLoanAmount = totalLoanAmount;
        this.monthlyEmiAmount = monthlyEmiAmount;
    }

    @Override
    public String toString() {
        return "ExistingLoan{" +
                "creditContextId='" + creditContextId + '\'' +
                ", CreditScore='" + CreditScore + '\'' +
                ", reportDrawnDate=" + reportDrawnDate +
                ", totalLoanAmount=" + totalLoanAmount +
                ", monthlyEmiAmount=" + monthlyEmiAmount +
                '}';
    }

    public String getCreditContextId() {
        return creditContextId;
    }

    public void setCreditContextId(String creditContextId) {
        this.creditContextId = creditContextId;
    }

    public String getCreditScore() {
        return CreditScore;
    }

    public void setCreditScore(String creditScore) {
        CreditScore = creditScore;
    }

    public String getReportDrawnDate() {
        return reportDrawnDate;
    }

    public void setReportDrawnDate(String reportDrawnDate) {
        this.reportDrawnDate = reportDrawnDate;
    }

    public Long getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public void setTotalLoanAmount(Long totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public Long getMonthlyEmiAmount() {
        return monthlyEmiAmount;
    }

    public void setMonthlyEmiAmount(Long monthlyEmiAmount) {
        this.monthlyEmiAmount = monthlyEmiAmount;
    }
}
