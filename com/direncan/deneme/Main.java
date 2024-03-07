package com.direncan.deneme;

import com.direncan.swingornegi.Pencere;

// import javax.swing.*;

public class Main {

    Pencere pencere = new Pencere();  /*  Hata verdi. Pencere class'ı com.direncan.swingornegi adlı farklı bir package içerisinde.
                                          Bu yüzden bu class'a Pencere class'ını import etmemiz gerekiyor. Alt+Enter ile ettik
                                           Artık yukarıda gözüküyor. */  //  22

    /* JFrame frame = new JFrame();  /*  Burada yine hata aldık. Çünkü javax.swing package'ı içerisinde yer alan JFrame sınıfını
                                      hatta ve hatta * kullanarak tüm swing package'ını Pencere classına dahil etmiştik.
                                      Fakat Pencere class'ını buraya dahil etmiş olmamız, onun içerisine dahil etmiş olduklarımızı
                                      otomatik olarak buraya yine import ediyoruz anlamına gelmiyor. Burada JFrame class'ını
                                      veya onun bağlı olduğu tüm swing package'ını tekrar dahil etmemiz gerekiyor. */  //  23


    /* Son olarak Shift + F10 yaptığımızda main metodu çalışmıyor. Dolayısı ile proje çalışmıyor. Çünkü bu projede swing arayüz
       çalışması yaptığımız için main metodu üzerinde sağ tıklayarak Run File diyoruz ve proje çalışmış oluyor. */  //  24

}
