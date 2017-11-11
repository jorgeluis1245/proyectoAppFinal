package com.material.lineteachin3;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.BaseHelper;

public class Iniciar_seccion extends AppCompatActivity {

    BaseHelper helper = new BaseHelper(this,"BD1",null,1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_seccion);

        Button men = (Button)findViewById(R.id.btnllamar_menu);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtname = (EditText)findViewById(R.id.txtNombre);
                EditText txtclave = (EditText)findViewById(R.id.txtClave);

                try {
                    Cursor cursor = helper.VerificarUsuario(txtname.getText().toString(),txtclave.getText().toString());
                    if (cursor.getCount()>0) {
                        Toast.makeText(getApplicationContext(),"Has ingresado al menu principal ",Toast.LENGTH_LONG).show();
                        Intent menn = new Intent(getApplicationContext(),Main2Activity.class);
                         startActivity(menn);
                    }else {
                        Toast.makeText(getApplicationContext(),"nombre y/o usuario incorrectos ",Toast.LENGTH_LONG).show();
                    }
                    txtname.setText("");
                    txtclave.setText("");
                    txtname.findFocus();
                  } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"ERROR en la clave o usuario  ",Toast.LENGTH_LONG).show();
                   Intent menn = new Intent(getApplicationContext(),Main2Activity.class);
                   startActivity(menn);
                }

            }
        });




    }
}
