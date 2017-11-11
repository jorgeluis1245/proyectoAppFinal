package OpenHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 09/11/2017.
 */

public class BaseHelper extends SQLiteOpenHelper {

    String tabla = "CREATE TABLE Estudiante(ID INTEGER PRIMARY KEY,NOMBRE TEXT,APELLIDO TEXT,CLAVE TEXT)";
    public BaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLA Estudiante ");
        db.execSQL(tabla);
    }
    //Metodo que permite validar si el usuario Exite
    public Cursor VerificarUsuario (String usu , String  pas )throws Exception   {

        Cursor mcursor = null;
        mcursor = this.getReadableDatabase().query("Estudiante",new String[]{"ID","NOMBRE","APELLIDO","CLAVE"},"NOMBRE Like '"+usu+"'and CLAVE Like '"+pas+"'",null,null,null,null );
        return mcursor;

    }
}
