package com.material.lineteachin3;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.BaseHelper;

public class Estudiante extends AppCompatActivity {

    Button GuardarUsuario,MostrarListas;
    EditText txtNom,txtApelli,txtNiv,txtClav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        MostrarListas = (Button)findViewById(R.id.btnMostrar);
        GuardarUsuario =(Button)findViewById(R.id.btnGuardar);
        txtNom = (EditText)findViewById(R.id.txtNombre);
        txtApelli = (EditText)findViewById(R.id.txtApellidos);
        txtClav = (EditText)findViewById(R.id.txtClave);


        GuardarUsuario.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
              guardar(txtNom.getText().toString(),txtApelli.getText().toString(),txtClav.getText().toString());
             }
         });
        MostrarListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten = new Intent(getApplicationContext(),Detalle_Registro.class);
                startActivity(inten);

            }
        });



    }
    private void guardar( String Nombre, String Apellido, String Clave){
        BaseHelper helper = new BaseHelper(this,"db1",null,1);
        SQLiteDatabase db = helper.getWritableDatabase();

        try {
             ContentValues con = new ContentValues();
             con.put("Nombre",Nombre);
             con.put("Apellido",Apellido);
             con.put("Clave",Clave);
             db.insert("Estudiante",null, con);
             db.close();
             Toast.makeText(this,"Se ha Guardado Exitosamente Felicidades ya Guarda jjj !!!",
                     Toast.LENGTH_LONG).show();

        }catch (Exception q){

            Toast.makeText(this,"ERROR LLAMAR 123 POR FAVOR"+ q.getMessage(),Toast.LENGTH_LONG).show();
        }


    }
}
