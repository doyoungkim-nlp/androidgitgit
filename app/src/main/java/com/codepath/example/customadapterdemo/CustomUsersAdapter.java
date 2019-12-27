package com.codepath.example.customadapterdemo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
//어댑터: arraylist(우리가 가지고 있는 이름-전화번호 리스트)와 listview(어떤 유저 객체를 ui에 표시하는것)사이에 연관성을 만들어주는 것
//java 객체->view로 만들어준다(getview()함수 덕분에)
public class CustomUsersAdapter extends ArrayAdapter<User> {
    public CustomUsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

         // Get the data item for this position
         User user = getItem(position);

         // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
        tvPhone.setText(user.getPhone());
        // Return the completed view to render on screen
        return convertView;
    }
}
