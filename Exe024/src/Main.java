public class Main {
    public static void main(String[] args) {
        int countHello = 0;
        while (countHello < 10) {
            countHello++;
            if (countHello == 2 || countHello == 4) {
                continue;
            }
            if(countHello == 7){
                break;
            }
            System.out.println("Hello World! " + countHello);
        }
    }
}