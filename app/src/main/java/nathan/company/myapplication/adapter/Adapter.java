package nathan.company.myapplication.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

import nathan.company.myapplication.R;
import nathan.company.myapplication.model.Filmes;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolden> {
List<Filmes> list;

    public Adapter(List<Filmes> listaFilmes) {
        this.list= listaFilmes;

    }

    @NonNull
    @Override
    public MyViewHolden onCreateViewHolder( ViewGroup viewGroup, int i) {

        View itenLIsta= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lista, viewGroup,false);


        return new MyViewHolden(itenLIsta);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolden myViewHolden, int i) {

Filmes filmes= list.get(i);


        myViewHolden.titulo.setText(filmes.getTituloFilme());
        myViewHolden.ano.setText(filmes.getAnoFilme());
myViewHolden.genero.setText(filmes.getGeneroFilme());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolden extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolden( View itemView) {

            super(itemView);

            titulo= itemView.findViewById(R.id.idTitulo);
            ano=itemView.findViewById(R.id.idAno);
            genero=itemView.findViewById(R.id.idGenero);
        }
    }
}
