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

public class Hormon extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis_hormon";


    public Hormon(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();

        values.put("soal", "1.\tHormon berfungsi untuk ...");
        values.put("pil_a", "Mengatur alat-alat tubuh");
        values.put("pil_b", "Mengatur sistem sekresi");
        values.put("pil_c", "Mengatur sistem pencernaan");
        values.put("pil_d", "Mengatur sistem pengeluaran");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "2.\tDi bawah ini merupakan kelenjar endokrin, kecuali kelenjar ...");
        values.put("pil_a", "Gondok");
        values.put("pil_b", "Kelamin");
        values.put("pil_c", "Anak Ginjal");
        values.put("pil_d", "Keringat");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "3.\tKelenjar endokrin (kelenjar buntu) termasuk kelenjar yang ...");
        values.put("pil_a", "Tidak mempunyai saluran dan menghasilkan hormon");
        values.put("pil_b", "Tidak mempunyai saluran dan mengahsilkan enzim");
        values.put("pil_c", "Mempunyai saluran dan menghasilkan hormon");
        values.put("pil_d", "Getahnya masuk ke saluran makanan");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "4.\tHormon merupakan zat kimia yang penting bagi tubuh, hormon dihasilkan oleh kelenjar ...");
        values.put("pil_a", "Gondok");
        values.put("pil_b", "Buntu");
        values.put("pil_c", "Endokrin");
        values.put("pil_d", "Pankreas");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "5.\tPada kelenjar endokrin, terdapat kelenjar hormon, yaitu ...");
        values.put("pil_a", "Kelenjar hipofisisi, kelenjar buntu");
        values.put("pil_b", "Kelenjar hipofisis, gondok, pankreas, kelenjar anak ginjal, kelenjar usus, kelenjar lambung, kelenjar kelamin");
        values.put("pil_c", "Kelenjar ginjal, usus, kelamin, otak, pankreas");
        values.put("pil_d", "Kelenjar kelamin, hipofisis, gondok, usus, ginjal");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "6.\tNama lain kelenjar hipofisis yaitu ...");
        values.put("pil_a", "Kelenjar gondok");
        values.put("pil_b", "Kelenjar usus");
        values.put("pil_c", "Kelenjar tiroid");
        values.put("pil_d", "Master gland");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "7.\tNama lain kelenjar endokrin ialah ...");
        values.put("pil_a", "Kelenjar buntu");
        values.put("pil_b", "Kelenjar usus");
        values.put("pil_c", "Kelenjar tiroid");
        values.put("pil_d", "Kelenjar gondok");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "8.\tTerletak di lekungan tulang sela turiska dibagian tengah tulang baji, merupakan letak kelenjar ...");
        values.put("pil_a", "Kelenjar buntu");
        values.put("pil_b", "Kelenjar tiroid");
        values.put("pil_c", "Kelenjar hipofisis");
        values.put("pil_d", "Kelenjar gondok");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "9.\tDi bawah ini, hormon yang dihasilkan oleh kelenjar hipofisis adalah ...");
        values.put("pil_a", "Hormon tiroksin");
        values.put("pil_b", "Hormon insulin");
        values.put("pil_c", "Hormon yang merangsang pembentukan sperma");
        values.put("pil_d", "Hormon kortison");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);


        values.put("soal", "10.\tKelenjar gondok menghasilkan ...");
        values.put("pil_a", "Hormon insulin");
        values.put("pil_b", "Hormon tiroksin");
        values.put("pil_c", "Hormin hipofisis");
        values.put("pil_d", "Hormon deoksikortison");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "11.\tFungsi hormon tiroksin adalah untuk ...");
        values.put("pil_a", "Mengatur pertumbuhan ciri kelamin sekunder wanita");
        values.put("pil_b", "Mengatur hormon tiroksin dalam darah");
        values.put("pil_c", "Meningkatkan metabolisme energi");
        values.put("pil_d", "Merangsang pengubahan glikogen menjadi glukosa");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "12.\tFungsi hormon kalsitonin yaitu ...");
        values.put("pil_a", "Mencegah pengeroposan tullang dan menurunkan kadar kalsium dalam plasma darah");
        values.put("pil_b", "Meningkatkan metabolisme energi");
        values.put("pil_c", "Mengatur pertumbuhan ciri kelamin sekunder wanita");
        values.put("pil_d", "Mengatur hormon tiroksin dalam darah");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "13.\tApabila kekurangan hormon tiroid pada waktu muda tidak berfungsi tidak baik, maka akan mengakibatkan gejala ...");
        values.put("pil_a", "Gigantisme");
        values.put("pil_b", "Adenoid");
        values.put("pil_c", "Kretinisme");
        values.put("pil_d", "Akromegali");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "14.\tInsulin dihasilkan oleh kelenjar endokrin ...");
        values.put("pil_a", "Anak gondok");
        values.put("pil_b", "Anak ginjal");
        values.put("pil_c", "Kacangan");
        values.put("pil_d", "Pulau-pulau langerhans");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "15.\tHormon insulin berfungsi mengatur ...");
        values.put("pil_a", "Kadar gula dalam darah");
        values.put("pil_b", "Penyimpanan gula dalam darah");
        values.put("pil_c", "Kadar gula dalam ginjal");
        values.put("pil_d", "Penyimpanan gula dalam ginjal");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "16.\tHormon kalsitonin dan parathormon berfingsi mengatur");
        values.put("pil_a", "Kadar gula dalam darah");
        values.put("pil_b", "Penyimpanan gula dalam darah");
        values.put("pil_c", "Kadar gula dalam ginjal");
        values.put("pil_d", "metebolisme kalsium dalam tubuh");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "17.\tKretinisme adalah pertumbuhan kerdil dan kemunduran mental yang disebabkan oleh kekurangan hormon ...");
        values.put("pil_a", "Adrenalin");
        values.put("pil_b", "Insulin");
        values.put("pil_c", "Tiroksin");
        values.put("pil_d", "Estrogen");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "18.\tturunnya kadar kapur dalam darah akibat kekurangan parathormon, memiliki gejala kejang otot, gelisah, dan kesemutan merupakan gejala penyakit");
        values.put("pil_a", "Albino");
        values.put("pil_b", "Akromegali");
        values.put("pil_c", "Tetani");
        values.put("pil_d", "Gastrinoma");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "19.\tKelenjar gonad dalam testis menghasilkan hormon ...");
        values.put("pil_a", "Adrenalin");
        values.put("pil_b", "Estrogen");
        values.put("pil_c", "Testoteron");
        values.put("pil_d", "Insulin");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "20.\tHormon adrenalin berperan dalam beberapa hal, antara lain ...");
        values.put("pil_a", "Memperlebar jalan udara dan meningkatkan glukosa");
        values.put("pil_b", "Meningkatkan kadar glukosa dan mempercepat denyut jantung");
        values.put("pil_c", "Mengendalikan laju produksi energi dan reaksi di dalam sel");
        values.put("pil_d", "Mengatur pertumbuhan dan mempengaruhi tanda-tanda kelamin sekunder");
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
