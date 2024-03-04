
Feature: Kullanıcı Stok Ekler ve Siler
  Background:Kullanıcı Ekocari sayfasına giris yapar
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec

  Scenario:US_01_Kullanıcı Stok Ekler
    Given Kullanici stok menusune tıklar
    When Kullanici stok kartlar a tıklar
    Then Yeni stok butonuna tıklar
    When Stok kodu alanı doldurulur
    Then Stok Adı alanını doldurur
    Then Satış Fiyatı alanını doldurur
    Then Alış Fiyatı alanını doldurur
    Then Yeni stok Kaydet butonuna tıklar
    #kayıt işleminde sıkıntı var tekrar bakılacak

  Scenario:US_02_Kullanıcı Stok Siler
    Given Kullanici stok menusune tıklar
    When Kullanici stok kartlar a tıklar
    #silme işlemini tamamla