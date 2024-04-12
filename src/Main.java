public class Main {
    public static void main(String[] args) {
        int clientAccount = 200;
        int replenishment = 2100;

        int bonuses;
        if (replenishment > 1000) {
            bonuses = replenishment / 100;
        } else {
            bonuses = 0;
        }
        int totalAmount = clientAccount + replenishment + bonuses;

        System.out.println("Final score:" + totalAmount);
        System.out.println("The number of bonus rubles:" + bonuses);
    }
}