public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            try {
                if (i == 0) {
                    throw new IllegalArgumentException("Divisor cannot be zero");
                }
                System.out.println(5 / i);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
                //add better handling here
            } finally {
                i++;
            }
        }
    }
}