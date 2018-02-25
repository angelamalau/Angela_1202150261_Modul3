package com.example.android.angela_1202150261_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by angelamalau on 24/02/18.
 */

//Class ini untuk mengatur data ditampilkan
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListMerek, arrayListKet;
    private ArrayList<Integer> arrayListGambar;

    //membuat konstruktor pada RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListMerek = arrayListTitle;
        this.arrayListKet = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }


    public class ViewHolder extends RecyclerView.ViewHolder { //ViewHolder berfungsi untuk menyimpan referensi dari view-view
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);

            //inisialisasi View-View untuk yang digunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //membuat view untuk memnyiapkan layout yang akan digunakan RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_merk, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, final int position) {

        //memanggil nilai pada view yang sudah dibuat
        final String title = arrayListMerek.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListKet.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Title.setText(title);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Desc.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan

        //eksekusi ketika diklik
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menghubungkan konten ke detailActivity dengan menggunakan intent
                Intent intent = new Intent(v.getContext(), detailActivity.class);

                //ringkasan yang akan muncul
                String ringkasan =
                        "   Kemunculan AMDK pertama di Indonesia tidak lepas dari sejarah produk bermerek Aqua. Sebab Aqua menjadi produk AMDK pertama yang diproduksi di Indonesia.\n" +
                        "   Pencetus idenya adalah Tirto Utomo, warga asli Wonosobo yang pernah bekerja untuk Pertamina. Saat itu, dia kerap kesulitan untuk mencari air minum untuk para tamu dari luar negeri. Karena itu, dia pun berinisitif mendidikan perusahaan air minum kemasan.\n" +
                        "   Secara resmi, Aqua diproduksi pertama kali pada tahun 1973 di bawah bendera PT Aqua Golden Mississippi. Pada awal diproduksi, produk air minum kemasan itu diberi nama “Puritas”. Namun karena penyebutannya yang sulit dan tidak familiar, brand “Puritas” pun diganti dengan “Aqua”. Brand Puritas hanya bertahan 2 tahun.\n" +
                        "   Air minum kemasan dalam botol plastik pun menjamur bak cendawan di musim hujan. Hampir di setiap toko dan minimarket memajang AMDK dari berbagai merek dan harga yang bersaing. Membelinya pun tidak lagi semahal dulu. Sekarang, harganya hampir sepadan dengan setengah harga bensin.\n";

                //membuat posisi sesuai dengan urutannya
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListMerek.get(position));
                        intent.putExtra("desc", arrayListKet.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("ringkasan", ringkasan);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListMerek.size();
    }
}
