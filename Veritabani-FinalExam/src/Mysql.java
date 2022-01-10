public class Mysql implements IVeritabani {
    @Override
    public void Giris() {
        System.out.println("MySql veritabanına giriş yaptınız.");
    }

    @Override
    public void Ekle() {
        System.out.println("Mysql veritabanına bir veri eklediniz.");
    }

    @Override
    public void Sil() {
        System.out.println("Mysql veritabanından bir veri sildiniz.\n");
    }
}
