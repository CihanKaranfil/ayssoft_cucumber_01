@alacakDekont
  Feature: Cari hareketlerde alacak dekontu olşturma
    Background:Kullanıcı Ekocari sayfasına giris yapar

    Scenario:Kullanıcı Cari hareketlerde borç dekontu oluşturur
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Cari ye tıklar
      Then Kullanici Cari hareketlere tıklar
      Then Kullanici Yeni Cari Hareketlerine tıklar
      Then Kullanici alacak dekontuna tıklar
      When Kullanici fis no girer
      Then Kullanici Cari seçimini yapar
      Then Kullanici Tl Tutar girer
      Then Kullanici Borc Dekontunu kaydeder