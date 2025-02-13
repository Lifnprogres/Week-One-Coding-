public class Fibonacci {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static String toBinary(int num) {
        if (num == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N) + " " + toBinary(N));
        }
    }
}
