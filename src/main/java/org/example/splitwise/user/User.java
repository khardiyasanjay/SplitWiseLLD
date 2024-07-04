package org.example.splitwise.user;

import lombok.Getter;
import org.example.splitwise.UserExpenseBalanceSheet;

@Getter
public class User {
    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }
}
