public class NestedLoops {
    public static void main(String[] args) {

        // Task 5: 5x5 square
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();   // end the row
        }

        // Task 6: growing triangle (1 star, then 2, ... 5)
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {   // stars = row number
                System.out.print("* ");
            }
            System.out.println();
        }

        // Task 7: shrinking triangle (5 stars, then 4, ... 1)
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}