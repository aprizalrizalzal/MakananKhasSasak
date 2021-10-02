package me.aprizal.makanankhassasak.model;

import java.util.ArrayList;

import me.aprizal.makanankhassasak.R;

public class ListMenu {
    private static final int[] imageMenu = {
            R.drawable.ayam_rarang,
            R.drawable.ayam_taliwang,
            R.drawable.bebalung,
            R.drawable.beberuk_terong,
            R.drawable.kue_bantal,
            R.drawable.kue_cerorot,
            R.drawable.kue_poteng_jaje_tujak,
            R.drawable.nasi_balap_puyung,
            R.drawable.pelecing_kangkung,
            R.drawable.sate_bulayak,
            R.drawable.sate_ikan_tanjung,
            R.drawable.sate_rembiga,
            R.drawable.sayur_ares,
    };
    private static final String[] menuEat = {
            "Ayam Rarang",
            "Ayam Taliwang",
            "Bebalung",
            "Beberuk Terong",
            "Kue Bantal",
            "Kue Cerorot",
            "Kue Poteng Jaje Tujak",
            "Nasi Balap Puyung",
            "Plecing Kangkung",
            "Sate Bulayak",
            "Sate Ikan Tanjung",
            "Sate Rembiga",
            "Sayur Ares"
    };
    private static final String[] detailMenu = {
            "Ayam Rarang merupakan salah satu makanan khas lombok yang paling terkenal, makanan ini menjadi paling favorite diantara lainnya.Indonesia mempunyai potensi wisata yang kaya dan beragam dari ujung barat hingga timurnya. Lombok adalah salah satu surga dunia yang bisa ditemukan di Indonesia. Pulau lombok hampir tak pernah absen dalam daftar kunjungan setiap orang yang merencanakan melakukan perjalanan untuk memanjakan diri dan memadu kasih dengan keindahan alamnya. Selain terkenal dengan wisata alam dan budayanya, Lombok juga dikenal akan masakan khas yang dominan bercita rasa pedas dan berbumbu rempah yang diracik khusus agar menciptakan keunikan khas penduduk Lombok.",
            "Ayam Taliwang sudah pasti makanan khas Lombok yang paling populer. Cobalah ayam Taliwang bakar. Wuiih rasanya pedas maknyus banget. Selain bisa dibakar, ayam Taliwang juga bisa disajikan dengan cara digoreng. Ayam kampung yang dipilih merupakan ayam yang masih muda sehingga dagingnya sangat empuk dan mudah sekali di lepaskan dari tulang-tulangnya. Sensasi makanan pedas memang surganya kuliner di Lombok.",
            "Penamaan bebalung mungkin sudah lekat dengan tulang. Iya, bahan utama kuliner ini adalah tulang iga sapi atau kerbau yang dibumbui dengan cabe rawit, bawang putih, bawang merah, lengkuas dan kunyit ditambahkan juga jahe. Yang paling khas dalam penyajian bebalung adalah taburan bawang gorengnya yang melimpah. Bebalung yang paling populer terletak di Depot Kelebet di belakang kantor Gubernur NTB. Makanan khas Lombok ini mungkin hampir mirip dengan tengkleng namun menggunakan tulang sapi bukan tulang kambing atau domba.",
            "Mungkin ini bisa disebut juga gado-gado Lombok. Kuliner jenis lalapan ini biasanya dipadu padankan saat menikmati Ayam Taliwang. Bahan utamanya memang menggunakan terong ungu yang sudah dipotong-potong dan dicampur dengan tomat serta beberapa bumbu rempah lainnya. Nah, setelah ditambah dan dicampur kemudian terong dan taburan bumbu rempah ini ditambahkan kesegaran air jeruk limau. Rasanya benar-benar gado-gado, pedas, manis, asam dan sangat segar untuk makan siang sekalipun.",
            "Jika selama ini orang mengenal bantal sebagai benda empuk yang digunakan sebagai alas kepala untuk tidur, di Lombok penduduknya mengenal bantal sebagai jajanan yang biasanya dimakan saat berbuka puasa. Bantal adalah makanan khas Lombok Timur berupa kue yang dibuat dari ketan. Jajanan tradisional ini dinamai bantal karena mempunyai bentuk yang mirip dengan bantal tidur [di Jakarta juga banyak ditemui penjual kue bantal]. Warga Lombok biasa membuat kue bantal sebagai menu berbuka puasa atau dijadikan camilan untuk menemani diri saat tadarus Al-Qur’an. Kue bantal dibuat dari ketan yang ditambahi pisang dan kemudian dibungkus untuk dimasak ke dalam panci berisikan air panas.Sebelum dimasak, adonan kue bantal dibentuk menggunakan cetakan dari daun aren yang berbentuk kubus. Seiring pesatnya perkembangan zaman, saat ini kue bantal mulai sulit dijumpai penjualnya di dataran Lombok.",
            "Kue Cerorot atau Clorot adalah jajanan tradisional yang memiliki bentuk menyerupai terompet kecil. Sebenarnya, kue jenis ini juga banyak ditemukan di Jawa Tengah. Namun, satu hal yang membedakan komposisinya adalah daging buah rotan. Sebab, biasanya masyarakat Lombok mencampurkan daging buah rotan ke dalam adonan kue ini. Sementara itu, untuk pembungkusnya menggunakan daun kelapa yang telah dibentuk. Cara makan jajanan yang memiliki cita rasa manis ini terbilang cukup unik, yaitu dengan memencet bagian bawahnya agar isinya terdorong ke luar. Hal inilah yang membuat makanan ini dinamakan sebagai Kue Cerorot.",
            "Makanan khas ini memang hanya muncul saat lebaran. Jadi, rasanya agak sulit menemukannya diluar masa lebaran. Namun sebetulnya kuliner ini cukup familiar kok. Poteng adalah tape ketan dan jaje tujak atau tetel, mungkin lebih familiar dikenal dengan gemblong. Nah, Poteng Jaje Tujak ini diolah dengan campuran daun suji dan pandan. Makanan khas Lombok yang satu ini termasuk langka karena hanya disajikan pada saat hari raya saja.",
            "Sekali mencoba rasanya kalian akan ketagihan untuk mencoba dan mencobanya lagi. Itulah nasi balap puyung. Sekali lagi sensai pedasnya yang menjadikan selera makan bertambah dan ingin nambah. Dengan topping ayam suwir, dipadukan dengan cabai, kacang kedelai, taburan rebon kering, abon dan lauk belut menjadikan paket nasi balap puyung ini juara. Waduh sampe ngiler deh dibuatnya. Air liur kalian bakal bercucuran mengingatnya.",
            "Siapa yang belum tahu plecing kangkung? Makanan khas Lombok ini berupa olahan tanaman air ini begitu populer di setiap rumah makan di Lombok. Rasanya belum ke Lombok jika belum makan kuliner Lombok yang satu ini. Memang tampilannya sederhana, namun rasarnya luar biasa. Paduan cabai rawit, garam, tomat dan terasinya begitu menggetarkan lidah. Setiap orang yang memakannya pasti menangis nikmat karena sensai pedasnya. Plecing kangkung ini jelas sangat sehat dan membantu kesuburan karena ditambahkan tauge dan taburan kacang goreng untuk menambahkan rasa gurihnya.",
            "Mungkin namanya saja yang kurang familiar. Namun, sate bulayak ini hampir sama dengan sate Madura lainnya. Yang membedakan terletak pada lontong yang disajikan. Keunikan sate Bulayak karena lontongnya dibungkus dengan menggunakan daun aren dengan bentuk spiral. Cara membukanya pun unik karena harus mengikuti ulir daun arennya. Satenya menggunakan daging sapi yang sudah dipadukan dengan sambal khas suku Sasak. Kearifan lokal sate Bulayak ini dimakan dengan cara tanpa menggunakan sendok atau garpu. Jadi, pastikan kalian sudah mencuci tangan ya.",
            "Di Lombok Utara terdapat satu kecamatan sekaligus ibu kota kabupaten Lombok Utara bernama Tanjung. Tanjung mempunyai makanan khas berupa sate ikan yang selalu diserbu oleh para pemburu kuliner dari berbagai penjuru kota hingga negeri. Sate tanjung adalah sate yang sudah ada sejak tahun 1977 silam. Penggagas sate tanjung pertama kali adalah ibu Salimah yang menjajakan dagangan satenya di jalan utama Tanjung Lombok Utara. Dari tahun ke tahun sate tanjung ibu Salimah semakin dikenal masyarakat Lombok sehingga pembeli berduyun-duyun datang dari berbagai tempat hanya untuk menikmati satu porsi sate tanjung. Ikan yang dipilih biasanya ikan cakalang dan laguan.",
            "Selain sate bulayak, Lombok juga masih mempunyai kuliner berjenis sate yang dinamai sate rembiga. Rembiga yang tersemat pada urutan akhir dari nama makanan ini merujuk pada nama jalan yang berada di Mataram, Lombok. Salah satu warung sate rembiga yang terkenal adalah milik ibu Sinnaseh yang berlokasi di Jl. Rembiga No. 4, Mataram, Lombok. Warung sate ibu Sinnaseh hampir setiap hari ramai dikunjungi oleh penduduk dan wistawan lokal maupun penduduk asing. Sate rembiga sendiri menjadi kuliner yang mengenalkan kepada semua orang kalau Mataram adalah salah satu daerah yang terkenal akan ternak sapinya yang banyak. Daging yang dipilih untuk sate rembiga adalah daging sapi yang sebelum ditusuk dan dipanggang harus ditumbuk terlebih dahulu agar empuk. Setelah empuk, daging harus direndam ke dalam bumbu-bumbu khusus selama dua jam beru kemudian dibakar. Sate rembiga yang siap santap biasanya disajikan bersama bulayak.",
            "Makanan khas Lombok berbentuk sayuran yang bisa menandingi kelezatan makanan lain berbahan dasar non-sayur lain adalah sayur ares. Apa itu sayur ares? Sayur ares adalah sayuran khas Lombok yang menggunakan bahan dasar bernama ares. Ares sendiri merujuk pada pelepah pisang atau gedebok pisang yang masih muda. Ares yang sudah dipilih kemudian diolah bersama kuah yang terbuat dari santan. Sayur ares mempunyai cita rasa yang gurih dari hasil penggunaan santan yang berpadu dengan bumbu rempah menyerupai kari seperti ketumbar, bawang merah, bawang putih, jahe, kemiri, kunyit, lengkuas, dan jintan. Untuk memperkaya sajian, biasanya masyarakat Lombok menambahkan daging ke dalamnya. Sebagai informasi, sayur ares dahulu menjadi makanan tradisional Suku Sasan [suku mayoritas di Lombok] yang dijadikan hidangan saat acara makan-makan setelah berlangsungnya pernikahan."
    };

