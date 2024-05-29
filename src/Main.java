public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных
        int initialBalance = 100; // Начальный баланс клиента
        int topUpAmount = 1100; // Сумма пополнения

        // Рассчитываем бонус и итоговый счёт
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = (topUpAmount / 100);
        }
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результаты
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
