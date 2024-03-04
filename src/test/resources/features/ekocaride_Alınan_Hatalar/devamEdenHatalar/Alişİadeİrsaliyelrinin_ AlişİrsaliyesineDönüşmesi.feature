
  Feature: Aliş İade İrsaliyelrinin Aliş İrsaliyesine Dönüşmesi
    Scenario: Aliş İade İrsaliyelrinin Aliş İrsaliyesine Dönüşmesi
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Alış menusune tıkla
      Then Alış İrsaliyelerine tıkla
      Then Yeni İrsaliye oluştura tıkla ##burada sıkıntı var
      Then Alış iade İrsaliyesi oluştur
      When Cari seçimini yap
      Then Fatura no gir
      Then Satır ekle butonuna tıkla
      Then Yeni Alıs İrsaliye Kaydet butonuna tıklar