    private static final String[] detailLocation = {
            "-8.587442502480734,116.1004767841845",
            "-8.583979653653282,116.11691254231889",
            "-8.579641092018415,116.10938642701753",
            "-8.557332650070924,116.07464328321596",
            "-8.587864618445616,116.11993983478357",
            "-8.587864618445616,116.11993983478357",
            "-8.587864618445616,116.11993983478357",
            "-8.684450559907194,116.2412364850489",
            "-8.70351667778431,116.27301471489298",
            "-8.591430414491889,116.20243279239278",
            "-8.361833757639229,116.14030058893435",
            "-8.562621290612507,116.1144127477878",
            "-8.539038466628137,116.07190960422456"
    };

    public static ArrayList<ModelMenu> getListMenu(){
        ArrayList<ModelMenu> modelMenuArrayList = new ArrayList<>();
        for (int position = 0; position < menuEat.length; position++){
            ModelMenu modelMenu = new ModelMenu();
            modelMenu.setImageMenu(imageMenu[position]);
            modelMenu.setMenuEat(menuEat[position]);
            modelMenu.setDetailMenu(detailMenu[position]);
            modelMenu.setDetailLocation(detailLocation[position]);
            modelMenuArrayList.add(modelMenu);
        }
        return modelMenuArrayList;
    }
}
