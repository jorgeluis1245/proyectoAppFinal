package com.material.lineteachin3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Profesor extends Fragment {
    private RecyclerView recyclerViewProfesor;
    private RecyclerViewAdaptador AdaptadorProfesor;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profesor, container, false);
        return v;

       /* recyclerViewProfesor = (RecyclerView)v.findViewById(R.id.recyclerProfesor);

        recyclerViewProfesor.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdaptadorProfesor = new RecyclerViewAdaptador(obtner_profesores());
        recyclerViewProfesor.setAdapter(AdaptadorProfesor);*/

    }
      public  void llamar_lista(View view){


          try{
          Intent mg = new Intent(getActivity(),Mostrarlista.class);
          getActivity().startActivity(mg);
          }catch (Exception a){


          }

      }


}


