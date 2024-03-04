
Feature: Kullanıcı Yeni Alış Faturası Ekler
  Scenario: US_01_Yeni Alış Faturası Ekleme
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Alış menusune tıkla
    When Alış Faturalarına tıkla
    Then Yeni Fatura butonuna tıkla
    Then Alış Faturası oluştura tıkla
    When Cari seçimini yap
    Then Fatura no gir
    Then Satır ekle butonuna tıkla
    Then Yeni Alıs Faturası Kaydet butonuna tıklar
    Then Kayıt Basarıyla Kaydedildi yazısını dogrula
