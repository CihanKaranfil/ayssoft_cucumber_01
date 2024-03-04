@virmanfisi
  Feature: Cariye Virman Fişi Oluşturma
    Scenario: Kullanici cariye virman fisi olusturur
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Cari ye tıklar
      Then Kullanici Cari hareketlere tıklar
      Then Kullanici Yeni Cari Hareketlerine tıklar
      Then Kullanici yeni virman fisi olustura tıklar
      When Kullanici fis no girer
      Then Kullanici borclu cari secer
      Then Kullanici alacakli cari secer
      Then Kullanici Tl Tutar girer
      Then Kullanici virman kaydet butonuna tıklar
