public class Kullanici {
    private String kullaniciAdi;   // admin
    private String sifre;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String setKullaniciAdi(String yeniKullaniciAdi) {
        kullaniciAdi = yeniKullaniciAdi;
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public String setSifre(String yeniSifre) {
        if (yeniSifre.length() < 8) {
            System.out.println("En az 8 karakterli şifre belirlemeniz gerekmektedir!\nLütfen tekrar deneyiniz...");
        } else {
            System.out.println("Şifre başarılı!");
            sifre = yeniSifre;
        }
        return sifre;
    }
}
