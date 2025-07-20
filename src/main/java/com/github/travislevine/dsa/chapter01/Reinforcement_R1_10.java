package com.github.travislevine.dsa.chapter01;

public class Reinforcement_R1_10 {
    public class Flower {
        // Instance variables
        private String name;
        private int petalCount;
        private float price;

        // Flower constructor
        public Flower(String name, int petalCount, float price) {
            // Remember, this.name refers to the instance variable belonging to the Flower object,
            // while name refers to the parameter that was passed into the constructor.
            this.name = name;
            this.petalCount = petalCount;
            this.price = price;
        }

        // Getter methods for instance fields
        public String getName() {
            return this.name;
        }

        public int getPetalCount() {
            return this.petalCount;
        }

        public float getPrice() {
            return this.price;
        }

        // Setter methods for instance fields to be set
        public void setName(String newName) {
            this.name = newName;
        }

        public void setPetalCount(int newPetalCount) {
            this.petalCount = newPetalCount;
        }

        public void setPrice(float newPrice) {
            this.price = newPrice;
        }
    }
}
