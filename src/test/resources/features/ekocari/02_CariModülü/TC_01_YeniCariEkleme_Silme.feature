@cihan
Feature: Kullanici Cari Ekler ve Cari Siler

  Background:Kullanıcı Ekocari sayfasına giris yapar
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    When Cari ye tıklar
    Then Cari kartlara tıklar

  Scenario:US_01_ Kullanici Yeni Cari Ekler
    Given Yeni Cari butonuna tıklar
    When Cari kodunu gir
    Then Cari adını gir
    Then Kaydet butonuna tıklar
    #dogrulama ekle

  Scenario:US_02_Kullanici Yeni Olusturdugu Cariyi Siler
    Given Cari listesindeki son karta sag tıklar ve siler
    When Kullanici sayfayi kapatir
     #dogrulama ekle






