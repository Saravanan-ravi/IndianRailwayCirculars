package com.example.indianrailwaycirculars;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //OUR VIEWS

    TextView subjectTxt,numTxt,dateTxt;
    ImageButton share;
    ImageView fav_ibtn;
    RecyclerView circular;

    ItemClickListener itemClickListener;


    public MyHolder(View itemView) {
        super(itemView);


        this.subjectTxt= (TextView) itemView.findViewById(R.id.cirName);
        this.numTxt= (TextView) itemView.findViewById(R.id.cirNum);
        this.dateTxt=(TextView) itemView.findViewById(R.id.tvDate);
        this.share = (ImageButton) itemView.findViewById(R.id.btnShare);
        this.circular = (RecyclerView) itemView.findViewById(R.id.reyView);


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }


}
