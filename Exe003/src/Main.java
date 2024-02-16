
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 8;
        int d = 7;
        int x;

        if (!(a > 3) && !(b < 5)) {
            x = 10;
        } else if (a >= 2 || (c <= 1)) {
            x = (a + d) / 2;
        } else if (a == 2 || b < 7) {
            x = (a + 2) * (b - 2);
        } else {
            x = ((a + c) / b * (c + d));
        }
        System.out.println(x);
    }
}