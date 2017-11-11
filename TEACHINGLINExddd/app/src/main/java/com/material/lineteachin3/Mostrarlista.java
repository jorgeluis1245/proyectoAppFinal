package com.material.lineteachin3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Mostrarlista extends AppCompatActivity {

    private RecyclerView recyclerViewProfesor;
    private RecyclerViewAdaptador recyclerViewAdaptadorProfesor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrarlista);

        recyclerViewProfesor = (RecyclerView)findViewById(R.id.recyclerProfesor);
        recyclerViewProfesor.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewAdaptadorProfesor = new RecyclerViewAdaptador(obternerProfesor());
        recyclerViewProfesor.setAdapter(recyclerViewAdaptadorProfesor);



    }

    public List<Profesor_modelo> obternerProfesor(){
        List<Profesor_modelo> prof = new ArrayList<>();
        prof.add(new Profesor_modelo("Lisbon","Martinez",R.drawable.lisbon));
        prof.add(new Profesor_modelo("Sara","Connor",R.drawable.ab));
        prof.add(new Profesor_modelo("Alexandro","Delpiero",R.drawable.ac));
        prof.add(new Profesor_modelo("Patrick","Jane",R.drawable.path));

        return  prof;
    }


}
