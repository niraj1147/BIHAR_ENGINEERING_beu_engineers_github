package com.example.beuengineers.collegepredictordata.rank;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;
import java.util.List;

public class RankAdapter extends RecyclerView.Adapter<RankAdapter.RankViewHolder> {

    private List<RankData> rankDataList;

    public RankAdapter(List<RankData> rankDataList) {
        this.rankDataList = rankDataList;
    }

    @NonNull
    @Override
    public RankViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rank_item, parent, false);
        return new RankViewHolder(view);
    }

//


    @Override
    public void onBindViewHolder(@NonNull RankViewHolder holder, int position) {
        RankData rankData = rankDataList.get(position);
        holder.instituteTextView.setText(rankData.getInstitute());
        holder.programTextView.setText(rankData.getAcademicProgramName());
        holder.quotaTextView.setText(rankData.getQuota());
        holder.seatTypeTextView.setText(rankData.getSeatType());
        holder.genderTextView.setText(rankData.getGender());
        holder.openingRankTextView.setText("Opening Rank: " + rankData.getOpeningRank());
        holder.closingRankTextView.setText("Closing Rank: " + rankData.getClosingRank());
        holder.yearTextView.setText("Year: " + rankData.getYear());
        holder.roundTextView.setText("Round: " + rankData.getRound());
    }




    @Override
    public int getItemCount() {
        return rankDataList.size();
    }

    static class RankViewHolder extends RecyclerView.ViewHolder {
        TextView instituteTextView, programTextView, quotaTextView, seatTypeTextView, genderTextView, openingRankTextView, closingRankTextView, yearTextView, roundTextView;

        public RankViewHolder(@NonNull View itemView) {
            super(itemView);
            instituteTextView = itemView.findViewById(R.id.instituteTextView);
            programTextView = itemView.findViewById(R.id.programTextView);
            quotaTextView = itemView.findViewById(R.id.quotaTextView);
            seatTypeTextView = itemView.findViewById(R.id.seatTypeTextView);
            genderTextView = itemView.findViewById(R.id.genderTextView);
            openingRankTextView = itemView.findViewById(R.id.openingRankTextView);
            closingRankTextView = itemView.findViewById(R.id.closingRankTextView);
            yearTextView = itemView.findViewById(R.id.yearTextView);
            roundTextView = itemView.findViewById(R.id.roundTextView);
        }
    }
}

