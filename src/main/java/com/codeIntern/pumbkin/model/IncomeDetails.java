package com.codeIntern.pumbkin.model;

import com.codeIntern.pumbkin.repo.ExistingLoanRepo;
import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Entity
public class IncomeDetails {


    @Id
    private Long incomeId;
    private String FY2022_2023;
    private String FY2023_2024;
    private String FY2024_2025;

    @Enumerated(value = EnumType.STRING)
    private BankName bankName=BankName.SELECT;

    @Enumerated(value = EnumType.STRING)
    private AccountType accountType=AccountType.SELECT;

    private String ifscCode;
    private String AccountNumber;

    @Lob
    private byte[] cancelCheque;

    @Lob
    private byte[] bankStatement;


    public IncomeDetails(){

    }

    @Override
    public String toString() {
        return "IncomeDetails{" +
                "incomeId=" + incomeId +
                ", FY2022_2023=" + FY2022_2023 +
                ", FY2023_2024=" + FY2023_2024 +
                ", FY2024_2025=" + FY2024_2025 +
                ", bankName=" + bankName +
                ", accountType=" + accountType +
                ", ifscCode='" + ifscCode + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", panFile=" + Arrays.toString(cancelCheque) +
                ", aadharFile=" + Arrays.toString(bankStatement) +
                '}';
    }

    public IncomeDetails(Long incomeId, String FY2022_2023, String FY2023_2024, String FY2024_2025, BankName bankName, AccountType accountType, String ifscCode, String accountNumber, byte[] cancelCheque, byte[] bankStatement) {
        this.incomeId = incomeId;
        this.FY2022_2023 = FY2022_2023;
        this.FY2023_2024 = FY2023_2024;
        this.FY2024_2025 = FY2024_2025;
        this.bankName = bankName;
        this.accountType = accountType;
        this.ifscCode = ifscCode;
        AccountNumber = accountNumber;
        this.cancelCheque = cancelCheque;
        this.bankStatement = bankStatement;
    }

    public void setFY2022_2023(String FY2022_2023) {
        this.FY2022_2023 = FY2022_2023;
    }

    public void setFY2023_2024(String FY2023_2024) {
        this.FY2023_2024 = FY2023_2024;
    }

    public void setFY2024_2025(String FY2024_2025) {
        this.FY2024_2025 = FY2024_2025;
    }

    public byte[] getCancelCheque() {
        return cancelCheque;
    }

    public void setCancelCheque(byte[] cancelCheque) {
        this.cancelCheque = cancelCheque;
    }

    public byte[] getBankStatement() {
        return bankStatement;
    }

    public void setBankStatement(byte[] bankStatement) {
        this.bankStatement = bankStatement;
    }

    public Long getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Long incomeId) {
        this.incomeId = incomeId;
    }



    public BankName getBankName() {
        return bankName;
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }


}
