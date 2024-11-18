package com.example.final_project_mobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_project_mobile.R;
import com.example.final_project_mobile.databases.entities.YogaUser;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<YogaUser> yogaUsersList;
    public UserAdapter(List<YogaUser> yogaUserslist) {
        this.yogaUsersList = yogaUserslist;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        YogaUser yogaUser = yogaUsersList.get(position);
        if(yogaUser == null)
            return;
        holder.tv_name_user.setText(yogaUser.getName());
        holder.tv_role.setText(yogaUser.getRole());
        holder.tv_phone_number.setText(yogaUser.getPhone_number());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name_user;
        private TextView tv_role;
        private TextView tv_phone_number;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_user = itemView.findViewById(R.id.tv_name_user);
            tv_role = itemView.findViewById(R.id.tv_role);
            tv_phone_number = itemView.findViewById(R.id.tv_phone_number);
        }
    }
}
