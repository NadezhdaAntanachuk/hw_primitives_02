public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 100;
        int payment = 1100;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (payment > 1000) {
            balance = balance + payment + payment / 100;
        } else {
            balance = balance + payment;
        }
        System.out.println("Баланс счета: " + balance);
    }
}