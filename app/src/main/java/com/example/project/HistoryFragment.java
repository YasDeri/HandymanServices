package com.example.project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class HistoryFragment extends Fragment {

    ListView listView;

    String[] name={"Gul Khan", "Raju Memon","Kamta Bai", "Aslam Gujar", "Akram Khan", "Waqar Jutt"};
    String[] job={"Carpenter", "Painter","Maid", "Electrician", "Technician", "Plumber"};
    String[] date={"Date:", "Date:","Date:", "Date:", "Date:", "Date:"};
    String[] datedetails={"15/10/2019", "11/10/2019","10/10/2019", "14/10/2019", "15/09/2019", "15/08/2019"};
    String[] time={"Time ", "Time ","Time ", "Time ", "Time ", "Time "};
    String[] timedetails={"12:00 pm", "2:00 pm","1:00 pm", "3:00 pm", "2:00 pm", "12:00 pm"};
    String[] rate={"Total Bill Paid:", "Total Bill Paid:","Total Bill Paid:", "Total Bill Paid:", "Total Bill Paid:", "Total Bill Paid:"};
    String[] ratedetails={"500 Rs", "800 Rs","700 Rs", "500 Rs", "600 Rs", "700 Rs"};
    Integer [] imgid={R.drawable.profilepic,R.drawable.profilepic,R.drawable.profilepic,R.drawable.profilepic,R.drawable.profilepic,R.drawable.profilepic};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_history_fragment, container, false);
        listView=(ListView)view.findViewById(R.id.history_listview);

        CustomHistoryList CustomHistoryList=new CustomHistoryList(getActivity(),name,job,date,datedetails,time,timedetails,rate,ratedetails,imgid);
        listView.setAdapter(CustomHistoryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent=new Intent(view.getContext(),JobDetails.class);
                    startActivityForResult(intent,0);
                }
            }
        });
        return view;
    }
}
