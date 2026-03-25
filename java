public class DiscountCalculator {
    public static void main(String[] args) {
        int input = 1200;

        if (input < 0) {
            System.out.println("invalid input can not be negative");
        } else {
            int fn = (int)(input * 0.9);
            System.out.println("final price is " + fn);
        }
    }
}