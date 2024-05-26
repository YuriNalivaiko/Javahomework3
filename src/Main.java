public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальная сумма на счету клиента
        int depositAmount = 300; // сумма пополнения

        int bonus = 0; // переменная для хранения суммы бонуса
        int finalBalance = initialBalance + depositAmount; // итоговая сумма на счету клиента

        if (depositAmount > 1000) {
            bonus = depositAmount / 100 - 10; // расчет суммы бонуса (вычитаем 10, так как первые 1000 рублей не участвуют в бонусе)
        }

        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}