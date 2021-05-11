public class Main {
    public static void main(String[] args) {
        int a = 31;
        for (int i = 2; i < 30; i++) {
            if (a / i != a % i)
                System.out.println("false");
            else System.out.println("true");
        }

    }
}
