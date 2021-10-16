public class Bisiklet {
    int hiz = 10;
    int vites = 1;


    void VitesDegistir(int deger) {
        if (deger > vites) HizArttir();
        vites = deger;
    }

    void HizArttir() {
        hiz +=5;
    }
}
