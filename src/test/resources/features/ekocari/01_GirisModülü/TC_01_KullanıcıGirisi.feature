@cihan
Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı

  Scenario: Kullanıcı Ekocari sayfasına giriş yapar
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Sayfaya giris yapıldığı doğrulanır
    And  Kullanici sayfayi kapatir