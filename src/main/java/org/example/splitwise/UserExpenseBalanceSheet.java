package org.example.splitwise;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class UserExpenseBalanceSheet {
    Map<String, Balance> userBalance;
    double totalYourExpense;
    double totalPayment;
    double totalYouOwe;
    double totalYouGetBack;

    public UserExpenseBalanceSheet(){
        userBalance = new HashMap<>();
        totalYourExpense = 0;
        totalPayment = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
    }
}
