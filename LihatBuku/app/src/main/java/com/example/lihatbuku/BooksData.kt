package com.example.lihatbuku

import java.util.ArrayList

object BooksData {
    private val booksNames = arrayOf(
        "Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa",
        "Jangan Membuat Masalah Kecil Jadi Masalah Besar",
        "Terdidik (Educated) - Sebuah Memoar",
        "Filosofi Teras Filsafat Yunani",
        "Guru Aini",
        "Jika Kita Tak Pernah Jadi Apa-Apa",
        "Kamu Terlalu Banyak Bercanda",
        "Berani Tidak Disukai",
        "Loving And Forgiving Yourself",
        "Sapiens Grafis: Kelahiran Umat Manusia",
        "Laskar Pelangi",
        "Sebuah Seni untuk Bersikap Bodo Amat")

    private val booksYear = arrayOf(
        "2019",
        "2019",
        "2021",
        "2008",
        "2020",
        "2019",
        "2019",
        "2019",
        "2021",
        "2021",
        "2005",
        "2016")

    private val booksDetails = arrayOf(
        "Orang mengira ketika Anda ingin mengubah hidup, Anda perlu memikirkan hal-hal besar. Namun pakar kebiasaan terkenal kelas dunia James Clear telah menemukan sebuah cara\nlain. Ia tahu bahwa perubahan nyata berasal dari efek gabungan ratusan keputusan kecil—dari mengerjakan dua push-up sehari, bangun lima menit lebih awal, sampai menahan sebentar hasrat untuk menelepon.\nIa menyebut semua tadi atomic habits.\nDalam buku terobosan ini, Clear pada hakikatnya mengungkapkan bagaimana perubahan-perubahan sangat remeh ini dapat tumbuh menjadi hasil-hasil yang sangat mengubah\nhidup. Ia menyingkap beberapa trik sederhana dalam hidup kita (seni Menumpuk Kebiasaan yang terlupakan, kekuatan tak terduga Aturan Dua Menit, atau trik untuk masuk ke dalam Zona Goldilocks), dan menggali ke dalam teori psikologi dan neurosains paling baru untuk menerangkan mengapa semua itu penting. Dalam rangka itu, ia menceritakan kisah-kisah inspiratif para peraih medali emas Olimpiade, para CEO terkemuka, dan ilmuwan-ilmuwan istimewa yang telah menggunakan sains tentang kebiasaan-kebiasaan kecil untuk tetap produktif, tetap termotivasi, dan bahagia.\n Perubahan-perubahan kecil ini akan mendatangkan pengaruh revolusioner pada karier Anda, hubungan pribadi Anda, dan hidup Anda.",
        "Banyak hal dalam hidup ini yang sebenernya hanya masalah kecil, tapi kita memperlakukannya sebagai masalah besar. Sebenernya, dengan membentuk perspektif baru bahwa masalah-masalah itu memang kecil, kita kan mempunyai lebih banyak waktu untuk memikirkan hal-hal yang benar-benar merupakan masalah besar.",
        "Lahir dari keluarga komunitas penyintas di pegunungan Idaho, Tara Westover berusia tujuh belas tahun saat pertama kali menginjakkan kakinya di ruang kelas. Keluarganya sangat terisolasi dari masyarakat kebanyakan sehingga tidak ada yang memastikan apakah anak-anak mereka mendapatkan pendidikan, dan tidak ada yang turun tangan ketika salah seorang kakak laki-laki Tara melakukan kekerasan. Ketika seorang kakak laki-lakinya yang lain masuk perguruan tinggi, Tara memutuskan mencoba kehidupan baru. Pencariannya akan pengetahuan mengubahnya, membawanya melintasi lautan dan benua, ke Harvard dan Universitas Cambridge. Baru setelah itu dia bertanya-tanya apakah dia telah bepergian terlalu jauh, apakah masih ada jalan pulang. “Memikat dan memberi semangat… Terlepas dari keistimewaan hidup masa kecil Tara, pertanyaan yang diajukan buku ini bersifat universal: Seberapa jauh kita harus memberikan diri kita sendiri kepada orang-orang yang kita cintai? Dan seberapa jauh kita bisa menyangkal mereka agar kita bisa tumbuh dewasa?” --Vogue “Kisah yang luar biasa, dan benar-benar menginspirasi. Bahkan lebih bagus daripada yang Anda dengar.” --Bill Gates “Menyentuh hati… bukti indah akan kekuatan pendidikan untuk membuka mata dan mengubah kehidupan.” --Amy Chua, The New York Times Book Review “Westover membawa pembaca jauh ke dunianya, ke lingkungan yang biasanya tersembunyi dari orang luar.” --The Economist",
        "Lebih dari 2000 tahun lalu, sebuah mazhab filsafat menemukan akar masalah dan juga solusi dari banyak emosi negatif. Stoisisme, atau Filosofi Teras, adalah filsafat Yunani-Romawi kuno yang bisa membantu kita mengatasi emosi negatif dan menghasilkan mental yang tangguh dalam menghadapi naik-turun nya kehidupan.\nJauh dari kesan filsafat sebagai topik berat dan mengawang-awang, Filosofi Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Milenial dan Gen-Z masa kini.",
        "Konon, berdasarkan penelitian antah berantah, umumnya idealisme anak muda yang baru tamat dari perguruan tinggi bertahan paling lama 4 bulan. Setelah itu mereka akan menjadi pengeluh, penggerutu, dan penyalah seperti banyak orang lainnya, lalu secara menyedihkan terseret arus deras sungai besar rutinitas dan basa-basi birokrasi lalu tunduk patuh pada sistem yang buruk.",
        "Kau melihat teman-teman dan mereka sudah mendapatkan impian,\nsementara kau masih termangu menggenggam harapan. Pelan, dalam hati kau berujar, “Kapan mimpiku terwujud?”\nJika Kita Tak Pernah Jadi Apa-Apa\nSelama perjalanan mencapai tujuan, adakalanya kau melihat sekeliling… menakar jauh jangkauan. Atau, kau malah membandingkannya dengan orang lain. Lalu, lupa melanjutkan perjalanan.\nJika Kita Tak Pernah Jadi Apa-Apa\nBenarkah segala usaha dan upayamu selama ini lebur bersama kecewa yang kau bangun sendiri? Sungguhkah sesuatu yang hanya kau lihat dalam dunia maya menjadikanmu merasa bukan apa-apa?\nJika Kita Tak Pernah Jadi Apa-Apa akan menemanimu selama\nperjalanan. Buku ini untukmu yang khawatir tentang masa depan. Tenang saja, kau tidak sedang diburu waktu. Bacalah tiap lembarnya dengan penuh kesadaran bahwa hidup adalah tentang sebaik-baiknya berusaha, jatuh lalu bangun lagi, dan tidak berhenti percaya bahwa segala perjuanganmu tidak akan sia-sia. Bukankah sebaiknya apa-apa yang fana tidak selayaknya membuatmu kecewa?",
        "Kamu Terlalu Banyak Bercanda atau KTBB adalah novel karya Marchella FP yang merupakan seri dari buku Nanti Kita Cerita tentang Hari Ini. Tokohnya masih sama dengan buku sebelumnya, Nanti Kita Cerita tentang Hari Ini, Awan.",
        "Berani Tidak Disukai menyajikan jawabannya secara sederhana dan langsung. Berdasarkan teori Alfred Adler, satu dari tiga psikolog terkemuka abad kesembilan belas selain Freud dan Jung, buku ini mengikuti percakapan yang menggugah antara seorang filsuf dan seorang pemuda. Dalam lima percakapan yang terjalin, sang filsuf membantu muridnya memahami bagaimana masing-masing dari kita mampu menentukan arah hidup kita, bebas dari belenggu trauma masa lalu dan beban ekspektasi orang lain.",
        "Kamu pernah menyesal, begitu pula saya. Rasanya dalam hidup kita tidak pernah luput dari sasaran amuk penyesalan, Bagaimana caranya mengatasi kegagapan diri menghadapi penyesalan? Mengapa mencintai orang lain terlihat begitu mudah, tetapi mencintai diri sendiri justru begitu rumit. Kita bisa memegang konsep Forgiving and loving Yourself dengan baik,",
        "Adaptasi grafis salah satu buku sejarah populer paling berpengaruh di dunia, Sapiens. Bagaimana cara Homo sapiens berkembang menjadi penguasa planet Bumi, mampu melakukan berbagai hal luar biasa seperti membelah atom, terbang ke Bulan, dan merekayasa genetika kehidupan? Untuk mengetahuinya, kita harus melihat gambaran besar: keseluruhan sejarah spesies manusia. Ahli sejarah Yuval Noah Harari bercerita mengenai kelahiran dan evolusi umat manusia, menjelajahi bagaimana biologi dan sejarah membentuk kita dan mempertinggi pemahaman kita mengenai apa artinya menjadi “manusia”. Adaptasi grafis ini menyajikan kembali dan memperluas isi edisi asli Sapiens, dalam format komik yang menarik, kocak, dan enak disimak.",
        "Begitu banyak hal menakjubkan yang terjadi dalam masa kecil para anggota Laskar Pelangi. Sebelas orang anak Melayu Belitong yang luar biasa ini tak menyerah walau keadaan tak bersimpati pada mereka. Tengoklah Lintang, seorang kuli kopra cilik yang genius dan dengan senang hati bersepeda 80 kilometer pulang pergi untuk memuaskan dahaganya akan ilmubahkan terkadang hanya untuk menyanyikan Padamu Negeri di akhir jam sekolah. Atau Mahar, seorang pesuruh tukang parut kelapa sekaligus seniman dadakan yang imajinatif, tak logis, kreatif, dan sering diremehkan sahabat-sahabatnya, namun berhasil mengangkat derajat sekolah kampung mereka dalam karnaval 17 Agustus. Dan juga sembilan orang Laskar Pelangi lain yang begitu bersemangat dalam menjalani hidup dan berjuang meraih cita-cita.",
        "Buku ini tidak berbicara bagaimana cara meringankan masalah atau rasa sakit. Bukan juga panduan untuk mencapai sesuatu. Namun, sebaliknya buku ini akan mengubah rasa sakit menjadi kekuatan, dan mengubah masalah menjadi masalah yang lebih baik. Khususnya, buku ini akan mengajari untuk peduli lebih sedikit.")

