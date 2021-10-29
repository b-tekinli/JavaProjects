class Universite {
    String universiteAdi;
    int x = 10;

    class Fakulte {
        int x = 5;
        String fakulteAdi;
        void XDondur(int x) {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Universite.this.x);
        }
    }

    class MYO {
        String myoAdi;
    }
}


public class Main {
    public static void main(String[] args) {
        Universite universite = new Universite();
        Universite.Fakulte fakulte = universite.new Fakulte();
        fakulte.fakulteAdi = "Mühendislik Fakültesi";
        System.out.println(fakulte.fakulteAdi);

        /*Universite.Fakulte fakulte = new Universite.Fakulte();
        fakulte.fakulteAdi = "Hukuk Fakültesi";
        System.out.println(fakulte.fakulteAdi);*/


    }
}
