package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter.MultiTypeAdapter;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.NormalItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.OneItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.TwoItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.Visitable;
import com.example.jun.MultiTypeAdapter.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewWithMultiTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview_layout);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Visitable> list = getData();

        recyclerView.setAdapter(new MultiTypeAdapter(list));

    }

    private List<Visitable> getData(){
        List<Visitable> models = new ArrayList<>();

        for (int index = 0; index < 50; index++ ){
            if (index % 3 == 1){
                models.add(new OneItem("Type one "+ index));
            } else if (index % 3 == 2){
                models.add(new TwoItem("Type two "+ index));
            } else {
                models.add(new NormalItem("Type normal "+ index));
            }
        }

        return models;
    }
}
