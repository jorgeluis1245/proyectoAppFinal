package com.material.lineteachin3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import OpenHelper.BaseHelper;

public class Detalle_Registro extends AppCompatActivity {
    ListView listView;
    ArrayList <String> listando;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__registro);
        listView  = (ListView)findViewById(R.id.lista);

        cargandoListado();

        if(getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    private void  cargandoListado () {
        listando = ListaEstudiantes();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listando );
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home ) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private ArrayList<String>ListaEstudiantes() {
        ArrayList<String> datos = new ArrayList<String>();
        BaseHelper helper = new BaseHelper(this,"db1",null,1);
        SQLiteDatabase db = helper.getReadableDatabase();
        String sql = "select Id,Nombre,Apellido from Estudiante";
        Cursor cursor = db.rawQuery(sql,null);

        if (cursor.moveToFirst()){

            do {
                 String linea = cursor.getInt(0)+" "+ cursor.getString(1)+" "+cursor.getString(2);
                 datos.add(linea);

               }while (cursor.moveToNext());
        }
        db.close();
        return datos;
    }


}
