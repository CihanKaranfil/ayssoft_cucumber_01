Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı
@cihan
  Scenario: Kullanıcı Ekocari sayfasına giriş yapar
    Given Kullanici "pageUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Sayfaya giris yapıldığı doğrulanır
    And  Kullanici sayfayi kapatir