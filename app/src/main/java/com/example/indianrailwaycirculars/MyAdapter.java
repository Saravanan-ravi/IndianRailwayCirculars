package com.example.indianrailwaycirculars;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;



public class MyAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable{
    Context c;
    ArrayList<Player> players,filterList;
    CustomFilter filter;


    public MyAdapter(Context ctx,ArrayList<Player> players)
    {
        this.c=ctx;
        this.players=players;
        this.filterList=players;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //CONVERT XML TO VIEW ONBJ
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row,null);

        //HOLDER
        MyHolder holder=new MyHolder(v);

        return holder;
    }

    //DATA BOUND TO VIEWS
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        //BIND DATA
        holder.numTxt.setText(players.get(position).getcNum());
        holder.dateTxt.setText(players.get(position).getcDate());
        holder.subjectTxt.setText(players.get(position).getcSubject());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse((players.get(position).getcLink())));
                c.startActivity(intent);

            }
        });


        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "The Circular:"
                        + players.get(position).getcSubject() +
                        "\nClick to view " + players.get(position).getcLink());
                intent.setType("text/plain");
                c.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });

    }

    //GET TOTAL NUM OF PLAYERS
    @Override
    public int getItemCount() {
        return players.size();
    }

    //RETURN FILTER OBJ
    @Override
    public Filter getFilter() {
        if(filter==null)
        {
            filter=new CustomFilter(filterList,this);
        }

        return filter;
    }

}
