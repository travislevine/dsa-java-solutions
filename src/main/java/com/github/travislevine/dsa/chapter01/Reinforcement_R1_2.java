package com.github.travislevine.dsa.chapter01;
/** Question   Suppose that we create an array A of GameEntry objects, which has an integer
 scores field, and we clone A and store the result in an array B. If we then immediately
 set A[4] score equal to 550, what is the score value of the GameEntry
 object referenced by B[4]?
 **/
 /*
     * A simple class to represent a game entry with a score.
     */
    class GameEntry {
        public int score;

        public GameEntry(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return Integer.toString(score);
        }
    }

    public class Reinforcement_R1_2 {

        public static void main(String[] args) {
            // 1. Create and populate an array 'A' of GameEntry objects.
            GameEntry[] A = new GameEntry[5];
            A[0] = new GameEntry(100);
            A[1] = new GameEntry(200);
            A[2] = new GameEntry(300);
            A[3] = new GameEntry(400);
            A[4] = new GameEntry(500); // The object we will modify.

            // 2. Clone array A into a new array B.
            GameEntry[] B = A.clone();

            System.out.println("Original score for A[4]: " + A[4].score);
            System.out.println("Original score for B[4]: " + B[4].score);
            System.out.println("---");

            // 3. Set A[4].score equal to 550.
            System.out.println("Updating A[4].score to 550...");
            A[4].score = 550;
            System.out.println("---");

            // 4. Check the score value of the object referenced by B[4].
            System.out.println("New score for A[4]: " + A[4].score);
            System.out.println("New score for B[4]: " + B[4].score + " <-- The answer");
        }
    }