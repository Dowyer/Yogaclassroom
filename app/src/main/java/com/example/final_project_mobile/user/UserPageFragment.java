package com.example.final_project_mobile.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_project_mobile.AdminDashBoardActivity;
import com.example.final_project_mobile.R;
import com.example.final_project_mobile.adapters.UserAdapter;
import com.example.final_project_mobile.databases.entities.YogaCourse;
import com.example.final_project_mobile.databases.entities.YogaUser;

import java.util.ArrayList;
import java.util.List;


public class UserPageFragment extends Fragment {
 private View myView;
 private RecyclerView rv_user;
 private AdminDashBoardActivity adminDashBoardActivity;
    public UserPageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_user_page, container, false);
        adminDashBoardActivity = (AdminDashBoardActivity) getActivity();
        rv_user = myView.findViewById(R.id.rv_user);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(adminDashBoardActivity);
        linearLayoutManager.setReverseLayout(true);
        rv_user.setLayoutManager(linearLayoutManager);
        UserAdapter userAdapter = new UserAdapter(getUserAdapterList());
        return myView;
    }
    private List<YogaUser> getUserAdapterList(){
        List<YogaCourse> list = new ArrayList<>(;
        list.add(new YogaUser(1,"Long","student","gmail.com","0999","hello")
    }
}