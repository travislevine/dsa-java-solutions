package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_13 {
    public static class CreditCard {
        // Instance variables:
        private String customer;
        private String bank;
        private String account;
        private int limit;
        protected double balance;

        // Constructors:
        public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
            customer = cust;
            bank = bk;
            account = acnt;
            limit = lim;
            balance = initialBal;
        }

        public CreditCard(String cust, String bk, String acnt, int lim) {
            this(cust, bk, acnt, lim, 0.0);
        }

        // Accessor methods:
        public String getCustomer() { return customer; }
        public String getBank() { return bank; }
        public String getAccount() { return account; }
        public int getLimit() { return limit; }
        public double getBalance() { return balance; }

        // Update methods:
        public boolean charge(double price) {
            if (price + balance > limit) {
                return false;
            }
            balance += price;
            return true;
        }

        public void makePayment(double amount) {
            if (amount > 0) {
                balance -= amount;
            }
        }

        public void setLimit(int newLimit) {
            this.limit = newLimit;
        }

        // Main method from Code Fragment 1.6
        public static void main(String[] args) {
            CreditCard[] wallet = new CreditCard[3];
            wallet[0] = new CreditCard("John Bowman", "California Savings",
                    "5391 0375 9387 5309", 5000);
            wallet[1] = new CreditCard("Seth Bowman", "California Federal",
                    "3485 0399 3395 1954", 3500);
            wallet[2] = new CreditCard("Travis Bowman", "California Finance",
                    "5391 0375 9387 5309", 2500, 300);

            for (int val = 1; val <= 58; val++) {
                wallet[0].charge(3 * val);
                wallet[1].charge(2 * val);
                wallet[2].charge(val);
            }

            // This loop prints the final state of each card
            for (CreditCard card : wallet) {
                // The original example had a printSummary method, but for simplicity
                // we can just print the balance directly.
                System.out.println("Customer: " + card.getCustomer());
                System.out.println("Balance = " + card.getBalance());
            }
        }
    }

}
