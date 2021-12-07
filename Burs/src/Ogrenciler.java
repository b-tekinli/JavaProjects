public class Ogrenciler {
    public int krediSayisi = 6;
    public int toplamDersUcreti;
    public int birimDersUcreti = 60;

    public void DersUcretiHesapla(){
        toplamDersUcreti = birimDersUcreti * krediSayisi;
        System.out.println("Toplam ders ücreti: " + toplamDersUcreti);
    }
}
