
  Feature: Dövizli Satıs Faturalarında açıklama bolumunun bos olması
    Scenario: Dövizli Satıs Faturalarında açıklama bolumunun gelmemesi
      Given Kullanici "ekocariUrl" sayfasına gider
      When Kullanici e pota ve sifre girer
      Then Kullanici giris butonuna tiklar
      Then Firmalar bolumunden firma sec
      Then Kullanici satis menusune tıklar
      Then Kullanici Satıs Faturaları na tıklar
      When Yeni Fatura butonuna tıkla
      Then Yeni Satıs Faturasına tıklar
      When Cari seçimini yap
      Then Fatura no gir
      Then Para birimini döviz olarak belirle
      Then Satır ekle butonuna tıkla
      And Kaydet butonuna tıklar
      When Kayıt edilen son fatura da incele iconu tıklanır
      Then eBelge butonuna tıkla
      Then eBelge goruntuleye tıkla
      Then eBelge acıklama bolumundeki acıklama kontrol edilir

