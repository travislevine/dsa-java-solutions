package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_11 {
    public class CreditCard {
        // Instance variables:
        private String customer;      // name of the customer (e.g., "John Bowman")
        private String bank;          // name of the bank (e.g., "California Savings")
        private String account;       // account identifier (e.g., "5391 0375 9387 5309")
        private int limit;            // credit limit (measured in dollars)
        protected double balance;     // current balance (measured in dollars)

        // Constructors:
        public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
            customer = cust;
            bank = bk;
            account = acnt;
            limit = lim;
            balance = initialBal;
        }

        public CreditCard(String cust, String bk, String acnt, int lim) {
            this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
        }

        // Accessor methods:
        public String getCustomer() {
            return customer;
        }

        public String getBank() {
            return bank;
        }

        public String getAccount() {
            return account;
        }

        public int getLimit() {
            return limit;
        }

        public double getBalance() {
            return balance;
        }

        // Update methods:
        public boolean charge(double price) {
            if (price + balance > limit) { // if charge would surpass limit
                return false;              // refuse the charge
            }
            // at this point, the charge is successful
            balance += price;              // update the balance
            return true;                   // announce the good news
        }

        public void makePayment(double amount) {
            if (amount > 0) {
                balance -= amount;
            }

        }

        // Your new method for R-1.11 will go here.
        public void setLimit(int newLimit) {
            this.limit = newLimit;
        }
    }
}