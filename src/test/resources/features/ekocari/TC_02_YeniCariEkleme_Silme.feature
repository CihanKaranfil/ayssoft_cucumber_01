Feature: Kullanici Cari Ekler ve Cari Siler

  Scenario: Kullanici Yeni Cari Ekler ve Olusturulan Cariyi Siler
    Given Kullanici "pageUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Cari ye tıkla


