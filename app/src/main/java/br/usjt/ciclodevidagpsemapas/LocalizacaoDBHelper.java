/**
 * Uriel Henrique Marques Farias Mishima RA: 81717300
 */
package br.usjt.ciclodevidagpsemapas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*Lucas Do Vale Conceição
RA:817116816
 */

public class LocalizacaoDBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "localizacao1.db";
    private static final int DB_VERSION = 1;

    public LocalizacaoDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         db.execSQL(LocalizacaoContract.createTableLocalizacao());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {

    }
}
