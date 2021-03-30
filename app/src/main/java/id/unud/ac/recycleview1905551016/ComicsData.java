package id.unud.ac.recycleview1905551016;

import java.util.ArrayList;

public class ComicsData {
    private static String[] comicTitle = {
            "How To fight",
            "Nan Yak",
            "Nano Mashin",
            "Reawaken Man",
            "The Boxer",
            "The Gamer",
            "Trikster",
            "Weak Hero"
    };

    private static String[] comicDetail = {
            "Menceritakan Hobin yang selalu dibully di sekolahnya, lalu menemukan channel NewTube yang mengajari tentang bela diri. Bisakah Hobin belajar bela diri dan membuat konten?",
            "Menceritakan pemuda yang selalu bermimpi aneh, selalu memimpikan seorang wanita yang tidak dikenalinya. Setelah sekian lama dia menyadari bahwa ada dunia lain. Apakah wanita tersebut dari dunia lain?",
            "Setelah mengalami cobaan berat pada hidupnya, Tiba tiba Chun yeowun mendapatkan pertolongan tidak terduga dari keturunannya di masa depan yang memasukkan teknologi nano ke dalam tubuhnya! Mampukah Chun Yeowun menjadi master bela diri dengan menggunakan kekuatan nano mashin!?",
            "Perjuangan seorang pemuda pengangguran melindungi wanita murid SMA dari tindakan kekerasan. Masa lalu yang kian menghantuinya membuat dia menemukan misteri tentang dirinya",
            "Menceritakan seorang pemuda yang ingin menjadi seorang petinju profesional dan membuktikan ke teman yang selalu mengejeknya",
            "Menceritakan tentang murid SMA yang menyukai Game sampai dia merasa dunianya seperti di dalam game. Namun ada sebuah kekuatan yang membuatnya memiliki kekuatan di dalam game",
            "Menceritakan Anak pindahan yang menggemparkan seisi kelas dengan trik menyonteknya! Namun di sisi lain ia juga menemukan sesuatu yang janggal di sekolah. Ada apa sebenarnya?",
            "Menceritakan seorang murid SMA yang lemah mengalahkan murid pembully dengan kepintarannya"
    };

    private static int[] comicImage = {
            R.drawable.how_to_fight,
            R.drawable.nan_yak,
            R.drawable.nano_mashin,
            R.drawable.reawaken_man,
            R.drawable.the_boxer,
            R.drawable.the_gamer,
            R.drawable.trikster,
            R.drawable.weak_hero
    };

    static ArrayList<Comic> getListData(){
        ArrayList<Comic> list = new ArrayList<>();
        for (int position = 0; position<comicTitle.length; position++){
            Comic comic = new Comic();
            comic.setName(comicTitle[position]);
            comic.setDetail(comicDetail[position]);
            comic.setPhoto(comicImage[position]);
            list.add(comic);
        }
        return list;
    }
}
