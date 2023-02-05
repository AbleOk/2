import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int bonus = 20; // количество рублей для одной бонусной мили

       Scanner in = new Scanner(System.in); // класс для ввода данных в консоль
       System.out.print("Введите количество денег: ");
       double money = in.nextDouble(); // ввод количества денег, потраченных на билет

       double bonusMiles = money / bonus; // формула расчёта бонусных миль

        System.out.println("Количество бонусных миль: "); // вывод их количества
        System.out.println(Math.floor (bonusMiles)); // с округлением до меньшей целой
    }
}
