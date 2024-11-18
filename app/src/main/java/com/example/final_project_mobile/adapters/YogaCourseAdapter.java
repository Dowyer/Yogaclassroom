package com.example.final_project_mobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_project_mobile.databases.entities.YogaCourse;
import com.example.final_project_mobile.R;

import java.util.List;

public class YogaCourseAdapter extends RecyclerView.Adapter<YogaCourseAdapter.YogaCourseViewHolder> {
    private List<YogaCourse> yogaCourseList;

    public YogaCourseAdapter(List<YogaCourse> yogaCourseList) {
        this.yogaCourseList = yogaCourseList;
    }

    @NonNull
    @Override
    public YogaCourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_yoga_course,parent,false);
        return new YogaCourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YogaCourseViewHolder holder, int position) {
        YogaCourse yogaCourse = yogaCourseList.get(position);
        if(yogaCourse == null)
            return;
        holder.tv_name_course.setText(yogaCourse.getName());
        holder.tv_type_course.setText(yogaCourse.getType());
        holder.tv_price_course.setText(String.valueOf(yogaCourse.getPrice()));
    }

    @Override
    public int getItemCount() {
        if(yogaCourseList == null) {
            return 0;
        }
        return yogaCourseList.size();
    }

    public static class YogaCourseViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_name_course;
    private TextView tv_type_course;
    private TextView tv_price_course;
        public YogaCourseViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_course = itemView.findViewById(R.id.tv_name_course);
            tv_type_course = itemView.findViewById(R.id.tv_type_course);
            tv_price_course= itemView.findViewById(R.id.tv_price_course);
        }
    }
}
