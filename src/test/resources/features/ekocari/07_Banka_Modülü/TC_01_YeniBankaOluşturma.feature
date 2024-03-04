@kasaislemleri
  Feature: Banka İşlemleri

    Scenario: Kullanici Yeni Banka  hesabı oluşturur
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Kullanici banka menusune  tıklar
      Then Kullanici bankalar menusune tıklar
      Then Kullanici Yeni banka olustura tıklar
      When Kullanici banka kodu girer
      When Kullanici banka adı girer
      When Kullanici banka kaydet butonuna tıklar
      Then Kullanici olusturdugu banka hesabını siler
