package com.kodilla.good.patterns.challenges;

public class MailNotification implements InformationService {
    public MailNotification() {
    }

    public void informUser(User user, OrderRequest orderRequest) {
        System.out.println("E-mail is being sent to: " + user.getUserName() + " " + user.getUserSurname() + ", order ID: " + orderRequest.transactionID);
    }
}

