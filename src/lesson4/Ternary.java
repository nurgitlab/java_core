package lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100, breadPrice = 20;

        System.out.println(money - breadPrice * 5 > 50 ? "Получили 10 рублей" : "Нищий ребенок");
    }
}
