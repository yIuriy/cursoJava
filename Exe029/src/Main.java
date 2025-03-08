public class Main {
    public static void main(String[] args) {
        String asterisco = "*";
        for (int count = 0; count <= 50; count++) {
            System.out.println(asterisco);
            asterisco += "*";
        }

        for (int i = 51; i >= 0; i--) {
            System.out.println(asterisco);
            if(asterisco.length() != 1) {
                asterisco = asterisco.substring(0, asterisco.length() - 1);
            }}

    }
}