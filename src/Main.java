public class Main {
    public static void main(String[] args) {

        int payment = 1600; // платеж клиента
        int bonusCost = 100; // пополнение с которого считается бонус
        int scoreCustomer = 20; // баланс клиента
        int bonus; // бонус за каждые 100 рублей, при платеже более 1000

        if (payment >= 1000) {
            bonus = payment / bonusCost;
        } else {
            bonus = 0;
        }
        int totalScoreCustomer = scoreCustomer + payment + bonus;

        System.out.println("При пополнении счёта мобильного телефона на сумму от 1000 рублей, клиенту начисляется бонус за каждые 100 рублей пополнения в размере:");
        System.out.println("Вы пополнили баланс на " + payment + " руб.");
        System.out.println("Ваш бонус при пополнении " + bonus + " руб");
        System.out.println("Ваш баланс составляет " + totalScoreCustomer + " руб");
    }
}