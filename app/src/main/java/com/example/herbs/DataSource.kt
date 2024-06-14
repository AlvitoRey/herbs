package com.example.herbs
object DataSource {
    var spices: ArrayList<Spice> = generateDummySpices()

    private fun generateDummySpices(): ArrayList<Spice> {
        val spices: ArrayList<Spice> = ArrayList()
        spices.add(Spice(
            "Jahe",
            "Umbi Umbian",
            "Manfaat :\n" +
                    "1. Mengurangi Reaksi Inflamasi. \n" +
                    "2. Mengendalikan Kadar Gula Darah. \n" +
                    "3. Meredakan Mual.\n" +
                    "\n" +
                    "Diolah menjadi :\n" +
                    "Tim Ayam Jahe\n" +
                    "Ayam Goreng Jahe\n" +
                    "Ginger Lemon Honey Tonic\n" +
                    "Lemon Jahe madu \n" +
                    "Minuman Jahe Susu",
            R.drawable.detail_jahe, R.drawable.item_jahe
        ))
        spices.add(Spice("Lengkuas", "Umbi Umbian", "Manfaat :\n" +
                "1. Meminimalisir radikal bebas.\n" +
                "2. Meningkatkan kesehatan rambut.\n" +
                "3. Lengkuas meningkatkan kesuburan pria.\n" +
                "4. Melindungi dari infeksi. \n" +
                "5. Mengatasi radang sendi.\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Sayur Bayam Lengkuas\n" +
                "Ayam Goreng Laos\n" +
                "Tempe Lengkuas\n" +
                "Cumi Goreng Lengkuas\n" +
                "Dadar Jagung Bumbu Lengkuas", R.drawable.detail_lengkuas, R.drawable.item_lengkuas))
        spices.add(Spice("Daun Salam", "Daun", "Manfaat:\n" +
                "1. Menurunkan kadar kolesterol\n" +
                "2. Meredakan gangguan pencernaan\n" +
                "3. Mengurangi stres\n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Nasi Uduk\n" +
                "Semur\n" +
                "Sop Ayam", R.drawable.detail_daunsalam, R.drawable.item_daunsalam))
        spices.add(Spice("Daun Jeruk", "Daun", "Manfaat:\n" +
                "1. Menyegarkan napas\n" +
                "2. Mengatasi stres\n" +
                "3. Memiliki sifat anti-inflamasi\n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Ayam Penyet\n" +
                "Soto\n" +
                "Nasi Goreng", R.drawable.detail_daunjeruk, R.drawable.item_daunjeruk))
        spices.add(Spice("Ketumbar", "Biji", "Manfaat : \n " +
                "1. Menurunkan kadar kolesterol\n" +
                "2. Meredakan gangguan pencernaan\n" +
                "3. Mengurangi stres\n"+
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Gulai\n" +
                "Sup\n" +
                "Kare\n"
                , R.drawable.detail_ketumbar, R.drawable.item_ketumbar))
        spices.add(Spice("Kencur", "Umbi Umbian", "Manfaat:\n" +
                "Meredakan batuk\n" +
                "Mengatasi peradangan\n" +
                "Meningkatkan nafsu makan\n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Jamu beras kencur\n" +
                "Soto\n" +
                "Pepes", R.drawable.detail_kencur, R.drawable.item_kencur))
        spices.add(Spice("Cengkeh", "Bunga", "Manfaat:\n" +
                "Mengatasi sakit gigi\n" +
                "Memiliki sifat antioksidan\n" +
                "Meredakan mual\n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Rendang\n" +
                "Kari\n" +
                "Minuman hangat (teh atau wedang)", R.drawable.detail_cengkeh, R.drawable.item_cengkeh))
        spices.add(Spice("Kayu Manis", "Batang", "Manfaat :\n" +
                "Menurunkan berat badan.\n" +
                "Baik untuk pengidap diabetes.\n" +
                "Meredakan kram menstruasi.\n" +
                "Meningkatkan kekebalan tubuh.\n" +
                "Mengatasi kista ovarium. \n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Wedang Kopi Kayu Manis\n" +
                "Teh Susu Kayu Manis\n" +
                "Bolu Pisang Kayu Manis\n" +
                "Bajigur Kayu Manis\n" +
                "Pisang Goreng Wijen Kayu Manis", R.drawable.detail_kayumanis, R.drawable.item_kayumanis))
        spices.add(Spice("Andaliman", "Buah", "Manfaat :\n" +
                "Meningkatkan imunitas tubuh. \n" +
                "Mendukung kesehatan tulang. \n" +
                "Menyembuhkan luka. \n" +
                "Mencegah anemia. \n" +
                "Mengatasi sakit gigi. \n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Ayam Masak Andaliman\n" +
                "Mie Gomak Saus Andaliman\n" +
                "Sambel Andaliman\n" +
                "Nasi Goreng Andaliman\n" +
                "Nila Andaliman", R.drawable.detail_andaliman, R.drawable.item_andaliman))
        spices.add(Spice("Kemiri", "Biji", "Manfaat:\n" +
                "Menyehatkan rambut\n" +
                "Meningkatkan fungsi otak\n" +
                "Menurunkan kolesterol\n" +
                "Menjaga kesehatan pencernaan\n" +
                "Meningkatkan daya tahan tubuh\n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Sate\n" +
                "Rendang\n" +
                "Keripik singkong\n" +
                "Ikan goreng", R.drawable.detail_kemiri, R.drawable.item_kemiri))
        spices.add(Spice("Kunyit", "Umbi umbian", "Manfaat :\n" +
                "Mengobati Radang.\n" +
                "Mengatasi Perut yang Kembung.\n" +
                "Mengurangi Nyeri saat Haid.\n" +
                "Obat Alergi. \n" +
                "Menangkal Bakteri Jahat. \n" +
                "\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Teh Kunyit\n" +
                "Nasi Goreng Kunyit\n" +
                "Jamu Kunyit Asam Sirih\n" +
                "Kunyit Asem Jeruk Peres\n" +
                "Es Jahe Kunyit Asem", R.drawable.detail_kunyit,R.drawable.item_kunyit))
        spices.add(Spice("Pala", "Biji", "Manfaat:\n" +
                "Membantu pencernaan\n" +
                "Menurunkan kolesterol\n" +
                "Mengontrol gula darah\n" +
                "Menjaga kesehatan jantung\n" +
                "\n" +
                "Diolah menjadi :\n" +
                "Gulai\n" +
                "Sup\n" +
                "Kare", R.drawable.detail_pala, R.drawable.item_pala))
        return spices
    }

}