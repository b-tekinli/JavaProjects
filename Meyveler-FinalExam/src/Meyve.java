public abstract class Meyve {
    String name;
    String color;
    double price;

    public void Order() {
        System.out.println("Meyvenin Adı: " + name);
        System.out.println("Meyvenin Rengi: " + color);
        System.out.println("Meyvenin Fiyatı: " + price);
    }
}
