# Dosyalar
main.java: Programın kaynak kodunu içeren dosya.
Kart.java: Hafıza oyunu kartları için gerekli sınıfı içeren dosya.
# Kullanım
main.java dosyası çalıştırılarak program başlatılır. Program, kullanıcının girdiği hamlelere göre ilerler ve oyun tahtasını ekrana yazdırır.

# Programın Çalışma Mantığı
Program, bir hafıza oyunu oynamak için tasarlanmıştır. Oyun tahtası, 6x6 boyutlarında ve içinde 36 adet kart bulunan bir matristir. Her kartın üzerinde bir harf bulunur. Oyun, kullanıcının iki kart seçerek bunların eşleşip eşleşmediklerini tahmin etmesi üzerine kuruludur. Kullanıcı, her hamlesinde iki kart seçer. Eğer seçilen iki kartın üzerindeki harfler aynıysa, kartlar açık kalır ve kullanıcı bir sonraki hamlesini yapar. Eğer seçilen iki kartın üzerindeki harfler farklıysa, kartlar kapanır ve kullanıcının bir sonraki hamlesini yapması istenir.

Oyun, kullanıcının tüm kartları doğru şekilde eşleştirdiği zaman sonlanır ve "Oyun Bitti" mesajı ekrana yazdırılır.