    private val booksAuthor = arrayOf(
        "James Clear",
        "Richard Carlson",
        "Tara Westover",
        "Henry Manampiring",
        "Andrea Hirata",
        "Alvi Syahrin",
        "Marchella Fp",
        "Ichiro Kishimi Dan Fumitake Koga",
        "Soepomo",
        "Yuval Noah Harari",
        "Andrea Hirata",
        "Mark Manson")

    private val booksPenerbit = arrayOf(
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Gramedia Pustaka Utama",
        "Penebit Buku Kompas",
        "Bentang Pustaka",
        "GAGASMEDIA",
        "Pt Kebahagiaan Itu Sederhana",
        "Gramedia Pustaka Utama",
        "C-Klik Media",
        "Kepustakaan Populer Gramedia",
        "Bentang Pustaka",
        "Grasindo")

    private val booksImages = intArrayOf(
        R.drawable.atomic_habits,
        R.drawable.jangan_membuat,
        R.drawable.educated,
        R.drawable.filosofi_teras,
        R.drawable.guru_aini,
        R.drawable.jika_kita_tak_pernah_jadi,
        R.drawable.kamu_terlalu_banyak_bercanda,
        R.drawable.berani_tidak_disukai,
        R.drawable.loving_forgiv,
        R.drawable.sapiens,
        R.drawable.laskar_pelangi_sampul,
        R.drawable.sebuah_seni)

    val listData: ArrayList<BookItem>
        get() {
            val list = arrayListOf<BookItem>()
            for (position in booksNames.indices) {
                val book = BookItem()
                book.name = booksNames[position]
                book.year = booksYear[position]
                book.detail = booksDetails[position]
                book.author = booksAuthor[position]
                book.penerbit = booksPenerbit[position]
                book.photo = booksImages[position]
                list.add(book)
            }
            return list
        }
}