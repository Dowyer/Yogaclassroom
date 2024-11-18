package com.example.final_project_mobile.yoga_course;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.final_project_mobile.AdminDashBoardActivity;
import com.example.final_project_mobile.adapters.YogaCourseAdapter;
import com.example.final_project_mobile.databases.entities.YogaCourse;
import com.example.final_project_mobile.R;

import java.util.ArrayList;
import java.util.List;


public class YogaCoursePageFragment extends Fragment {
    private View myView;
    private RecyclerView rv_yoga_course;
    private AdminDashBoardActivity adminDashBoardActivity;
    public YogaCoursePageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_yoga_course_page, container, false);
        adminDashBoardActivity = (AdminDashBoardActivity) getActivity();
        rv_yoga_course = myView.findViewById(R.id.rv_yoga_course);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(adminDashBoardActivity);
        linearLayoutManager.setReverseLayout(true);
        rv_yoga_course.setLayoutManager(linearLayoutManager);
        YogaCourseAdapter yogaCourseAdapter = new YogaCourseAdapter(getYogaCourseList());
        rv_yoga_course.setAdapter(yogaCourseAdapter);

        return myView;
    }

    private List<YogaCourse> getYogaCourseList() {
        List<YogaCourse> list = new ArrayList<>();
        list.add(new YogaCourse(1, "JavaScript", "Moday", "7h",6.6,30,"flow",60, ""));
        list.add(new YogaCourse(1, "Javaript", "Mody", "7h",6.6,30,"flow",60, ""));
        return list;
    }
}