public class IsPowerOfTwo {
    public static boolean run (int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        System.out.println(run(144));
    }
}
