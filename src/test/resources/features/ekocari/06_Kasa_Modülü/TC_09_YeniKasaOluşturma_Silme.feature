@kasaişlemleri
Feature: Kullanıcı yeni kasa oluştutrur ve oluşturdugu kasayı siler
  Scenario: Kullanıcı yeni kasa oluştutrur ve oluşturdugu kasayı siler
    Given Kullanici "ekocariUrl" sayfasına gider
    When Kullanici e pota ve sifre girer
    Then Kullanici giris butonuna tiklar
    Then Firmalar bolumunden firma sec
    #Kasa oluşturma
    When Kullanici kasa menusune tıklar
    Then Kullanici kasa listedine tıklar
    Then Kullanici Yeni Kasa butonuna tıklar
    When Kullanici kasa kodunu girer
    Then Kullanici kasa adını girer
    Then Kullanici yeni kasa kaydete tıklar
    And Kullanici yeni kasanın oluştugunu dogrular
    # Kasa silme
    When Kullanici oluşturdugu kasaya sag clik yapar
    Then Kullanici sil iconuna tıklar ve kasayı siler
    And Sayfayı kapar



