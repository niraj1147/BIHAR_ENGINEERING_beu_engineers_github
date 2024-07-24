package com.example.beuengineers.Pyq;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.Recyclernotes.DetailsActivity;
import com.example.beuengineers.R;
import com.example.beuengineers.Recyclernotes.Model;

import java.util.ArrayList;

public class PyqAdapter extends RecyclerView.Adapter<PyqAdapter.ViewHolder> {



    Context context;
    ArrayList<Model> chapterListPyq;

    public PyqAdapter(Context context, ArrayList<Model> chapterListPyq) {
        this.context = context;
        this.chapterListPyq = chapterListPyq;
    }

    public void setFilteredList(java.util.List<Model> filteredList) {

        this.chapterListPyq = (ArrayList<Model>) filteredList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public PyqAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(context).inflate(R.layout.itemnotes,parent,false);
        return new PyqAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = chapterListPyq.get(position);
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
        return chapterListPyq.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView chapter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chapter=itemView.findViewById(R.id.chapter);
        }
    }


}
