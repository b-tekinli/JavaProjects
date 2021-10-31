interface Hayvan {
    public void HayvanSesi();
    public void Kos();
}


interface Canli {
    public void NefesAl();
}


class Kedi implements Hayvan {
    @Override
    public void HayvanSesi() {
        System.out.println("Kedi miyav der.");
    }

    @Override
    public void Kos() {
        System.out.println("Kedi koşuyor.");
    }
}


class Kopek implements Hayvan, Canli {

    @Override
    public void HayvanSesi() {
        System.out.println("Köpek hav der.");
    }

    @Override
    public void Kos() {
        System.out.println("Köpek koşuyor.");
    }

    @Override
    public void NefesAl() {
        System.out.println("Köpek nefes alıyor.");
    }
}


public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.HayvanSesi();
        kedi.Kos();

        Kopek kopek = new Kopek();
        kopek.HayvanSesi();
        kopek.Kos();
        kopek.NefesAl();
    }
}
