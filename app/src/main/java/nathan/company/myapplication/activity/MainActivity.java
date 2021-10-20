package nathan.company.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nathan.company.myapplication.R;
import nathan.company.myapplication.adapter.Adapter;
import nathan.company.myapplication.model.Filmes;
import nathan.company.myapplication.onclik.RecyclerItemClickListener;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filmes> listaFilmes= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView =findViewById(R.id.idRecyclerView);

//listafilmes
this.criarFilmes();



        //adapter
        Adapter adapter =new Adapter(listaFilmes);






        //recycleview
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filmes filmes=listaFilmes.get(position);

    Toast.makeText(getApplicationContext(),"precionado"+ filmes.getTituloFilme(),Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(getApplicationContext(),"precionado longo",Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }


                )
        );

    }


    public void  criarFilmes(){

        Filmes filmes=new Filmes("os danados","2000","comedia");
        this.listaFilmes.add(filmes);
       filmes=new Filmes("os danados1","2001","comedia");
        this.listaFilmes.add(filmes);
      filmes=new Filmes("os danados2","2002","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados3","2003","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados4","2004","comedia");
        this.listaFilmes.add(filmes);
         filmes=new Filmes("os danados5","2005","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados6","2006","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados7","2007","comedia");
        this.listaFilmes.add(filmes);
  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
        filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);  filmes=new Filmes("os danados8","2008","comedia");
        this.listaFilmes.add(filmes);
    }


    public void  testeOnclik(){

        Toast.makeText(getApplicationContext(),"kfkfk",Toast.LENGTH_SHORT).show();
    }


    }


