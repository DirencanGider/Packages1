/*

Bu classta hoca örnek olsun diye swing ile arayüz yazıyor. Bunu şu ders konumunda bilmek zorunda değiliz. İlerleyen derslerde
öğreneceğiz.  //  12

 */

package com.direncan.swingornegi;

import javax.swing.*;

public class Pencere {

    private JFrame frame;  /*  Yukarıda JFrame'i dahil ettik. Fakat import javax.swing.JFrame şeklinde sadece JFrame
                               class'ını değil de import javax.swing.* şeklinde tüm classları dahil ettik. Bu "*" işaretinin
                               anlamı javax klasörü içerisinde yer alan swing package'ı içerisindeki tüm sınıfları
                               dahil et şeklinde. */  //  13

    public Pencere() {  //  14
        frame = new JFrame();

        JButton button = new JButton("Tıkla");  // Düğmenin içerisindeki metini ekledik. Constructor şeklinde.  //  15

        button.setBounds(130,100,100,40);  //  Düğmenin dört kenarından genişliklerini verdik.  //  16

        frame.add(button);  //  Düğmeyi frame'e ekledik. Frameden kasıt çevçeve sanırım?  //  17

        frame.setSize(400, 500);  //  Muhtemelen çerçevenin sınırlarını belirledik.  //  18

        frame.setLayout(null);  //  19

        frame.setVisible(true); //  Frame görülsün diye true olarak belirledik.  //  20

    }


    /*  Şimdi farklı bir paket olan com.direncan.deneme içerisindeki Main class'ından bu Pencere classını Mainden
        dahil etmeye çalışalım. Main class'ına gidiyoruz */  //  21



}
