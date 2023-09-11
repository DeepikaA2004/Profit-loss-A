public class Computation1 {
    public static void main(String[] args) {
        // Define the fixed costs (fc1, fc2, fc3) in dollars
        double fc1 = 2000.0;
        double fc2 = 4000.0;
        double fc3 = 6000.0;

        // Define the original variable costs (vc1, vc2, vc3) in dollars
        double vc1 = 10000.0;
        double vc2 = 8000.0;
        double vc3 = 7000.0;

        // Define the sales (s1, s2, s3) in dollars
        double s1 = 16000.0;
        double s2 = 17000.0;
        double s3 = 8000.0;

        // Decrease the variable cost of product A by 50%
        double updatedVC1 = vc1 * 0.5; // 50% decrease

        // Calculate the new profit for product A with the decreased variable cost
        double p1 = s1 - (fc1 + updatedVC1);

        // Display the new profit for product A
        System.out.println("New Profit for Product A (p1) with 50% decreased variable cost: $" + p1);
    }
}
