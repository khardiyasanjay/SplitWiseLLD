package org.example.splitwise.expense;

import org.example.splitwise.expense.split.EqualExpenseSplit;
import org.example.splitwise.expense.split.ExpenseSplit;
import org.example.splitwise.expense.split.PercentageExpenseSplit;
import org.example.splitwise.expense.split.UnequalExpenseSplit;

import static org.example.splitwise.expense.ExpenseSplitType.EQUAL;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType expenseSplitType){
        return switch (expenseSplitType) {
            case EQUAL -> new EqualExpenseSplit();
            case UNEQUAL -> new UnequalExpenseSplit();
            case PERCENTAGE -> new PercentageExpenseSplit();
            default -> null;
        };
    }
}
