public class Oracle implements IVeritabani{
    @Override
    public void Giris() {
        System.out.println("Oracle veritabanına giriş yaptınız.");
    }

    @Override
    public void Ekle() {
        System.out.println("Oracle veritabanına bir veri eklediniz.");
    }

    @Override
    public void Sil() {
        System.out.println("Oracle veritabanından bir veri sildiniz.");
    }
}
