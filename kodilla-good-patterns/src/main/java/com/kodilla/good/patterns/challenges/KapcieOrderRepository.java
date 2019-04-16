package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

    public class KapcieOrderRepository implements OrderRepository {
        public KapcieOrderRepository() {
        }

        public boolean createOrder(User user, String productType, LocalDate transactionDate) {
            return true;
        }
    }

