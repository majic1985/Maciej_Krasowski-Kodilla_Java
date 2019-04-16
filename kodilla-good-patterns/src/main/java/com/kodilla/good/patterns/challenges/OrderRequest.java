package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

    public class OrderRequest {
        public User user;
        public String productName;
        public String productType;
        public LocalDate transactionDate;
        public int transactionID;

        public OrderRequest(User user, String productName, String productType, LocalDate transactionDate, int transactionID) {
            this.user = user;
            this.productName = productName;
            this.productType = productType;
            this.transactionDate = transactionDate;
            this.transactionID = transactionID;
        }

        public User getUser() {
            return this.user;
        }

        public String getProductName() {
            return this.productName;
        }

        public String getProductType() {
            return this.productType;
        }

        public LocalDate getTransactionDate() {
            return this.transactionDate;
        }

        public int getTransactionID() {
            return this.transactionID;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (o != null && this.getClass() == o.getClass()) {
                com.kodilla.good.patterns.challenges.OrderRequest that = (com.kodilla.good.patterns.challenges.OrderRequest)o;
                if (this.transactionID != that.transactionID) {
                    return false;
                } else {
                    label56: {
                        if (this.user != null) {
                            if (this.user.equals(that.user)) {
                                break label56;
                            }
                        } else if (that.user == null) {
                            break label56;
                        }

                        return false;
                    }

                    if (this.productName != null) {
                        if (!this.productName.equals(that.productName)) {
                            return false;
                        }
                    } else if (that.productName != null) {
                        return false;
                    }

                    if (this.productType != null) {
                        if (this.productType.equals(that.productType)) {
                            return this.transactionDate != null ? this.transactionDate.equals(that.transactionDate) : that.transactionDate == null;
                        }
                    } else if (that.productType == null) {
                        return this.transactionDate != null ? this.transactionDate.equals(that.transactionDate) : that.transactionDate == null;
                    }

                    return false;
                }
            } else {
                return false;
            }
        }

        public int hashCode() {
            return this.transactionID;
        }
    }


