public class Main {
    public static void main(String[] args) {

        int currentBalance = 200;
        int replenishmentAmount = 1500;

        int bonus = 0;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }

        int total = currentBalance + replenishmentAmount + bonus;

        System.out.println(total);
        System.out.println(bonus);
    }
}
