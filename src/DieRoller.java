import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int rollNumber = 0;
        boolean isTriple = false;

        // Header row
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("------------------------------");

        // Keep rolling until all three dice match
        while (!isTriple) {
            rollNumber++;
            int die1 = random.nextInt(6) + 1;   // gives 1-6
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", rollNumber, die1, die2, die3, sum);

            isTriple = (die1 == die2 && die2 == die3);
        }
    }
}