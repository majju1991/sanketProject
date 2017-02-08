package com.example.pikachu.ghanto;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pikachu on 02/07/17.
 */

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.MyViewHolder> {
    String[] persons;
    int[] images;

    public AdapterOne(String[]persons, int[] images){
        this.images = images;
        this.persons = persons;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(persons[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return persons.length;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.row_textview);
            imageView = (ImageView) itemView.findViewById(R.id.row_imageview);
        }


    }
}
