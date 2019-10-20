package com.example.cataloguepowerbank.Data;

import com.example.cataloguepowerbank.Model.Powerbank;

import java.util.ArrayList;

public class PowerbankData {

    public static String[][] dataPb = new String[][] {
            {"Anker", "Bila Anda sedang mencari merk power bank terbaik, Anker adalah merk kelas dunia yang patut untuk Anda pertimbangkan. Merk power bank yang dijual di berbagai negara ini menyediakan power bank mulai kapasitas 5.000 mAh sampai dengan 26.800 mAh. Keunggulan dari produk-produk keluaran Anker ini ada pada teknologi PowerIQ yang memastikan pengisian daya baterai perangkat Anda jadi lebih cepat. Meskipun harganya terbilang lebih mahal dibanding merk power bank sejenis lainnya, tetapi kualitas produk dari Anker ini sangat handal dan mampu mengisi daya baterai secara lebih cepat." , "https://carisinyal.com/wp-content/uploads/2016/02/Anker.jpg"},

            {"Xiaomi", "Tak ingin ketinggalan dalam memproduksi power bank, Xiaomi akhirnya turut merilis beberapa produk pengisian daya baterai portable ini. Dibalut dengan material aluminium, power bank keluaran Xiaomi jadi terlihat begitu elegan dan kokoh. \n" +
                    "Power bank Xiaomi turut didukung dengan USB smart-kontrol dan chip charging/discharging dari Texas Instruments. Dengan teknologi ini, maka rangkaian chip akan terlindungi dengan 9 lapis perlindungan. Motherboard dan baterai smartphone akan tetap terlindungi apabila terjadi korsleting pada power bank ini." , "https://carisinyal.com/wp-content/uploads/2016/02/Xiaomi.jpg"},

            {"Aukey", "Satu lagi merk power bank terbaik yang harus Anda pertimbangkan. Adalah Aukey yang merupakan merk power bank internasional yang menghadirkan fitur-fitur menarik. Di antaranya ada fitur Quick Charge untuk mengisi daya baterai smartphone atau table secara lebih cepat." , "https://carisinyal.com/wp-content/uploads/2016/02/Aukey.jpg"},

            {"Vivan", "Vivan menyediakan power bank berkualitas dengan harga terjangkau. Desain dan warna power bank Vivan selalu tampak modern. Selain itu, power bank Vivan menawarkan pengalaman mengisi daya baterai smartphone atau table secara lebih cepat dan aman. Sebagian power bank Vivan menyediakan 2 port yang bisa dipakai untuk mengisi daya baterai smartphone dan yang satunya untuk mengisi daya power bank itu. Meskipun tidak menyediakan power bank dengan kapasitas yang terlalu besar, tetapi brand ini menawarkan power bank dengan kapasitas yang sudah cukup memadai untuk menolong Anda saat kehabisan baterai, yakni mulai dari 5.000 mAh sampai dengan 11.000 mAh saja." , "https://carisinyal.com/wp-content/uploads/2016/02/Vivan.jpg"},

            {"Hippo", "Salah satu merk power bank yang terkenal di Indonesia adalah Hippo. Merk yang satu ini menawarkan power bank dengan desain yang eye-catching. Bahkan, beberapa variannya terbilang unik dalam segi desain, seperti tipe Swift dan Eyes." , "https://carisinyal.com/wp-content/uploads/2016/02/Hippo.jpg"},

            {"Uneed", "Uneed adalah merk power bank yang patut untuk dipertimbangkan. Bagaimana tidak, power bank Uneed yang hanya berkapasitas 5.600 mAh saja bisa dipakai untuk mengisi daya baterai 2-3 kali. Beberapa di antara produk keluaran Uneed justru sudah dilengkapi dengan fitur Quick Charge 3.0 untuk mempercepat proses pengisian daya baterai pada perangkat." , "https://carisinyal.com/wp-content/uploads/2016/02/Uneed.jpg"},

            {"Veger", "Merk power bank asal negeri tirai bambu ini ternyata sangat laris di Tiongkok. Dalam sehari, pabrik Veger bisa memproduksi 20 ribu unit power bank setiap harinya. Tak tanggung-tanggung, kapasitas power bank yang ditawarkan mulai dari 10.000 mAh hingga 25.000 mAh. Dengan kapasitas power bank yang besar, Anda bisa menggunakan power bank seharian untuk mengisi daya 3-5 perangkat dalam sehari. Yang paling penting, harga power bank Veger ini sangat terjangkau. Hanya dengan dana 200 ribu rupiah saja," , "https://carisinyal.com/wp-content/uploads/2016/02/Veger.jpg"},

            {"Hame", "Ketika Anda sedang mencari power bank terbaik dengan desain yang modern, mengapa tak mempertimbangkan untuk membeli power bank Hame? Hame menyediakan produk power bank dalam berbagai tipe dan kapasitas. Akan tetapi, yang menjadi unggulan dan terlaris di pasaran adalah Hame T6." ,"https://carisinyal.com/wp-content/uploads/2016/02/Hame.jpg"},

            {"Delcell", "Siapa bilang Anda harus memiliki dana ratusan ribu agar bisa memiliki power bank yang bagus? Hanya dengan 50 ribu rupiah saja, Anda sudah bisa memperoleh power bank Delcell dengan kapasitas 4.000 mAh. Walaupun kapasitasnya tidak terlalu besar, tetapi power bank ini bisa diandalkan ketika baterai smartphone Anda benar-benar habis. Jika memiliki budget lebih, beli saja Delcell yang menyediakan kapasitas 10.500 mAh agar dapat dipakai sebagai charger sebanyak 4 kali sampai baterai power bank habis." ,"https://carisinyal.com/wp-content/uploads/2016/02/Delcell.jpg"},

            {"Probox", "Bila selama ini Anda mendambakan sebuah power bank dengan tampilan yang unik dan beda dari yang lain, Probox menyediakan power bank yang sesuai dengan keinginan Anda. Merk ini menggagas power bank dengan bentuk kartun kucing atau power bank yang dilengkapi dengan gambar Transformers atau superhero di film Justice League." , "https://carisinyal.com/wp-content/uploads/2016/02/Probox.jpg"},

    };

    public static ArrayList<Powerbank> getListData() {
        ArrayList<Powerbank> list = new ArrayList<>();

        for(String[] row : dataPb) {
            Powerbank powerBank = new Powerbank();

            powerBank.setName(row[0]);
            powerBank.setDescription(row[1]);
            powerBank.setImage(row[2]);

            list.add(powerBank);
        }

        return list;
    }


}
