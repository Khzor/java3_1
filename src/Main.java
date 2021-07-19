public class Main {
    public static void main(String[] args) {

        int current_balance = 200;
        int replenishment_amount = 1500;

        int bonus = 0;
        if (replenishment_amount > 1000) {
            bonus = replenishment_amount / 100;
        }

        int total = current_balance + replenishment_amount + bonus;

        System.out.println(total);
        System.out.println(bonus);
    }
}
