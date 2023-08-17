package com.example.project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class FAQsFragment extends Fragment {

    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_faqs_fragment, container, false);
        searchView=(SearchView) view.findViewById(R.id.searchView);
        listView=(ListView)view.findViewById(R.id.listView);

        list=new ArrayList<String>();
        list.add("How much does a carpenter cost?");
        list.add("What time does plumber provides services?");
        list.add("How can I hire maid on monthly basis?");
        list.add("How much does a carpenter cost?");
        list.add("What time does plumber provides services?");
        list.add("How can I hire maid on monthly basis?");


        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return view;
    }
}
