public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            try {
                System.out.println(5 / i);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            i++;
        }
    }
}