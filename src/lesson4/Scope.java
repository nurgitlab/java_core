package lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000.54;

        if (priceCar > 9000) {
            priceCar*=0.9;
        }

        System.out.println(priceCar);
    }
}
