package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder(User var1, String var2, LocalDate var3);
}
