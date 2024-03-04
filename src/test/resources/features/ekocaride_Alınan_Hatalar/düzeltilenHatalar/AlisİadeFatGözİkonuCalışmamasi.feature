@hatalar
  Feature:Alis İade Faturasındaki İncele İkonun Çalışmaması
    Scenario: Alis İade Faturasındaki İncele İkonun Çalışmaması
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      When Alış menusune tıkla
      Then Alış Faturalarına tıkla
      And Alış İade Faturasındaki göz iconuna tıklar
      And Sayfayı kapar