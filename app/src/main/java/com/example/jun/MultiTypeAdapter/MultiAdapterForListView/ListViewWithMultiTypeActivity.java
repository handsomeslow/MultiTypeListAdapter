package com.example.jun.MultiTypeAdapter.MultiAdapterForListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Adapter.MultiTypeAdapter;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.NormalItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.OneItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.TwoItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.Visitable2;
import com.example.jun.MultiTypeAdapter.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewWithMultiTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_layout);

        ListView listView = (ListView) findViewById(R.id.list_view2);
        listView.setAdapter(new MultiTypeAdapter(getData()));
    }

    private List<Visitable2> getData(){
        List<Visitable2> models = new ArrayList<>();

        for (int index = 0; index < 50; index++ ){
            if (index % 3 == 1){
                models.add(new OneItem2("Type one "+ index));
            } else if (index % 3 == 2){
                models.add(new TwoItem2("Type two "+ index));
            } else {
                models.add(new NormalItem2("Type normal "+ index));
            }
        }

        return models;
    }
}
