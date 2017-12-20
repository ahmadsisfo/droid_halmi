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

public class Saraf extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis_saraf";


    public Saraf(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "1.\tsistem yang mengatur dan mengendalikan semua aktivitas manusia seperti berjalan, menggerakkan tangan, mengunyah makanan dan lain sebagainya");
        values.put("pil_a", "Sistem hormon");
        values.put("pil_b", "Sistem saraf");
        values.put("pil_c", "Sistem gerak");
        values.put("pil_d", "Sistem pencernaan");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "2.\tSistem saraf sebagai sistem koordinasi mempunyai fungsi, kecuali: ");
        values.put("pil_a", "Pengatur atau pengendali kerja organ tubuh");
        values.put("pil_b", "Pusat pengendali tanggapan");
        values.put("pil_c", "Alat komunikasi dengan dunia luar");
        values.put("pil_d", "sember alat informasi");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "3.\tBagian otak yang mempunyai fungsi untuk mengatur penglihatan yaitu ...");
        values.put("pil_a", "Lobus frontalis");
        values.put("pil_b", "Lobus parietalis");
        values.put("pil_c", "Lobus temporalis");
        values.put("pil_d", "Lobus oksipitalis");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "4.\tSitem saraftepi terdiri dari…");
        values.put("pil_a", "Cranial dan spinal");
        values.put("pil_b", "Cranial dan otak");
        values.put("pil_c", "Spinal dan sumsum tulang belakang");
        values.put("pil_d", "Otak dan sumsum tulang belakang");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "5.\tYang berfungsi menghantarkan rangsang menuju sinapsis, dan diselubungi myelin");
        values.put("pil_a", "Dendrit");
        values.put("pil_b", "Badan sel");
        values.put("pil_c", "Akson");
        values.put("pil_d", "Sel schawan");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "6.\tNeuron sensorik, yaitu neuron yang berfungsi sebagai ");
        values.put("pil_a", "menghantarkan rangsangan dari reseptor (penerima rangsangan) ke sumsum tulang belakang");
        values.put("pil_b", "penghubung sel saraf yang satu dengan sel saraf yang lain");
        values.put("pil_c", "penghubung abtar sel saraf sejenisnya ");
        values.put("pil_d", "membawa respon dari susunan saraf pusat ke efektor ");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "7.\tUji refleks kerap kali dilakukan dengan cara memukulkan benda lunak secara perlahan ke bagian bawah tempurung lutut sehingga tungkai bawah penderita bergerak ke depan secara tidak sadar. Lengkung refleks yang menghasilkan gerakan tersebut memiliki jalur sebagai berikut ...");
        values.put("pil_a", "Lutut – saraf sensorik – saraf konektor – saraf motorik – kaki");
        values.put("pil_b", "Lutut – saraf motorik – sumsum tulang belakang – saraf sensorik – kaki");
        values.put("pil_c", "Lutut – saraf sensorik – otak – saraf motorik – kaki");
        values.put("pil_d", "Lutut – saraf sensorik – sumsum tulang belakang – saraf motorik – kaki");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "8.\tSistem saraf pusat terdiri dari ...");
        values.put("pil_a", "Otak dan sumsum tulang belakang");
        values.put("pil_b", "Saraf simpatik dan saraf parasimpatetik");
        values.put("pil_c", "Otak dan saraf tepi");
        values.put("pil_d", "Otak dan saraf otonom");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "9.\tBerdasrkan fungsinya, saraf dibedakan menjadi sensorik, motorik, dan konektor. Dibawah ini yang yangbenar sesuai fungsinya yaitu….");
        values.put("pil_a", "motoris membawa impuls dari saraf pusat ke efektor");
        values.put("pil_b", "konektor membawa impuls dari reseptor ke efektor");
        values.put("pil_c", "sensoris membawa impuls dari reseptor ke pusat saraf");
        values.put("pil_d", "motoris membawa impuls dari saraf pusat ke efektor.");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "10.\tDi bawah ini merupakan beberapa sistem organ yang ada dalam tubuh manusia:\n" +
                "1) Sistem saraf\n" +
                "2) Sistem peredaran darah\n" +
                "3) Sistem indera\n" +
                "4) Sistem hormon\n" +
                "Yang termasuk dalam sistem koordinasi ditunjukkan pada nomor ...\n");
        values.put("pil_a", "1, 2, 3, 4");
        values.put("pil_b", "1, 2, 3");
        values.put("pil_c", "2, 3, 4");
        values.put("pil_d", "1, 3, 4");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "11.\tPerhatikan gambar struktur sel saraf di samping ini!\nAkson, dendrit, dan badan sel ditunjukkan pada nomor…");
        values.put("pil_a", "3, 4 dan 2");
        values.put("pil_b", "1, 2, dan 3");
        values.put("pil_c", "3, 1, dan 2");
        values.put("pil_d", "3, 2, dan 1");
        values.put("jwban", "2");
        values.put("img", R.drawable.soal_saraf);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "12.\tYang menghubungkan otak dengan sumsum tulang belakang");
        values.put("pil_a", "jembatan varol");
        values.put("pil_b", "Medula oblongata");
        values.put("pil_c", "otak kecil");
        values.put("pil_d", "Hipotalamus");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "13.\tNeuron yang berfungsi mengantarkan impuls saraf dari alat indera menuju ke otak atau sumsum tulang belakang dinamakan ...");
        values.put("pil_a", "neuron unipolar");
        values.put("pil_b", "neuron bipolar");
        values.put("pil_c", "neuron konektor");
        values.put("pil_d", "neuron sensorik");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "14.\tApabila proses gerak yang diatur oleh system saraf disadari, maka impuls akan menempuh jalan …");
        values.put("pil_a", "reseptor - neuron sensorik - neuron konektor - otak - efektor");
        values.put("pil_b", "reseptor - neuron motorik - sumsum tulang belakang - efektor");
        values.put("pil_c", "reseptor - neuron motorik - otak - neuron sensorik - efektor");
        values.put("pil_d", "reseptor - neuron sensorik - otak - neuron motorik - efektor");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "15.\tFungsi susunan saraf simpatetik yaitu…..");
        values.put("pil_a", "mempersempit pembuluh darah, memperlambat denyut jantung");
        values.put("pil_b", "mengurangi tekanan darah, mempercepat denyut jantung");
        values.put("pil_c", "mempertinggi tekanan darah, mempercepat denyut jantung");
        values.put("pil_d", "memperbesar pembuluh darah, memperlambat denyut jantung");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "16.\tSel saraf yang menghubungkan sel saraf sensori dengan sel saraf motor yaitu sel saraf…..");
        values.put("pil_a", "adjustor");
        values.put("pil_b", "sensori");
        values.put("pil_c", "motor");
        values.put("pil_d", "konektor");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "17.\tbagian yang berperan dalam refleks mata membuat pergerakan mata, mengangkat kelopak mata, memutar mata, pusat pergerakan mata serta kontraksi otot yang terus-menerus adalah");
        values.put("pil_a", "Otak tengah");
        values.put("pil_b", "Otak depan");
        values.put("pil_c", "Otak kecil");
        values.put("pil_d", "Otak besar");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "18.\tOtak bagian depan tediri dari talamus dan hipotalamus fungsi dari hipotalamus");
        values.put("pil_a", "mengatur suhu tubuh,kadar air dalam tubuh, kegiatan reproduksi,tekanan darah");
        values.put("pil_b", "menerima semua rangsangan yang berasal dari reseptor (kecuali bau");
        values.put("pil_c", "mengoordinasikan kerja otot");
        values.put("pil_d", "menghubungkan otak kecil bagian kiri dan kanan");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "19.\tperadangan di bagian selaput otak yang disebabkan oleh bakteri atau virus");
        values.put("pil_a", "Neoritis");
        values.put("pil_b", "Meningitis");
        values.put("pil_c", "Parkinson");
        values.put("pil_d", "Hidrosefalus");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "20.\tGeger otak merupakan akibat dari");
        values.put("pil_a", "a.\tkerusakan otak akibat tersumbatnya atau pecahnya pembuluh darah otak");
        values.put("pil_b", "b.\tdegenerasi sel saraf pada sistem saraf pusat");
        values.put("pil_c", "c.\tgangguan pada otak akibat benturan pada kepala");
        values.put("pil_d", "d.\tkelebihan cairan cerebrospinal di otak yang menyebabkan pembesaran kepala.");
        values.put("jwban", "2");
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
