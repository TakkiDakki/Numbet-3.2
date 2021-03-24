public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int percent = 100;

        long bonus = amount + (amount / percent) + 100;
        System.out.println(bonus);
    }
}