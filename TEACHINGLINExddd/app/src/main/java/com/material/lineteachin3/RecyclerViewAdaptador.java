package com.material.lineteachin3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 17/10/2017.
 */

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder >{


       public static class ViewHolder extends RecyclerView.ViewHolder{
         private TextView nombre,apellido;
           ImageView fotoprofesor;

           public ViewHolder(View itemView) {
               super(itemView);

               nombre = (TextView)itemView.findViewById(R.id.tvProfesor);
               apellido =(TextView)itemView.findViewById(R.id.tvApellido);
               fotoprofesor = (ImageView)itemView.findViewById(R.id.img_Profesor);
           }
       }

       public List < Profesor_modelo> profesor_modelo;

    public RecyclerViewAdaptador(List<Profesor_modelo> profesor_modelo) {
        this.profesor_modelo = profesor_modelo;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profesor,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(profesor_modelo.get(position).getNombre());
        holder.apellido.setText(profesor_modelo.get(position).getApellido());
        holder.fotoprofesor.setImageResource(profesor_modelo.get(position).getImgProfesor());
    }

    @Override
    public int getItemCount() {

        return profesor_modelo.size();
    }
}
