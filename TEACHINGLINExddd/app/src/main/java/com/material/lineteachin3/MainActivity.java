package com.material.lineteachin3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciar = (Button)findViewById(R.id.Iniciar_Seccion);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciar = new Intent(MainActivity.this,Iniciar_seccion.class);
                startActivity(iniciar);
            }
        });

        Button profesor = (Button)findViewById(R.id.profe);

        profesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profesor = new Intent(MainActivity.this,Teacher.class);
                startActivity(profesor);
            }
        });

         Button estudiante =(Button)findViewById(R.id.Students);

        estudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent estudiante = new Intent(MainActivity.this,Estudiante.class);
                startActivity(estudiante);
            }
        });

        Button btnayuda=(Button)findViewById(R.id.btnayuda);
        btnayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Navegacion.class);
                startActivity(intent);

                }


        });
    }
           public void  oncharki(View view){
               try {


               Uri uri = Uri.parse("htpp://www.facebook.com");
               Intent intent = new Intent(Intent.ACTION_VIEW,uri);
               startActivity(intent);
               }catch (Exception d) {
                   Toast.makeText(this,"No esta disponible Actualmente",Toast.LENGTH_LONG).show();
               }
           }


}
