@uyumsoft
  Feature:Uyumsoftta e fatura oluşturma
    Scenario: Kullanıcı Uyumsoftta e fatura oluşturur
      Given Kullanici "uyumsoftUrl" sayfasına gider
      When Kullanıcı uyumsoft için kullanıcı adi ve parola girer
      Then Kullanıcı Oturum Aç butonuna tıklar
      When e-Fatura ve e-Arsiv Fatura düzenlemeye tıkla
      Then e-Fatura ve e-Arsiv Fatura Oluştura tıkla
      Then Alıcı ünvan ile arama yap ve alıcı sec
      Then e-Fatura kayıt butonuna tıkla
      #bu testin devsmı yapılacak


