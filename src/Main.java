public class Main {
    public static void main(String[] args) {
        int счётКлиента = 200;
        int пополнение = 2100;

        int Бонусы;
        if (пополнение > 1000) {
            Бонусы = пополнение / 100;
        } else {
            Бонусы = 0;
        }
        int ИтогаваяСумма = счётКлиента + пополнение + Бонусы;

        System.out.println("Итоговый счёт:" + ИтогаваяСумма);
        System.out.println("Количество бонусных рублей:" + Бонусы);
    }
}