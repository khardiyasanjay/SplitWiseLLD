package org.example.splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split s: splitList){
            if(s.getAmountOwe()!=amountShouldBePresent){
                //throw exception
            }
        }
    }
}
