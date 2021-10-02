public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 1100;
        int bonus;
        if (depositAmount < 1000) {
            bonus = 0;
        } else {
            bonus = depositAmount / 100;
        }
        int totalAmount = initialAccount + depositAmount + bonus;
        System.out.println("Общая сумма: " + totalAmount + " руб.");
        System.out.println("Бонусы: " + bonus + " руб.");
    }
}
