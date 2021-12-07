public class BursluOgrenciler extends Ogrenciler {
    int bursOrani = 50;
    int bursIndirimi;


    public void DersUcretiHesapla(){
        toplamDersUcreti = birimDersUcreti * krediSayisi;
        bursIndirimi = (toplamDersUcreti * bursOrani) / 100;
        toplamDersUcreti -= bursIndirimi;
        System.out.println("İndirimli ders ücreti: " + toplamDersUcreti);
    }
}
