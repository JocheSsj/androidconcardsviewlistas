
package com.example.menuapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class  ColegiosAdapter extends RecyclerView.Adapter< ColegiosAdapter.ViewHolder> {

    private List<Colegios> colegios;

    public ColegiosAdapter (List<Colegios> colegios) {
        this.colegios = colegios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_colegios, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Colegios colegio = colegios.get(position);
        holder.tvNombre.setText(colegio.getNombre());
        holder.tvDireccion.setText(colegio.getDireccion());
        holder.tvTipo.setText(colegio.getTipo());
        holder.tvDescripcion.setText(colegio.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return colegios.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvDireccion, tvTipo, tvDescripcion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvDireccion = itemView.findViewById(R.id.tvDireccion);
            tvTipo = itemView.findViewById(R.id.tvTipo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }
}
