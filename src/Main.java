public class Main {
    public static void main(String[] args) {

        // Task 1: count up by 1 from 0 to 30
        for (int count = 0; count <= 30; count++) {
            System.out.print(count + " ");
        }
        System.out.println();

        // Task 2: count down by 1 from 30 to 0
        for (int count = 30; count >= 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();

        // Task 3: count up by 3 from 0 to 18
        for (int count = 0; count <= 18; count += 3) {
            System.out.print(count + " ");
        }
        System.out.println();

        // Task 4: count down by 2 from 10 to 0
        for (int count = 10; count >= 0; count -= 2) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}