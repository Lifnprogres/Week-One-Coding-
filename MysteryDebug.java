public class MysteryDebug {
    public static void main(String[] args) {
        int result = mystery(1, 18);
        System.out.println("Final Result: " + result);
    }

    public static int mystery(int a, int b) {
        System.out.println("mystery(" + a + ", " + b + ")");
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
}
