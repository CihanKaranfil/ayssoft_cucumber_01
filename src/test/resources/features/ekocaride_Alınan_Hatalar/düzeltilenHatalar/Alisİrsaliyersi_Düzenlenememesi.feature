
  Feature: Alış irsaliyelerinin düzenlenememesi
    Scenario:  Alış irsaliyelerinin düzenlenememesi
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Alış menusune tıkla
      Then Alış İrsaliyelerine tıkla
      Then Alış irsaliyesine sağ tıklar inceler
      Then Düzenle Butonuna tıkla
      And Yeni Alıs İrsaliye Kaydet butonuna tıklar
      And Kayıt Basarıyla Kaydedildi yazısını dogrula
      ##burdaki hata düzeldi

