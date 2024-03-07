import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.Node;  //  6
/* import javax.xml.soap.Node;  /* Aynı Node isimli bir Node sınıfını başka bir paketten dahil ettiğimizde çakışma yaşadık.
                                Burada problem yaşamamak adına Main metodu içerisinde obje oluşturacağımız sınıfı direkt
                                aynı satırda import etmiş olacağız.*/  //  7


public class Main {

    Scanner scanner = new Scanner(System.in); /* Scanner sınıfı, JDK ile gelen bir paketin içerisinde olduğu için
                                                 bize hata veriyor. Scanner sınıfını buraya import edersek / dahil edersek
                                                 problem ortadan kalkmış olacak. */  //  1

    ArrayList<String> arraylist = new ArrayList<String>(); /// Aynı durum Scanner gibi ArrayListler için de geçerli.  //  2

    /* JDK ile gelen paketlerin(package) yerini bulmak için IDE'nin sol tarafında yer alan sidebar'a bakmamız gerekiyor.
       Sidebar üzerinde Projemizin dosyalarının bitiminde, alt kısmında yer alan External Libraries>openjdk-21>java.base>java
        yolunu izlememiz gerekiyor. Birçok farklı class bu dosyalar içerisinde yer alıyor.*/  //  3

    // Şimdi de package'lar içerisindeki sınıfların çakışma durumunu kontrol edelim.  //  4

    Node node1 = null;  //  Bu şekilde yine bir hata aldık ve import etmemizgerekti yeniden.  //  5

    org.w3c.dom.Node node2 = null;  /*  Javanın çakışmadan dolayı problem çıkarmaması adına, farklı bir pakette bulunan
                                        aynı isimli Node sınıfını tanımlarken direkt olarak package yolunu da yazdık. Bir
                                        nevi import işlemi gerçekleştirmiş olduk. Yani bu şekilde de sınıfı, paket ismini
                                        de söleyerek direkt hedef göstererek dahil etmiş oluyoruz. Java da bu şekilde
                                        anladığından dolayı problem çıkartmıyor. */  //  8

    // İlk oluşturmuş olduğumuz node1 referansını, direkt olarak "org.w3c.dom.Node node1 = null;" şeklinde de oluşturabilirdik. */  //  9

    /*  Özellikle büyük projelerde çalışırken aynı isimli sınıf çakışmalarını önlemek açısından farklı packageler kullanmak
        oldukça önemli bir role sahip oluyor. */  //  10

    /*

    Peki kendi projelerimiz içerisinde kendi paketimizi/paketlerimizi nasıl oluşturacağız?

    Cevabı oldukça basit;

    Bu Packages1 projesinin üzerine sağ tıklayarak New > Package diyoruz.

    Sonrasında sırasıyla com.direncan.swingornegi ve com.direncan.deneme adında iki adet paket oluşturuyoruz.

    Sidebarı kontrol ettiğimizde Projemizin içerisinde com.direncan adında bir dosya, bu dosya içerisinde de
    deneme ve swingornegi adında iki dosyanın (paketin) oluşturulmuş olduğunu gözlemliyoruz.

    Sonrasında deneme package'ının üzerine sağ tıklayarak New > Java Class diyoruz. Her ikisine de Main adında class oluşturuyoruz.

    Sonrasında da com.direncan.swingornegi adlı packae'ın içerisinde Pencere adında bir Java Class oluşturuyoruz.

     */  //  11














}
