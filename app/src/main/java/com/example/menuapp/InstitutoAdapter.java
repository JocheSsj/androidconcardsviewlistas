
package com.example.menuapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class  InstitutoAdapter extends RecyclerView.Adapter< InstitutoAdapter.ViewHolder> {

    private List<Institutos> institutos;

    public  InstitutoAdapter (List<Institutos> institutos) {
        this.institutos = institutos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_instituto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Institutos instituto = institutos.get(position);
        holder.tvNombre.setText(instituto.getNombre());
        holder.tvDireccion.setText(instituto.getDireccion());
        holder.tvTipo.setText(instituto.getTipo());
        holder.tvDescripcion.setText(instituto.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return institutos.size();
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
