public class Main {

    public static void main(String[] args) {
        Kullanici k1 = new Kullanici();
        k1.setKullaniciAdi("admin");
        k1.setSifre("1234567890");
        System.out.println("1. kullanıcının adı: " + k1.getKullaniciAdi() + "\n1. kullanıcının şifresi: " + k1.getSifre());

        System.out.println("------------------------");

        Kullanici k2 = new Kullanici();
        k2.setKullaniciAdi("root");
        k2.setSifre("09876");
        System.out.println("2. kullanıcının adı: " + k2.getKullaniciAdi() + "\n2. kullanıcının şifresi: " + k2.getSifre());
    }
}
