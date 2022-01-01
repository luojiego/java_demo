public class recursion {
    public static int steps(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return steps(n-1) + steps(n-2);
    }
    public static void main(String[] args) {
        System.out.printf("steps(7) = %d\n", steps(7));
    }
}