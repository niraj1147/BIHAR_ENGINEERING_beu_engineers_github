package com.example.beuengineers.Recyclernotes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<Model> chapterList;

    public Adapter(Context context, ArrayList<Model> chapterList) {
        this.context = context;
        this.chapterList = chapterList;
    }

    public void setFilteredList(java.util.List<Model> filteredList) {

        this.chapterList = (ArrayList<Model>) filteredList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       // LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(context).inflate(R.layout.itemnotes,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        Model model = chapterList.get(position);
        holder.chapter.setText(model.getChapter());

        holder.itemView.setOnClickListener(v -> {

            Intent intent=new Intent(context, DetailsActivity.class);
            intent.putExtra("chapter",model.getChapter());
            intent.putExtra("pdfLink",model.getPdfLink());

            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return chapterList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView chapter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chapter=itemView.findViewById(R.id.chapter);
        }
    }
}
