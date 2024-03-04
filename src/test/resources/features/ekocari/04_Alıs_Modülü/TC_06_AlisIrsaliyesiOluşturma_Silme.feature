@alisirsaliye
  Feature:Alis İrsaliyesi Oluşturma ve Silme
    Scenario: Kullanici Alis İrsaliyesi Oluşturur ve Siler
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      Then Alış menusune tıkla
      Then Alış İrsaliyelerine tıkla
      When Yeni İrsaliye oluştura tıkla
      Then Yeni Alıs İrsaliyesi ne tıkla
      Then Cari seçimini yap yeni irsaliyede
      Then Fatura no gir
      Then Satır ekle butonuna tıkla
      Then Yeni Alıs İrsaliye Kaydet butonuna tıklar
      #silme işleminde oluşan irsaliyeyi silemiyoruz

      When Kullanici olusturdugu irsliyeye sag tıklar
      Then kullanici olusturdugu irsaliyeyi siler


