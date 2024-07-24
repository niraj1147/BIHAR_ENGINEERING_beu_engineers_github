package com.example.beuengineers.Syllabus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;
import java.util.List;

public class BranchAdapter extends RecyclerView.Adapter<BranchAdapter.BranchViewHolder> {

    private List<Branch> branchList;
    private Context context;

    public BranchAdapter(List<Branch> branchList, Context context) {
        this.branchList = branchList;
        this.context = context;
    }

    @NonNull
    @Override
    public BranchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_branch, parent, false);
        return new BranchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BranchViewHolder holder, int position) {
        Branch branch = branchList.get(position);
        holder.branchName.setText(branch.getName());

        holder.branchName.setOnClickListener(v -> {
            if (holder.semesterLayout.getVisibility() == View.GONE) {
                holder.semesterLayout.setVisibility(View.VISIBLE);
                holder.semesterLayout.removeAllViews();
                for (Semester semester : branch.getSemesters()) {
                    View semesterView = LayoutInflater.from(context).inflate(R.layout.list_item_semester, null);
                    TextView semesterName = semesterView.findViewById(R.id.semesterName);
                    LinearLayout syllabusLayout = semesterView.findViewById(R.id.syllabusLayout);

                    semesterName.setText(semester.getName());

                    semesterName.setOnClickListener(v1 -> {
                        if (syllabusLayout.getVisibility() == View.GONE) {
                            syllabusLayout.setVisibility(View.VISIBLE);
                            syllabusLayout.removeAllViews();
                            for (String syllabus : semester.getSyllabus()) {
                                View syllabusView = LayoutInflater.from(context).inflate(R.layout.list_item_syllabus, null);
                                TextView syllabusText = (TextView) syllabusView;
                                syllabusText.setText(syllabus);
                                syllabusLayout.addView(syllabusView);
                            }
                        } else {
                            syllabusLayout.setVisibility(View.GONE);
                        }
                    });

                    holder.semesterLayout.addView(semesterView);
                }


            } else {
                holder.semesterLayout.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return branchList.size();
    }







    public static class BranchViewHolder extends RecyclerView.ViewHolder {
        TextView branchName;
        LinearLayout semesterLayout;

        public BranchViewHolder(@NonNull View itemView) {
            super(itemView);
            branchName = itemView.findViewById(R.id.branchName);
            semesterLayout = itemView.findViewById(R.id.semesterLayout);
        }
    }
}

