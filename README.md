# ActivityFragmentLifeCycle



XML olarak eklemek Fragmentların uygulama ayağa kalktığı anda activity den önce çalışmaya başlamasını sağlıyor. Bu performans olarak sürekli gösterilmesi veya yaratılması gereken Fragmentlar için kullanılması gereken bir yöntemdir.

Programatik olarak eklenmesi de activity içinde olmayan ama çalışma zamanında oluşturulup çalıştırılmak istenen fragmentlar kullanılmak istenildiği zaman kullanılması gerekli olan yöntemdir. Çünkü programatik olarak eklenirse önce activity nin ayağa kalkmasını bekler. Sonrasında Fragment oluşturulur ve ayağa kalkar. Bu da performans kaybı olarak değerlendirilebilir.

Fragmentlar Activity içinde kullanılan ama activitylere göre daha performanslı olan yapılardır. Fragmentların kullanılması gereken yerler belirli bölümleri aynı olan ama diğer kısımların değişmesi gereken activity yapıları varsa ve bu yapıların sayısı fazla ise hepsi için activity yerine daha kullanışlı olan Fragment yapısı kullanılır.



