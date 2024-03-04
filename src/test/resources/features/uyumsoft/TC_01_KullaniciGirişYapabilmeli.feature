
  Feature: Kullanıcı Hesap Bilgilerini Girerek Login Olmalı

    Scenario: Kullanıcı Uyumsoft sayfasına giriş yapar
      Given Kullanici "uyumsoftUrl" sayfasına gider
      When Kullanıcı uyumsoft için kullanıcı adi ve parola girer
      Then Kullanıcı Oturum Aç butonuna tıklar
      #And Sayfayı kapar
