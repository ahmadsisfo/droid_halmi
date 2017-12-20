package com.sisfo.halmi.soal;

/**
 * Created by inside on 9/10/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sisfo.halmi.R;

import java.util.ArrayList;
import java.util.List;

public class Indra extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis_indra";


    public Indra(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "1.\tJenis indra yang menerima rangsangan (implus) berupa cahaya adalah....");
        values.put("pil_a", "Kulit");
        values.put("pil_b", "Mata");
        values.put("pil_c", "Telinga");
        values.put("pil_d", "Lidah");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "2.\tBagian mata yang berfungsi untuk mengfokuskan bayangan masuk ke mata adalah :");
        values.put("pil_a", "Selaput jala");
        values.put("pil_b", "Kornea");
        values.put("pil_c", "Pupil");
        values.put("pil_d", "Bintik buta");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "3.\tPengertian akomodasi mata yang benar adalah :");
        values.put("pil_a", "Kemampuan mata menagtur agar bayangan jatuh pada retina");
        values.put("pil_b", "Kemampuan mata menagtur agar bayangan jatuh pada bintik buta");
        values.put("pil_c", "Kemampuan mata menagtur besar kecilnya cahaya");
        values.put("pil_d", "Kemampuan mata menagtur agar kornea dapat focus terhadap bayangan");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "4.\tApabila lensa mata terlalu cembung maka bayangan yang diterima jatuh di depan retina.Kelainan mata seperti ini digolongkan pada...");
        values.put("pil_a", "Rabun jauh");
        values.put("pil_b", "Rabun dekat");
        values.put("pil_c", "Mata tua");
        values.put("pil_d", "Katarak");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "5.\tPenyakit rabun senja disebabakan oleh :");
        values.put("pil_a", "Bola mata yabg terlalu panjang");
        values.put("pil_b", "Bola mata yang terlalu pendek");
        values.put("pil_c", "Kekurangan vit A");
        values.put("pil_d", "Keturunan");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "6.\tPenyakit rabun dekat disebabkan oleh :");
        values.put("pil_a", "Bola mata yang terlalu pendek");
        values.put("pil_b", "Bola mata yang telalu panjang");
        values.put("pil_c", "Kekurangan vit A");
        values.put("pil_d", "keturunan");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "7.\tYang termasuk bagian mata kecuali...");
        values.put("pil_a", "Lensa mata");
        values.put("pil_b", "Kornea");
        values.put("pil_c", "Pupil");
        values.put("pil_d", "Selaput gendang");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "8.\tYang tidak termasuk bagian-bagian telinga adalah :");
        values.put("pil_a", "Telinga bagian luar");
        values.put("pil_b", "Telinga bagian dalam");
        values.put("pil_c", "Telinga bagian tengah");
        values.put("pil_d", "Telinga bagian samping");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "9.\tAlat indra yang dapat merasakan suatu aroma yang sedap/tidak sedap adalah :");
        values.put("pil_a", "Mata");
        values.put("pil_b", "Hidung");
        values.put("pil_c", "Telinga");
        values.put("pil_d", "Lidah");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "10.\tApa saja penyakit yang menyerang hidung kecuali...");
        values.put("pil_a", "Parosmia");
        values.put("pil_b", "Anosmia");
        values.put("pil_c", "Amnesia");
        values.put("pil_d", "Influenza");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "11.\tFungsi dari rambut hidung adalah :");
        values.put("pil_a", "Mencegah kotoran masuk");
        values.put("pil_b", "Mencegah udara masuk");
        values.put("pil_c", "Untuk mengirup udara");
        values.put("pil_d", "Tidak berguna");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "12.\tFungsi dari hidung adalah :");
        values.put("pil_a", "Untuk bernafas");
        values.put("pil_b", "Untuk mendengar");
        values.put("pil_c", "Untuk melihat");
        values.put("pil_d", "Untuk menerima rangsangan");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "13.\tBerikut yang merupakan fungsi telinga luar adalah...");
        values.put("pil_a", "memperkuat bunyi");
        values.put("pil_b", "mengkonsentrasikan gelombang suara");
        values.put("pil_c", "mengimbangkan tekanan udara di dalam dan luar telinga");
        values.put("pil_d", "alat keseimbangan selain otak kecil");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "");
        values.put("pil_a", "");
        values.put("pil_b", "");
        values.put("pil_c", "");
        values.put("pil_d", "");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "14.\tTelinga terdiri atas.... bagian");
        values.put("pil_a", "2");
        values.put("pil_b", "3");
        values.put("pil_c", "4");
        values.put("pil_d", "5");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "15.\tFungsi lidah adalah sebagai berikut, kecuali...");
        values.put("pil_a", "membasahi bibir");
        values.put("pil_b", "alat pengecap");
        values.put("pil_c", "menelan makanan");
        values.put("pil_d", "berbicara");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "16.\tBagian lidah yang rasa manis...");
        values.put("pil_a", "Pangkal lidah");
        values.put("pil_b", "Ujung lidah");
        values.put("pil_c", "Samping lidah");
        values.put("pil_d", "Tengah lidah");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "17.\tTonjolan lidah disebut juga...");
        values.put("pil_a", "kuncup pengecap");
        values.put("pil_b", "papila");
        values.put("pil_c", "saraf pengecap");
        values.put("pil_d", "perasa");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "18.\tAlat indra yang dapat merasakan rangsangan adalah :");
        values.put("pil_a", "Kulit");
        values.put("pil_b", "Lidah");
        values.put("pil_c", "Mata");
        values.put("pil_d", "Telinga");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "19.\tPenyakit panu atau kurap disebabkan karena infeksi...");
        values.put("pil_a", "Bakteri");
        values.put("pil_b", "Virus");
        values.put("pil_c", "Jamur");
        values.put("pil_d", "Kuman");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "20.\tpenyakit keturun yang disebabkan tidak adanya pori-pori pada kulit adalah :");
        values.put("pil_a", "Alergi kulit");
        values.put("pil_b", "Albino");
        values.put("pil_c", "Panu");
        values.put("pil_d", "Kudis");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);
    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setPil_d(cursor.getString(5));
                s.setJwban(cursor.getInt(6));
                s.setGambar(cursor.getInt(7));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);
    }

}
