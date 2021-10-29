abstract class Hayvan {
    public abstract void HayvanSesi();

    public void Uyku() {
        System.out.println("ZzZ...");
    }
}

class Kedi extends Hayvan {
    public void HayvanSesi() {
        System.out.println("Kedi miyavlar.");
    }
}

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.HayvanSesi();
        kedi.Uyku();
    }
}
